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
  , [role] NVARCHAR(50)
)

GO

SELECT s.IdStudent, st.Name, s.English, s.Computer, s.Physical FROM SCORES s JOIN STUDENTS st ON s.IdStudent = st.IdStudent

-- Add constraint FK_IdStudent_Students
ALTER TABLE SCORES
ADD CONSTRAINT FK_IdStudent_Students
FOREIGN KEY (IdStudent) REFERENCES Students(IdStudent)
