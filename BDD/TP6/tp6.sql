USE BDD_dcortina;

# Requète 1.1
SELECT nom, note_ue1 , note_ue1*2 AS note_ue1_sur_40
FROM Etudiant
WHERE note_ue1 >= 14
ORDER BY note_ue1;

SELECT nom, groupe_id, note_ue1 , (note_ue1 + note_ue2)/2 AS moyenne
FROM Etudiant
WHERE note_ue1 >= 14
ORDER BY groupe_id DESC , moyenne DESC;

# Requète 1.2
SELECT nom, groupe_id, note_ue1 , (note_ue1 + note_ue2)/2 AS moyenne
FROM Etudiant
HAVING moyenne >= 13
ORDER BY moyenne, groupe_id;


# Requète 2
SELECT CONCAT('année :',YEAR(NOW())) ;
SELECT CONCAT('année :',YEAR(NOW()))  AS TEST;
SELECT CONCAT('mois :',MONTH(NOW()), ' - jour :', DAY(NOW()))  AS TEST2;

SELECT nom, CONCAT(DAY(date_naissance),'/',MONTH(date_naissance),'/',YEAR(Etudiant.date_naissance))
FROM Etudiant
WHERE YEAR(Etudiant.date_naissance) >= 2008
ORDER BY date_naissance DESC;

# Requète 3.1
SELECT COUNT(Etudiant.idEtudiant) AS Nbre_etudiants, Etudiant.groupe_id
FROM Etudiant
GROUP BY Etudiant.groupe_id;
# On obtient le nombre d'étudiant par groupe

SELECT COUNT(Etudiant.idEtudiant) AS Nbre_etudiants
FROM Etudiant;
# On obtient le nombre total d'étudiants

# Requète 3.2
SELECT COUNT(Etudiant.idEtudiant) AS Nbre_etudiants, Etudiant.groupe_id, Etudiant.semestre_id
FROM Etudiant
GROUP BY Etudiant.groupe_id, Etudiant.semestre_id;
# Nb étudiant par groupe, par semestre

SELECT COUNT(Etudiant.idEtudiant) AS Nbre_etudiants, Etudiant.groupe_id, Etudiant.semestre_id
FROM Etudiant
GROUP BY Etudiant.groupe_id;
# Nb étudiant par groupe

SELECT COUNT(Etudiant.idEtudiant) AS Nbre_etudiants, Etudiant.groupe_id, Etudiant.semestre_id
FROM Etudiant;
# Nb étudiant total

# Chaque élément dans le Group By permet de préciser les données

# Requète 3.3

SELECT COUNT(Etudiant.idEtudiant) AS nb_etudiant, Etudiant.groupe_id, Etudiant.semestre_id
FROM Etudiant;

SELECT COUNT(Etudiant.idEtudiant) AS nb_etudiant
FROM Etudiant;

# Les champs ne sont pas nécessaires, et ne sont pas représentatifs

# Requète 3.4

SELECT Etudiant.groupe_id, Etudiant.semestre_id, GROUP_CONCAT(Etudiant.note_ue1) AS liste, COUNT(*), MIN(Etudiant.note_ue1), MAX(Etudiant.note_ue1), ROUND(AVG(Etudiant.note_ue1),2) AS moy
FROM Etudiant
GROUP BY groupe_id, semestre_id;

# Requète 4.1
SELECT COUNT(Etudiant.idEtudiant), Etudiant.code_postal, Etudiant.sexe
FROM Etudiant
WHERE Etudiant.sexe = 'H' AND SUBSTRING(Etudiant.code_postal, 1, 2) = 90
GROUP BY Etudiant.code_postal, Etudiant.sexe;

# Requète 4.1 alternative
SELECT COUNT(Etudiant.idEtudiant), Etudiant.code_postal, Etudiant.sexe
FROM Etudiant
WHERE Etudiant.sexe = 'H' AND code_postal LIKE '90%'
GROUP BY Etudiant.code_postal, Etudiant.sexe;

# Requète 4.2
SELECT COUNT(Etudiant.idEtudiant), Etudiant.sexe
FROM Etudiant
WHERE code_postal LIKE '90%'
GROUP BY Etudiant.sexe;

# Requète 4.3
SELECT COUNT(Etudiant.idEtudiant)
FROM Etudiant
WHERE Etudiant.sexe = 'H' AND code_postal LIKE '90%'
GROUP BY Etudiant.sexe;

# Requète 5
SELECT COUNT(Etudiant.idEtudiant) AS nombre_etudiant_franche_comte
FROM Etudiant
WHERE Etudiant.sexe = 'H' AND (code_postal LIKE '90%' OR code_postal LIKE '25%' OR code_postal LIKE '39%' OR code_postal LIKE '70%');


