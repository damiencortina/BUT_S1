USE BDD_dcortina;

DROP TABLE IF EXISTS produit;
DROP TABLE IF EXISTS categorie;
-- Exercice 2

-- Question 2.1
CREATE TABLE produit(
   id_produit INT AUTO_INCREMENT,
   nom VARCHAR(20),
   categorie VARCHAR(20),
   code VARCHAR(5), -- permet de conserver le 0 avant
   prix DECIMAL(7,2),
   date_achat DATE,
   PRIMARY KEY(id_produit)
);

-- Question 2.2
INSERT INTO produit (nom, categorie, code, prix, date_achat)
VALUES ('pommes', 'fruits', 01002, 4.5, '2021-10-1');

INSERT INTO produit (nom, categorie, code, prix, date_achat)
VALUES ('poire', 'fruits', 01008, 4, '2021-10-1');

INSERT INTO produit (nom, categorie, code, prix, date_achat)
VALUES ('potiron', 'légumes', 02018, 3, '2021-09-21');

INSERT INTO produit
VALUES (NULL, 'haricots', 'légumes', 02089, 18, '2021-10-2');

INSERT INTO produit
VALUES (NULL, 'cerises', 'fruits', 01068, 15, '2021-09-30');

INSERT INTO produit
VALUES (NULL, 'patates', 'légumes', 02068, 3, '2021-09-30');

-- Exercice 3.1

-- Question 3.1.1
SELECT * FROM produit ;

-- Question 3.1.2 (Requete 1)
SELECT nom FROM produit WHERE prix > 10;

-- Question 3.1.3 (Requete 2 V1)
SELECT nom, prix FROM produit WHERE prix BETWEEN 10 AND 15;

-- Question 3.1.3 (Requete 2 V2)
SELECT nom, prix FROM produit WHERE prix >= 10 AND prix <= 15;

-- Question 3.1.4 (Requete 3)
SELECT nom FROM produit WHERE categorie = 'légumes';

-- Exercice 3.2

-- Requete 4
-- Suppression de la ligne d'identifiant 2
DELETE FROM produit WHERE id_produit = 2;
SELECT * FROM produit ;
-- Recréation de la ligne
INSERT INTO produit (nom, categorie, code, prix, date_achat)
VALUES ('poire', 'fruits', 01008, 4, '2021-10-1');
SELECT * FROM produit ;
-- Conclusion : les numéros automatiques sont incrémentaux à partir du numero le plus élevé existant

-- Exercice 3.3

-- Requete 5
UPDATE produit SET nom='pomme de terre', prix=3.5 WHERE id_produit=6;
UPDATE produit SET prix=prix+1 WHERE id_produit=5;
SELECT * FROM produit;

-- Requete 6
UPDATE produit SET date_achat=DATE_ADD(date_achat,INTERVAL 1 WEEK);
SELECT * FROM produit;

-- 4

-- Requete 7
ALTER TABLE produit ADD quantite DECIMAL(7,2) AFTER code;
SELECT * FROM produit;

-- Requete 8
ALTER TABLE produit DROP COLUMN code;
SELECT * FROM produit;

-- Requete 9
ALTER TABLE produit MODIFY prix DECIMAL(19,4);
SELECT * FROM produit;

-- 5

-- Requete 10
INSERT INTO produit
VALUES (NULL, 'tomate', 'LEGUMES', 5, 4, '2021-09-30');
INSERT INTO produit
VALUES (NULL, 'salade verte', 'legumes', 5, 1.5, '2021-09-30');
INSERT INTO produit
VALUES (NULL, 'radis noir', 'Légumes', 5, 3.5, '2021-09-30');
SELECT * FROM produit;

-- Requete 11
SELECT * FROM produit WHERE categorie='légumes';
-- Conclusion : Insensible à la casse

-- Requete 12
ALTER TABLE produit ADD categorie_id INT AFTER categorie;
SELECT * FROM produit;

-- Requete 13
CREATE TABLE categorie(
    id_categorie INT AUTO_INCREMENT,
    libelle_categorie VARCHAR(20),
    PRIMARY KEY(id_categorie)
);

INSERT INTO categorie (libelle_categorie) VALUES
    ('légumes'),
    ('fruits');

-- Requete 14
ALTER TABLE produit
    ADD CONSTRAINT fk_categorie_id
    FOREIGN KEY (categorie_id)
    REFERENCES categorie(id_categorie);

SELECT * FROM produit;

-- Requete 15
UPDATE produit SET produit.categorie_id = (
    SELECT categorie.id_categorie FROM categorie WHERE categorie.libelle_categorie = produit.categorie
);
ALTER TABLE produit DROP COLUMN categorie;
SELECT * FROM produit;