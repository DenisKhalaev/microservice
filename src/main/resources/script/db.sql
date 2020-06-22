SET NAMES 'utf8';

DROP DATABASE IF EXISTS microservice;

CREATE DATABASE IF NOT EXISTS microservice
	CHARACTER SET utf8
	COLLATE utf8_general_ci;

USE microservice;

CREATE TABLE IF NOT EXISTS users (
  id bigint NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  email varchar(50) NOT NULL,
  PRIMARY KEY (id)
)
ENGINE = INNODB,
CHARACTER SET utf8,
COLLATE utf8_general_ci;

INSERT INTO users (name, email) VALUES
('Denis', 'denis@mail.ru'),
('Ann', 'Anna@gmail.com'),
('Piter', 'pit@ya.ru');
