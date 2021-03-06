CREATE DATABASE SCHOOLAPP;

USE SCHOOLAPP;

CREATE TABLE SUBJECTS(
	ID				BIGINT AUTO_INCREMENT NOT NULL,
	SUBJECT_NAME	VARCHAR(30) NOT NULL,
	SEMESTER		INT NOT NULL,
	PRIMARY KEY(ID)
);

CREATE TABLE STUDENT(
	ID			BIGINT AUTO_INCREMENT NOT NULL,
	FIRST_NAME	VARCHAR(20) NOT NULL,
	LAST_NAME	VARCHAR(20) NOT NULL,
	SUBJECT_ID	BIGINT NOT NULL,
	PRIMARY KEY(ID)
);

CREATE TABLE TEACHERS(
	ID			BIGINT AUTO_INCREMENT NOT NULL,
	FIRST_NAME	VARCHAR(20) NOT NULL,
	LAST_NAME	VARCHAR(20) NOT NULL,
	SUBJECT_ID	BIGINT NOT NULL,
	PRIMARY KEY(ID)
);

CREATE  TABLE USERS (
  USERNAME 		VARCHAR(45) NOT NULL ,
  PASSWORD 		VARCHAR(60) NOT NULL ,
  ENABLED 		TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (USERNAME));

CREATE TABLE USER_ROLES (
  USER_ROLE_ID 	BIGINT AUTO_INCREMENT NOT NULL,
  USERNAME 		VARCHAR(45) NOT NULL,
  ROLENAME 		VARCHAR(45) NOT NULL,
  PRIMARY KEY (USER_ROLE_ID)
);

ALTER TABLE STUDENT ADD CONSTRAINT FK_SUBJECT FOREIGN KEY (SUBJECT_ID) REFERENCES SUBJECTS (ID);
ALTER TABLE TEACHERS ADD CONSTRAINT FK_SUBJECT_TEACHERS FOREIGN KEY (SUBJECT_ID) REFERENCES SUBJECTS (ID);
ALTER TABLE USER_ROLES ADD CONSTRAINT FK_USERNAME_IDX FOREIGN KEY (USERNAME) REFERENCES USERS (USERNAME);

INSERT INTO USERS (USERNAME, PASSWORD, ENABLED) VALUES ('admin', 'password', 1);
INSERT INTO USERS (USERNAME, PASSWORD, ENABLED) VALUES ('user', 'password', 1);
INSERT INTO USER_ROLES (USERNAME, ROLENAME) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO USER_ROLES (USERNAME, ROLENAME) VALUES ('user', 'ROLE_USER');