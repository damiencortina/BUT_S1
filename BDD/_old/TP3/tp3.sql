USE BDD_dcortina;

DROP TABLE IF EXISTS etudiants;
DROP TABLE IF EXISTS etudiant;

-- Creation de la table

CREATE TABLE etudiant (
   id_etu INT PRIMARY KEY AUTO_INCREMENT,
   nom VARCHAR(20),
   adresse TEXT,
   code_postal INT,
   telephone VARCHAR(10),
   date_naissance DATE
);

INSERT INTO etudiant VALUES
    (NULL, 'dupond', 'rue du chateau', '01000', '0123456789', '1996-05-02');

INSERT INTO etudiant VALUES
    (NULL, 'dupond', 'rue du chateau', '01000', '0123456789', '1996-05-02');

INSERT INTO etudiant (nom, adresse, code_postal, telephone, date_naissance) VALUES
    ('dupond', 'rue du chateau', '01000', '0123456789', '1996-05-02');

SHOW TABLES;
SELECT * FROM etudiant;

RENAME TABLE etudiant TO etudiants;
SHOW TABLES;

SELECT * FROM etudiants;

ALTER TABLE etudiants ADD groupe VARCHAR(20);
DESCRIBE etudiants;
SELECT * FROM etudiants;


ALTER TABLE etudiants ADD prenom VARCHAR(20) AFTER nom;
DESCRIBE etudiants;
SELECT * FROM etudiants;

ALTER TABLE etudiants DROP COLUMN groupe;
DESCRIBE etudiants;
SELECT * FROM etudiants;

ALTER TABLE etudiants CHANGE prenom prenom VARCHAR(50);
DESCRIBE etudiants;
SELECT * FROM etudiants;

ALTER TABLE etudiants CHANGE telephone telephone CHAR(13);
DESCRIBE etudiants;
SELECT * FROM etudiants;

ALTER TABLE etudiants CHANGE telephone telephone CHAR(13) NULL
              CONSTRAINT ck_phone
                    CHECK(Telephone
                         LIKE ('[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]') OR Telephone LIKE ('[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'))


ALTER TABLE etudiants ADD CONSTRAINT gender_vals CHECK (val IN ('f','m'));

-- set allowed numbers



DROP TABLE IF EXISTS etudiants;
DROP TABLE IF EXISTS etudiant;