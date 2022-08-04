/*Database for Results Systems*/
CREATE DATABASE ResultsSystem;
USE ResultsSystem; 

/*Four tables only*/
CREATE TABLE Administrator 
(
adminId varchar (20) NOT NULL,
firstName varchar (50) NOT NULL, 
lastName varchar (50) NOT NULL,
adminEmail varchar (50) NOT NULL,
password varchar (50) NOT NULL, 
PRIMARY KEY (adminId)
);

CREATE TABLE Teacher 
(
teacherId varchar (20) NOT NULL,
firstName varchar (50) NOT NULL,
lastName varchar (50) NOT NULL,
subject varchar (50) NOT NULL,  
email varchar (50) NOT NULL,
password varchar (50) NOT NULL,
PRIMARY KEY (teacherId)
);

CREATE TABLE Student
(

firstName varchar (50) NOT NULL, 
lastName varchar (50) NOT NULL, 
studentId varchar (20) NOT NULL,
address varchar (100) NOT NULL,
phone varchar (50) NOT NULL, 
PRIMARY KEY (studentId)
);

CREATE TABLE StudentGrade
(
studentId varchar (20) NOT NULL, 
subjectOne varchar (20) NOT NULL, 
precentOne int, 
subjectTwo varchar (20) NOT NULL, 
precentTwo int,
subjectThree varchar (20) NOT NULL, 
precentThree int, 
subjectFour varchar (20) NOT NULL, 
precentFour int,
subjectFive varchar (20) NOT NULL, 
precentFive int, 
subjectSix varchar (20) NOT NULL, 
precentSix int
);

CREATE TABLE Root
(
email varchar (50) NOT NULL,
password varchar (50) NOT NULL
);

ALTER TABLE StudentGrade ADD FOREIGN KEY (studentId) REFERENCES Student(studentId);

INSERT INTO Administrator (adminId, firstName, lastName, adminEmail, password) VALUES ('A001', 'John', 'User', 'john@tester.ie', 'password');
INSERT INTO Teacher (teacherId, firstName, lastName, subject, email, password) VALUES ('T001', 'Tess', 'Tester', 'Biology', 'Tess@datester.ie', 'Password1');
INSERT INTO Student (firstName, lastName, studentId, address, phone) VALUES ( 'John', 'Test', 'S001', 'Main St, Lismore', '098778766');
INSERT INTO StudentGrade (studentId, subjectOne, precentOne, subjectTwo, precentTwo, subjectThree, precentThree, subjectFour, precentFour, subjectFive, precentFive, subjectSix, precentSix) 
VALUES ('S001', 'Biology', 87, 'Maths', 56, 'Irish', '78', 'English', 56, 'Chemistry', 69, 'Physics', 65);
INSERT INTO Root (email, password) VALUES ('root@root.ie', 'password');