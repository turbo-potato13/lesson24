CREATE TABLE books (id bigserial primary key, title varchar(255), description varchar(5000), price numeric(8, 2), publish_year int,  genre VARCHAR(255));
INSERT INTO books (title, description, price, publish_year, genre) VALUES
('Harry Potter 1', 'Description 1', 300.0, 2000, 'FANTASY'),
('Harry Potter 2', 'Description 2', 400.0, 2001, 'SCI_FI'),
('Harry Potter 3', 'Description 3', 500.0, 2002, 'DETECTIVE'),
('Harry Potter 4', 'Description 4', 700.0, 2007,'SCI_FI'),
('Harry Potter 5', 'Description 5', 440.0, 2004,'SCI_FI'),
('Harry Potter 6', 'Description 6', 650.0, 2007,'DETECTIVE'),
('Harry Potter 7', 'Description 7', 200.0, 2006,'SCI_FI'),
('LOTR 1', 'Description 8', 1200.0, 2006, 'FANTASY'),
('LOTR 2', 'Description 9', 900.0, 2004, 'SCI_FI'),
('LOTR 3', 'Description 10', 600.0, 2001,'FANTASY'),
('Hobbit', 'Description 11', 500.0, 2001, 'DETECTIVE');