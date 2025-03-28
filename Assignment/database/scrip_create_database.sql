CREATE DATABASE QL_SINHVIEN;
GO

USE QL_SINHVIEN;
GO

-- Create table Students
CREATE TABLE STUDENTS (
	[IdStudent] NVARCHAR(50) PRIMARY KEY
  , [Name] NVARCHAR(50)
  , [Email] NVARCHAR(50)
  , [Phone] VARCHAR(10)
  , [Gender] BIT
  , [Address] NVARCHAR(100)
  , [Avatar] NVARCHAR(100)
)

GO

-- Create table Grade
CREATE TABLE SCORES (
	[Id] INT PRIMARY KEY IDENTITY
  , [IdStudent] NVARCHAR(50)
  , [English] INT
  , [Computer] INT
  , [Physical] INT
)

GO

-- Create table user
CREATE TABLE USERS (
	[username] NVARCHAR(50) PRIMARY KEY
  , [password] NVARCHAR(50)
  , [roleid] INT
)

GO

CREATE TABLE ROLES (
	[roleid] INT PRIMARY KEY
  , [rolename] NVARCHAR(50)
)

-- Add constraint FK_IdStudent_Students
ALTER TABLE SCORES
ADD CONSTRAINT FK_IdStudent_STUDENTS
FOREIGN KEY (IdStudent) REFERENCES STUDENTS(IdStudent)

ALTER TABLE USERS
ADD CONSTRAINT FK_roleid_ROLES
FOREIGN KEY (roleid) REFERENCES ROLES(roleid)



SELECT IdStudent, Name FROM STUDENTS
select * from SCORES
INSERT INTO SCORES (IdStudent, English, Computer, Physical) VALUES ('s', 1, 1, 1)
