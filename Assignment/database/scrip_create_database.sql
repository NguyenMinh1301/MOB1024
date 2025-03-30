-- Create Database
CREATE DATABASE QL_SINHVIEN;
GO

-- Use Database QL_SINHVIEN
USE QL_SINHVIEN;
GO

-- Create table STUDENTS
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

-- Create table SCORES
CREATE TABLE SCORES (
	[IdStudent] NVARCHAR(50) PRIMARY KEY
  , [English] FLOAT
  , [Computer] FLOAT
  , [Physical] FLOAT
)

GO

-- Create table USERS
CREATE TABLE USERS (
	[username] NVARCHAR(50) PRIMARY KEY
  , [password] NVARCHAR(255)
  , [roleid] INT
)

GO

-- Create table ROLES
CREATE TABLE ROLES (
	[roleid] INT PRIMARY KEY
  , [rolename] NVARCHAR(50)
)

-- Foreign key SCORES
ALTER TABLE SCORES
ADD CONSTRAINT FK_IdStudent_STUDENTS
FOREIGN KEY (IdStudent) REFERENCES STUDENTS(IdStudent)

-- Foreign key USERS
ALTER TABLE USERS
ADD CONSTRAINT FK_roleid_ROLES
FOREIGN KEY (roleid) REFERENCES ROLES(roleid)

-- Create table STUDENT_COUNTER (for auto count student)
CREATE TABLE STUDENT_COUNTER (
    LastNumber INT
);
INSERT INTO STUDENT_COUNTER VALUES (0); -- Original data starts from 0
GO

-- Trigger auto generate IdStudent
CREATE TRIGGER trg_Insert_StudentId
ON STUDENTS
INSTEAD OF INSERT
AS
BEGIN
    DECLARE @nextNum INT;
    DECLARE @newId NVARCHAR(50);

    -- Auto-increment id
    SELECT @nextNum = LastNumber + 1 FROM STUDENT_COUNTER;

    -- IdStudent type TV00001, TV00002,...
    SET @newId = 'TV' + FORMAT(@nextNum, '00000');

    -- Insert new Student with Auto-increment id
    INSERT INTO STUDENTS (IdStudent, Name, Email, Phone, Gender, Address, Avatar)
    SELECT 
        @newId, Name, Email, Phone, Gender, Address, Avatar
    FROM INSERTED;

    -- Update the count
    UPDATE STUDENT_COUNTER SET LastNumber = @nextNum;
END;
GO

