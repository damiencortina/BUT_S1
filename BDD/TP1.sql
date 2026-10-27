-- docker exec -i BUT-mysql mysql --user=root --password=secret TP1 < TP1.sql
-- Create a new database
-- CREATE DATABASE TP1;

-- CREATE TABLE etudiant (
--     id_etudiant INT,
--     nom_etudiant VARCHAR(25)
-- );

-- DESCRIBE etudiant;

-- INSERT INTO etudiant (id_etudiant, nom_etudiant) VALUES (1, 'dupond');
-- INSERT INTO etudiant VALUES (2, 'durand');
-- INSERT INTO etudiant VALUES (1, 'Gauthier');
-- INSERT INTO etudiant VALUES (NULL, 'laval');
-- INSERT INTO etudiant (nom_etudiant) VALUES ('lepaul');

-- SELECT * FROM etudiant;

-- Setting id_etudiant NOT NULL

CREATE TABLE etudiant (
    id_etudiant INT NOT NULL,
    nom_etudiant VARCHAR(25)
);

DESCRIBE etudiant;

INSERT INTO etudiant (id_etudiant, nom_etudiant) VALUES (1, 'dupond');
INSERT INTO etudiant VALUES (2, 'durand');
INSERT INTO etudiant VALUES (1, 'Gauthier');
INSERT INTO etudiant VALUES (NULL, 'laval');
INSERT INTO etudiant (nom_etudiant) VALUES ('lepaul');

SELECT * FROM etudiant;

DROP TABLE etudiant;