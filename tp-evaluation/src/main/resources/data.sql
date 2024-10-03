INSERT INTO customer (COMPANY_NAME, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, ADDRESS, ZIP_CODE, COUNTRY, CITY, STATE)
VALUES
('Tech Solutions', 'Alice', 'Johnson', 'alice.johnson@techsolutions.com', '+33123456789', '123 Rue de Paris', '75001', 'France', 'Paris'),
('Build Corp', 'Bob', 'Williams', 'bob.williams@buildcorp.com', '+33123456790', '456 Avenue des Champs', '75008', 'France', 'Paris'),
('Design Agency', 'Carol', 'Smith', 'carol.smith@designagency.com', '+33123456791', '789 Boulevard Saint-Germain', '75006', 'France', 'Paris'),
('WebTech', 'David', 'Brown', 'david.brown@webtech.com', '+33123456792', '321 Rue Lafayette', '69001', 'France', 'Lyon'),
('Eco Green', 'Eva', 'White', 'eva.white@ecogreen.com', '+33123456793', '654 Avenue Victor Hugo', '33000', 'France', 'Bordeaux'),
('Smart Build', 'Frank', 'Taylor', 'frank.taylor@smartbuild.com', '+33123456794', '987 Rue de la République', '13001', 'France', 'Marseille'),
('Innovatech', 'Grace', 'Davies', 'grace.davies@innovatech.com', '+33123456795', '147 Avenue de la Liberté', '31000', 'France', 'Toulouse'),
('MediCare', 'Henry', 'Evans', 'henry.evans@medicare.com', '+33123456796', '369 Boulevard du Montparnasse', '75014', 'France', 'Paris'),
('NextGen IT', 'Isabella', 'Martinez', 'isabella.martinez@nextgen.com', '+33123456797', '258 Rue d\'Alésia', '75014', 'France', 'Paris'),
('BuildIT', 'Jack', 'Lopez', 'jack.lopez@buildit.com', '+33123456798', '753 Rue de la Victoire', '54000', 'France', 'Nancy');

INSERT INTO orders (SERVICE_TYPE, TVA, CLIENT_ID, NB_DAYS, TOTAL_EXCLUDE_TAX, STATE, COMMENT)
VALUES
('Web Development', 20.0, 1, 30, 5000.00, 1, 'Phase initiale du développement'),
('Consulting', 20.0, 2, 15, 3000.00, 2, 'Consultation terminée sur la structure du bâtiment'),
('Design Services', 20.0, 3, 20, 4000.00, 0, 'En attente du retour du client'),
('Software Integration', 20.0, 4, 25, 6000.00, 1, 'Intégration de nouveaux modules en cours'),
('Eco Consulting', 20.0, 5, 10, 2500.00, 2, 'Consultation sur les solutions écologiques terminée'),
('Architecture', 20.0, 6, 40, 8000.00, 1, 'Conception du plan du bâtiment en cours'),
('IT Support', 20.0, 7, 5, 1000.00, 2, 'Problèmes de serveur résolus'),
('Healthcare Solutions', 20.0, 8, 35, 7000.00, 1, 'Développement du système de santé en cours'),
('Cybersecurity', 20.0, 9, 15, 3500.00, 0, 'Évaluation initiale de la sécurité en attente'),
('Building Automation', 20.0, 10, 50, 10000.00, 1, 'Automatisation des systèmes de bâtiment en cours');