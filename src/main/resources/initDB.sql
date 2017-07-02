DROP TABLE if EXISTS users1;
DROP SEQUENCE if EXISTS global_s;
CREATE SEQUENCE global_s START 10000;
CREATE TABLE users1(
  userId INTEGER PRIMARY KEY DEFAULT nextval('global_s'),
  firsname VARCHAR(45) NOT NULL,
  lastname VARCHAR(45) NOT NULL,
  dob Date DEFAULT null,
  email VARCHAR(50) NOT NULL

);