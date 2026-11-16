DROP TABLE IF EXISTS  moyen;
DROP TABLE IF EXISTS agres;
DROP TABLE IF EXISTS  personnel;
DROP TABLE IF EXISTS  intervention;


-- Création de la table personnel
CREATE TABLE personnel (
    matricule INT,    -- Matricule unique du pompier
    nom VARCHAR(255) NOT NULL,    -- Nom du pompier
    qualification VARCHAR(50) NOT NULL,    -- Qualification (codée)
    actif TINYINT(1) NOT NULL,     -- 1 si actif, 0 si inactif
    PRIMARY KEY (matricule)
);

-- Création de la table agres
CREATE TABLE agres (
    id_agres INT,     -- Identifiant de l'agrès
    jour_pret DATE NOT NULL,      -- Jour où l'agrès se tient prêt
    type_vehicule VARCHAR(50) NOT NULL,    -- Type de véhicule
    chef_agres INT NOT NULL,      -- Identifiant du chef d'agrès (référence à personnel)
    conducteur INT NOT NULL,      -- Identifiant du conducteur (référence à personnel)
    chef_equipe INT,              -- Identifiant du chef d'équipe (référence à personnel, si nécessaire, sinon NULL)
    equipier INT,                 -- Identifiant de l'équipier (référence à personnel, si nécessaire, sinon NULL)
    PRIMARY KEY (id_agres),
    FOREIGN KEY (chef_agres) REFERENCES personnel (matricule),
    FOREIGN KEY (conducteur) REFERENCES personnel (matricule),
    FOREIGN KEY (chef_equipe) REFERENCES personnel (matricule),
    FOREIGN KEY (equipier) REFERENCES personnel (matricule)
);

-- Création de la table intervention
CREATE TABLE intervention (
    id_intervention INT,     -- Identifiant de l'intervention
    jour_debut DATE NOT NULL,            -- Jour de début de l'intervention
    heure_debut TIME NOT NULL,            -- Heure de début de l'intervention
    PRIMARY KEY (id_intervention)
);


-- Création de la table moyen
CREATE TABLE moyen (
    id_agres INT,                     -- Identifiant de l'agrès appelé
    id_intervention INT,              -- Identifiant de l'intervention
    FOREIGN KEY (id_agres) REFERENCES agres (id_agres),
    FOREIGN KEY (id_intervention) REFERENCES intervention (id_intervention)
);

INSERT INTO intervention (id_intervention, jour_debut, heure_debut) VALUES
(0, '2023-11-21', '12:32:21'),
(1, '2023-11-22', '22:20:00'),
(2, '2023-12-17', '23:17:30'),
(3, '2024-02-15', '01:44:06'),
(4, '2024-02-15', '12:15:00'),
(5, '2024-03-02', '04:58:12'),
(6, '2024-03-27', '13:07:18'),
(7, '2024-05-31', '05:17:12'),
(8, '2024-06-11', '05:38:17'),
(9, '2024-06-11', '15:08:56'),
(10, '2024-06-18', '07:42:33');

INSERT INTO personnel (matricule, nom, qualification, actif) VALUES
(10, 'Sam', 31, 1),
(16, 'Charlot', 10, 1),
(31, 'Red', 230, 1),
(83, 'Vaillante', 71, 1),
(2501, 'Marco', 11, 1),
(2674, 'Aicha', 231, 1),
(3004, 'Fatou', 71, 1),
(4044, 'Abdel', 191, 1),
(4671, 'Mamadou', 171, 1),
(5301, 'Zoe', 171, 1),
(7450, 'Medhi', 31, 1),
(8641, 'Gaia', 11, 1),
(8678, 'Kevin', 170, 1),
(8682, 'Marie', 11, 1),
(9153, 'Fred', 231, 1);

INSERT INTO agres (id_agres, jour_pret, type_vehicule, chef_agres, conducteur, chef_equipe, equipier) VALUES
(0, '2023-11-21', 'VSAV', 83, 9153, NULL, 10),
(2, '2024-02-15', 'VSAV', 2674, 4044, NULL, 8641),
(3, '2024-02-15', 'FPT', 9153, 5301, 8682, 2501),
(4, '2024-02-15', 'VSAV', 83, 4671, NULL, 7450),
(7, '2024-02-29', 'VSAV', 9153, 3004, NULL, 2501),
(9, '2024-03-02', 'FPT', 2674, 5301, 8682, 8641),
(12, '2024-03-21', 'VTU', 3004, 5301, NULL, NULL),
(17, '2024-03-27', 'VSAV', 3004, 8682, NULL, 10),
(18, '2024-03-27', 'VSAV', 9153, 5301, NULL, 10),
(22, '2024-05-31', 'FPT', 9153, 4044, 7450, 8641),
(23, '2024-06-11', 'VTU', 83, 2674, NULL, NULL),
(24, '2024-06-11', 'VSAV', 3004, 4044, NULL, 7450);

INSERT INTO moyen (id_agres, id_intervention) VALUES
(0, 0),
(2, 3),
(2, 4),
(3, 4),
(4, 4),
(9, 5),
(17, 6),
(22, 7),
(23, 8),
(24, 8),
(24, 9);
