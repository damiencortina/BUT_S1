import datetime

from flask import Flask, request, render_template, redirect, flash

app = Flask(__name__)
app.config["TEMPLATES_AUTO_RELOAD"] = True
app.secret_key = 'une cle(token) : grain de sel(any random string)'

from flask import session, g
import pymysql.cursors

def get_db():
    if 'db' not in g:
        g.db =  pymysql.connect(
            host="localhost",  # localhost sur les machines perso.
            user="damien",
            password="password",
            database="etudiant",
            charset='utf8mb4',  # 2 attributs à ajouter
            cursorclass=pymysql.cursors.DictCursor  # 2 attributs à ajouter
        )
    return g.db

@app.teardown_appcontext
def teardown_db(exception):
    db = g.pop('db', None)
    if db is not None:
        db.close()


@app.route('/')
def show_etudiants():
    mycursor = get_db().cursor()
    sql = ''' 
        SELECT etudiant.id_etudiant AS id
        , etudiant.nom_etudiant AS nom
        , etudiant.groupe_etudiant_id
        , groupe.libelle_groupe AS groupe
        FROM etudiant
        INNER JOIN groupe ON groupe.id_groupe = etudiant.groupe_etudiant_id
        ORDER BY etudiant.nom_etudiant;
    '''
    mycursor.execute(sql)
    return render_template('etudiant/show_etudiant.html', etudiants=mycursor.fetchall())


@app.route('/etudiant/add', methods=['GET'])
def add_etudiant():
    mycursor = get_db().cursor()
    sql = ''' 
        SELECT id_groupe AS id, libelle_groupe AS name
        FROM groupe
        ORDER BY libelle_groupe;
    '''
    mycursor.execute(sql)
    return render_template('etudiant/add_etudiant.html', groupes=mycursor.fetchall())


@app.route('/etudiant/delete')
def delete_etudiant():
    id = request.args.get('id')
    mycursor = get_db().cursor()
    sql = ''' 
                DELETE FROM etudiant WHERE id_etudiant=%s;
            '''
    mycursor.execute(sql, (id))
    get_db().commit()
    message = 'Suppression de l\'étudiant d\'identifiant :' + str(id)
    flash(message, 'is-danger')
    return redirect('/')



@app.route('/etudiant/edit', methods=['GET'])
def edit_etudiant():
    id = request.args.get('id')
    mycursor = get_db().cursor()
    if id != None and id.isnumeric():
        indice = int(id)
        sql = ''' 
                SELECT etudiant.id_etudiant AS id
                     , etudiant.nom_etudiant AS nom
                     , etudiant.groupe_etudiant_id AS groupe_id
                FROM etudiant
                WHERE id_etudiant = %s;
            '''
        mycursor.execute(sql,(indice))
    mycursor2 = get_db().cursor()
    groupe_sql = ''' 
            SELECT id_groupe AS id, libelle_groupe AS name
            FROM groupe
            ORDER BY libelle_groupe;
        '''
    mycursor2.execute(groupe_sql)
    return render_template('etudiant/edit_etudiant.html', etudiant=mycursor.fetchone(), groupes=mycursor2.fetchall())


@app.route('/etudiant/add', methods=['POST'])
def valid_add_etudiant():
    nom = request.form.get('nom', 'None nom')
    id_groupe = request.form.get('id_groupe', 'None id_groupe')
    message = 'Ajout d\'un étudiant de nom :' + str(nom) + ' - id_groupe :' + str(id_groupe)
    flash(message, 'is-success')
    mycursor = get_db().cursor()
    sql = ''' 
            INSERT
            INTO
            etudiant(id_etudiant, nom_etudiant, groupe_etudiant_id)
            VALUES(NULL, %s, %s);
        '''
    mycursor.execute(sql, (nom, id_groupe))
    get_db().commit()
    return redirect('/')


@app.route('/etudiant/edit', methods=['POST'])
def valid_edit_etudiant():
    id = request.form.get('id', 'None id')
    nom = request.form.get('nom', 'None nom')
    id_groupe = request.form.get('id_groupe', 'None id_groupe')
    message = 'Modification du nom :' + str(nom) + ' - id_groupe :' + str(id_groupe) + ' pour l\'étudiant d\'identifiant :' + str(id)
    flash(message, 'is-success')
    mycursor = get_db().cursor()
    sql = ''' 
                UPDATE etudiant SET nom_etudiant = %s, groupe_etudiant_id = %s WHERE id_etudiant=%s;
            '''
    mycursor.execute(sql, (nom, id_groupe, id))
    get_db().commit()
    return redirect('/')


if __name__ == '__main__':
    app.run()
