-- create_db.sql

CREATE TABLE Jaegers (
	id 		SERIAL PRIMARY KEY,
	modelName 	TEXT,
	mark 		CHAR(1),
	height 		DOUBLE PRECISION,
	weight 		DOUBLE PRECISION,
	status 		TEXT,
	origin	 	TEXT,
	launch 		INTEGER,
	kaijuKill 	INTEGER
);