

# 3.1
SELECT COUNT(*) AS nbr_agres_2024_03_27
FROM agres
WHERE jour_pret = '2024-03-27';

# 3.2
SELECT COUNT(*) AS nbr_agres_2024_03_27_dans_moyen
FROM moyen
INNER JOIN agres ON moyen.id_agres = agres.id_agres
WHERE jour_pret = '2024-03-27';

# 3.3
SELECT personnel.nom AS nom
FROM agres
INNER JOIN personnel ON agres.chef_agres = personnel.matricule
WHERE jour_pret = '2024-02-15'
ORDER BY nom;

#3.4
SELECT personnel.nom AS nom, COUNT(*) AS nb_intervention
FROM agres
INNER JOIN personnel ON agres.chef_agres = personnel.matricule
INNER JOIN moyen ON agres.id_agres = moyen.id_agres
WHERE jour_pret = '2024-06-11'
GROUP BY personnel.nom;

#3.5
SELECT COUNT(moyen.id_agres), personnel.nom, agres.id_agres
FROM agres
INNER JOIN personnel ON agres.chef_agres = personnel.matricule
LEFT JOIN moyen ON agres.id_agres = moyen.id_agres
WHERE jour_pret = '2024-03-27'
GROUP BY agres.id_agres, personnel.nom;