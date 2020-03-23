DROP TABLE IF EXISTS persona;
 
CREATE TABLE persona (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nombre VARCHAR(250) NOT NULL,
  apellido VARCHAR(250) NOT NULL
);

INSERT INTO persona (nombre, apellido) VALUES
  ('Aliko', 'Dangote'),
  ('Bill', 'Gates'),
  ('Folrunsho', 'Alakija');