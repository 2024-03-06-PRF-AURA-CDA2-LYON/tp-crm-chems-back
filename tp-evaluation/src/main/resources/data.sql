INSERT INTO customer (COMPANY_NAME, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, ADDRESS, ZIP_CODE, COUNTRY, CITY, STATE)
VALUES
('Tech Innovators', 'Alice', 'Smith', 'alice.smith@techinnovators.com', '1234567890', '123 Tech Avenue', '75001', 'France', 'Paris', 1),
('Green Solutions', 'Bob', 'Johnson', 'bob.johnson@greensolutions.com', '0987654321', '456 Eco Street', '69002', 'France', 'Lyon', 2),
('BuildMaster Inc.', 'Carol', 'Brown', 'carol.brown@buildmaster.com', '1122334455', '789 Construction Blvd', '13008', 'France', 'Marseille', 1),
('Digital World', 'David', 'White', 'david.white@digitalworld.com', '2233445566', '101 Web Plaza', '31000', 'France', 'Toulouse', 2),
('Energy Savers', 'Eva', 'Green', 'eva.green@energysavers.com', '3344556677', '202 Solar Avenue', '06000', 'France', 'Nice', 1);
INSERT INTO orders (SERVICE_TYPE, TVA, CLIENT_ID, NB_DAYS, TOTAL_EXCLUDE_TAX, STATE, COMMENT)
VALUES
('Web Development', 20.0, 1, 30, 10000.00, 1, 'Développement du site vitrine'),
('Eco Consulting', 20.0, 2, 15, 4500.00, 2, 'Audit écologique du bâtiment terminé'),
('Construction Planning', 20.0, 3, 60, 25000.00, 1, 'Phase de planification en cours'),
('Digital Transformation', 20.0, 4, 45, 18000.00, 0, 'En attente de validation par le client'),
('Energy Efficiency Audit', 20.0, 5, 10, 7000.00, 2, 'Audit terminé, rapport envoyé');