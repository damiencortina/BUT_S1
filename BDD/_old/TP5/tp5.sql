-- Remarque
-- Les opérateurs de comparaison =   <=   <>…
-- Les opérateurs logiques AND   OR   NOT (expressions)
-- Une colonne comprise entre 2 valeurs nom_colonne BETWEEN 1 AND 30
-- Une chaine de caractères comme …( comparaison ) nom_colonne LIKE '123%'
-- Une colonne est vide nom_colonne IS NULL Utilisation de date “aaaa-mm-jj”
-- Pour trier les colonnes
--     ORDER BY nom_colonne [ASC] « CROISSANT »
--     ORDER BY nom_colonne DESC « DECROISSANT »
-- Sélectionner des résultats non redondants (distincts) SELECT DISTINCT nom_colonne …
-- Quand une colonne appartient à une liste de valeurs (…) WHERE nom_colonne IN ('valeur1', 'valeur2', ...)

-- Remarque
-- ' (apostrophe ou single quote, TOUCHE Alt Gr + 4) sert à entourer une valeur de format alphanumérique.
-- ` (accent grave ou backtick, TOUCHE Alt Gr + 7) sert à entourer les noms des objets de la BDD (base, table, colonne), surtout lorsque ces noms peuvent être mal interprétés par MySQL : Noms en plusieurs mots ; Mots réservés de MySQL.
-- " (guillemet ou double quote, TOUCHE Alt Gr + 3) est une alternative (propre à MySQL) ; elle est déconseillée, car seul ' est normalisé.

-- 2.1 création de la table étudiant
DROP TABLE IF EXISTS Etudiant;

CREATE TABLE Etudiant(
    idEtudiant int AUTO_INCREMENT,
    nom VARCHAR(20),
    adresse VARCHAR(40),
    ville VARCHAR(20),
    code_postal VARCHAR(5),
    telephone VARCHAR(10),
    date_naissance DATE,
    sexe VARCHAR(1),
    boursier VARCHAR(1),
    groupe_id INT,
    semestre_id INT,
    note_ue1 DECIMAL(4,2),
    note_ue2 DECIMAL(4,2),
    PRIMARY KEY(idEtudiant)
);

INSERT INTO Etudiant (idEtudiant, nom, adresse, ville, code_postal, telephone, date_naissance, sexe, boursier, groupe_id, semestre_id, note_ue1, note_ue2) VALUES
(1, 'BERNARD', '1 rue sous bois', 'Belfort', '90000', '0384545401', '2008-01-01', 'F', 'N', 1, 1, '11.50', '10.50'),
(19, 'CHAVEAUX', '5 rue du chasseur', 'Strasbourg', '68000', '0384545419', '2008-01-01', 'H', 'N', 2, 2, '10.50', '9.50'),
(20, 'PRETTOT', '8 rue vilapogo', 'Belfort', '90000', '0384545420', '2008-07-12', 'H', 'O', 2, 2, '12.50', '8.50'),
(7, 'RIOT', '67 rue pasteur', 'Montbeliard', '25200', '0384545407', '2008-06-06', 'H', 'N', 2, 1, '13.50', '12.50'),
(8, 'BOISSENIN', '1 rue sous bois', 'Belfort', '90000', '0384545408', '2008-08-09', 'H', 'O', 2, 1, '15.5', '16.50'),
(2, 'PEQUIGNOT', '2 rue de la liberation', 'Valdoie', '90300', '0384545402', '2007-06-06', 'H', 'O', 1, 1, '17.50', '9.50'),
(3, 'ZILLIOX', '7 rue du verger', 'Bavilliers', '90120', '0384545403', '2007-01-01', 'H', 'N', 1, 1, '11.50','9.25'),
(4, 'MONNIER', '3 rue du boulanger', 'TAILLECOURT', '25400', '0384545404', '2007-02-06', 'H', 'O', 1, 1, '9.50', '15.5'),
(5, 'BRISCHOUX', '5 rue du chasseur', 'Belfort', '90000', '0384545405', '2007-05-25', 'H', 'N', 2, 1, '10', '9.50'),
(6, 'DUVAL', '8 rue vilapogo', 'Bavilliers', '90120', '0384545406', '2007-03-11', 'H', 'O', 2, 1, '13.50', '8.50'),
   (10, 'FAIVRE', '7 rue des vergers  de rioz', 'Valdoie', '90300', '0384545410', '2007-01-05', 'H', 'O', 3, 1, '8.50', '12.50'),
(17, 'DELANOE', '7 rue du verger', 'Valdoie', '90300', '0384545417', '2007-01-01', 'H', 'N', 1, 2, '12.50', '14.50'),
(18, 'BONVALOT', '3 rue du boulanger', 'Belfort', '90000', '0384545418', '2007-01-01', 'H', 'O', 1, 2, '10', '11.50'),
(21, 'COULON', '67 rue pasteur', 'Valdoie', '90300', '0384545421', '2007-01-01', 'H', 'N', 2, 2, '17', '6.5'),
(23, 'KENDE', '2 rue de la liberation', 'Bavilliers', '90120', '0384545423', '2007-05-31', 'H', 'N', 3, 2, '15', '7.5'),
(24, 'KLEIN', '7 rue du verger', 'Montbeliard', '25200', '0384545424', '2007-01-01', 'H', 'N', 3, 2, '13', '15'),
(25, 'VALZER', '3 rue du boulanger', 'Valdoie', '90300', '0384545425', '2007-01-06', 'H', 'O', 3, 2, '11', '10'),
(26, 'PY', '5 rue du chasseur', NULL, '90000', '0384545426', '2007-01-10', 'F', 'N', 3, 2, '12.20', '7.90'),
(27, 'VERNET', '8 rue vilapogo', NULL, '90120', '0384545427', '2007-02-02', 'H', 'O', 4, 3, '10.30', '11.85'),
(28, 'BAILLIT', '67 rue pasteur', NULL, '25200', '0384545428', '2007-01-01', 'H', 'N', 4, 3, '7.90', '15.90'),
(16, 'LUZET', '2 rue de la liberation', 'Belfort', '90000', '0384545416', '2006-01-01', 'H', 'O', 1, 2, '10.25', '9.25'),
  (22, 'VALOT', '1 rue sous bois', '', '90000', '0384545422', '2006-12-12', 'H', 'O', 2, 2, '10', '9.20'),
(29, 'DUPONT', '8 rue vilapogo', '', '90300', '0384545429', '2006-06-06', 'H', 'O', 4, 3, '13.20', '15.50'),
   (11, 'FAIVRE', '3 rue des vergers', 'Cernay', '68000', '0384545411', '2006-01-01', 'F', 'N', 3, 1, '5.6', '12.05'),
(12, 'DUCHENNE', '5 rue du chasseur', 'Belfort', '90000', '0384545412', '2006-01-01', 'F', 'O', 3, 1, '10.4', '11.3'),
(13, 'BOULANGER', '8 rue vilapogo', 'Belfort', '90000', '0384545413', '2006-01-01', 'F', 'N', 1, 2, '13', '9.20'),
   (9, 'FONTAINE-LEGIOT', '2 rue des vergers', 'Mulhouse', '68000', '0384545409', '2005-01-01', 'H', 'N', 3, 1, '11.25', '12'),
(14, 'MOREAU', '67 rue pasteur', 'Belfort', '90000', '0384545414', '2005-06-01', 'H', 'O', 1, 2, '9', '12.50'),
(15, 'RIGOULOT', '1 rue sous bois', 'Valdoie', '90300', '0384545415', '2005-12-12', 'H', 'N', 1, 2, '15', '10.50');

SELECT * FROM Etudiant;

-- 2.2 Requête 1 (expression logique) :

SELECT Etudiant.nom, Etudiant.adresse, Etudiant.semestre_id
FROM Etudiant
WHERE Etudiant.groupe_id = 1 AND Etudiant.ville = 'Belfort';

SELECT Etudiant.nom, Etudiant.groupe_id, Etudiant.boursier
FROM Etudiant
WHERE Etudiant.groupe_id = 1 AND Etudiant.semestre_id = 1 AND Etudiant.boursier = 'O';