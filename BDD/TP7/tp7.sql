USE BDD_dcortina;

DROP TABLE IF EXISTS etudiant ;

DROP TABLE IF EXISTS groupe ;

CREATE TABLE groupe (
    idGroupe INT AUTO_INCREMENT,
    nomGroupe VARCHAR(255),
    PRIMARY KEY (idGroupe)
) ;

CREATE TABLE etudiant (
    noEtudiant INT AUTO_INCREMENT,
    nomEtudiant VARCHAR(255),
    idGroupe INT,
    PRIMARY KEY (noEtudiant),
        CONSTRAINT fk_etudiant_groupe FOREIGN KEY (idGroupe) REFERENCES groupe (idGroupe)
) ;

INSERT INTO groupe VALUES(1,'S1A1');    -- il faudrait mettre NULL pour
INSERT INTO groupe VALUES(2,'S1A2');    -- les valeurs des identifiants
INSERT INTO groupe VALUES(3,'S1B1');    -- (on force les valeurs des identifiants)
INSERT INTO groupe VALUES(4,'S3');

INSERT INTO etudiant VALUES(1,'paul',1);
INSERT INTO etudiant VALUES(2,'pierre',2);
INSERT INTO etudiant VALUES(3,'toto',2);  -- si erreur mettre le groupe à 2 ou 3
INSERT INTO etudiant VALUES(4,'jacques',NULL);

#DELETE FROM groupe WHERE idGroupe=1;

UPDATE groupe SET nomGroupe='1D1' WHERE idGroupe=1;

# Peut-on créer une contrainte de type référentielle entre un champ « clé étrangère » d’une table et un champ d’une autre table qui n'est pas une clé primaire ?
# NON

# Supprimer les 2 mots : “CONSTRAINT fk_etudiant_groupe”, MySQL donne-t-il un nom à cette contrainte ? (vérifier avec la commande SHOW CREATE TABLE etudiant;)

SHOW CREATE TABLE etudiant;

# MySQL donne le nom etudiant_ibfk_1

ALTER TABLE etudiant DROP FOREIGN KEY fk_etudiant_groupe;
SHOW CREATE TABLE etudiant;

ALTER TABLE etudiant ADD FOREIGN KEY (idGroupe) REFERENCES groupe(idGroupe);
SHOW CREATE TABLE etudiant;

# 2 Présentation des jointures

INSERT INTO groupe VALUES(null, 'S2bisA1');

# INNER JOIN = JOIN

SELECT *
FROM etudiant
INNER JOIN groupe ON etudiant.idGroupe = groupe.idGroupe;

SELECT *
FROM etudiant
LEFT JOIN groupe ON etudiant.idGroupe = groupe.idGroupe;

SELECT *
FROM etudiant
RIGHT JOIN groupe ON etudiant.idGroupe = groupe.idGroupe;

SELECT etudiant.nomEtudiant, groupe.nomGroupe
FROM etudiant
RIGHT JOIN groupe ON  etudiant.idGroupe = groupe.idGroupe;

# count(*) : compte le nombre de lignes (pour le regroupement de données)
# count(etudiant.noEtudiant) : applique l’opération (COUNT SUM AVG …) sur la colonne passée en paramètre, les contenus des lignes de la colonne qui ont une valeur null ne sont pas pris en compte dans le calcul


SELECT COUNT(*), groupe.nomGroupe
FROM etudiant
RIGHT JOIN groupe ON etudiant.idGroupe = groupe.idGroupe
GROUP BY groupe.nomGroupe
ORDER BY groupe.nomGroupe;

SELECT COUNT(etudiant.idGroupe), groupe.nomGroupe
FROM etudiant
RIGHT JOIN groupe ON etudiant.idGroupe = groupe.idGroupe
GROUP BY groupe.nomGroupe
ORDER BY groupe.nomGroupe;

SELECT * FROM etudiant;