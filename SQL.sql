CREATE DATABASE Friends_Of_Human;

USE Friends_Of_Human;

CREATE TABLE animal_types
(
	Id INT AUTO_INCREMENT PRIMARY KEY, 
	type_name VARCHAR(20)
);

INSERT INTO animal_types (type_name)
VALUES ('pack animals'),
('pets');  

CREATE TABLE pack_animals
(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    species_name VARCHAR (20),
    type_id INT,
    FOREIGN KEY (type_id) REFERENCES animal_types (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO pack_animals (species_name, type_id)
VALUES ('Horses', 1),
('Donkeys', 1),  
('Camels', 1); 

CREATE TABLE pets
(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    species_name VARCHAR (20),
    type_id INT,
    FOREIGN KEY (type_id) REFERENCES animal_types (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO home_animals (species_name, type_id)
VALUES ('Dogs', 2),
('Hamsters', 2),  
('Cats', 2); 
