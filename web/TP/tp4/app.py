import datetime

from flask import Flask, request, render_template, redirect, flash

liste_etudiants = [
    {'id': 1, 'nom': 'tom', 'groupe': 'A1'},
    {'id': 2, 'nom': 'enzo', 'groupe': 'A1'},
    {'id': 3, 'nom': 'laurence', 'groupe': 'A2'},
    {'id': 4, 'nom': 'theo', 'groupe': 'A2'},
    {'id': 5, 'nom': 'mehdi', 'groupe': 'B1'}
]

liste_groupes = [
    {'id': 1, 'name': 'A1'},
    {'id': 1, 'name': 'A2'},
    {'id': 1, 'name': 'B1'},
    {'id': 1, 'name': 'B2'},
    {'id': 1, 'name': 'C1'},
    {'id': 1, 'name': 'C2'},
]

app = Flask(__name__)
app.secret_key = 'une_cle_secrete'


@app.route('/')
def show_etudiants():
    return render_template('etudiant/show_etudiant.html', etudiants=liste_etudiants)


@app.route('/etudiant/add', methods=['GET'])
def add_etudiant():
    return render_template('etudiant/add_etudiant.html', groupes=liste_groupes)


@app.route('/etudiant/delete')
def delete_etudiant():
    id = request.args.get('id')
    message = 'Suppression de l\'étudiant d\'identifiant :' + str(id)
    flash(message, 'is-danger')
    return redirect('/')


@app.route('/etudiant/edit', methods=['GET'])
def edit_etudiant():
    id = request.args.get('id')
    if id != None and id.isnumeric():
        indice = int(id)
        etudiant = liste_etudiants[indice - 1]
    else:
        etudiant = []
    return render_template('etudiant/edit_etudiant.html', etudiant=etudiant, groupes=liste_groupes)


@app.route('/etudiant/add', methods=['POST'])
def valid_add_etudiant():
    nom = request.form.get('nom', 'None nom')
    id_groupe = request.form.get('id_groupe', 'None id_groupe')
    message = 'Ajout d\'un étudiant de nom :' + str(nom) + ' - id_groupe :' + str(id_groupe)
    flash(message, 'is-success')
    return redirect('/')


@app.route('/etudiant/edit', methods=['POST'])
def valid_edit_etudiant():
    id = request.form.get('id', 'None id')
    nom = request.form.get('nom', 'None nom')
    id_groupe = request.form.get('id_groupe', 'None id_groupe')
    message = 'Modification du nom :' + str(nom) + ' - id_groupe :' + str(id_groupe) + ' pour l\'étudiant d\'identifiant :' + str(id)
    flash(message, 'is-success')
    return redirect('/')


if __name__ == '__main__':
    app.run()
