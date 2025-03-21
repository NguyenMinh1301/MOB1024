CREATE DATABASE BOOK
GO

USE BOOK
GO

CREATE TABLE Books (
	id INT IDENTITY PRIMARY KEY
  , title NVARCHAR(100)
  , price MONEY
);

INSERT INTO Books (title, price) VALUES
  (N'Lập trình PHP', 550),
  (N'Lập trình Swift', 700),
  (N'Lập trình Go', 450),
  (N'Lập trình Ruby on Rails', 750),
  (N'Lập trình Kotlin', 900),
  (N'Lập trình Node.js', 650),
  (N'Lập trình SQL', 600),
  (N'Lập trình Dart', 680),
  (N'Lập trình R', 720),
  (N'Lập trình MATLAB', 800),
  (N'Lập trình React', 950),
  (N'Lập trình Angular', 900),
  (N'Lập trình Vue.js', 770),
  (N'Lập trình HTML5', 520),
  (N'Lập trình CSS3', 540),
  (N'Lập trình Java 8', 680),
  (N'Lập trình C++ với OpenGL', 850),
  (N'Lập trình Haskell', 550),
  (N'Lập trình Bash', 450),
  (N'Lập trình Android', 880),
  (N'Lập trình iOS', 980),
  (N'Lập trình JavaScript ES6', 700),
  (N'Lập trình TensorFlow', 950),
  (N'Lập trình AI với Python', 1200),
  (N'Lập trình AI với Java', 1100),
  (N'Lập trình Machine Learning', 1000),
  (N'Lập trình Web với Python', 650),
  (N'Lập trình Web với JavaScript', 750),
  (N'Lập trình Blockchain', 950),
  (N'Lập trình Web với PHP', 600),
  (N'Lập trình React Native', 800),
  (N'Lập trình Vue.js và TypeScript', 770),
  (N'Lập trình Web với Node.js', 880),
  (N'Lập trình JavaScript cơ bản', 480),
  (N'Lập trình SQL nâng cao', 650),
  (N'Lập trình Android với Kotlin', 900),
  (N'Lập trình iOS với Swift', 950),
  (N'Lập trình cơ sở dữ liệu', 600),
  (N'Lập trình Python nâng cao', 870),
  (N'Lập trình Flask', 690),
  (N'Lập trình Django', 760),
  (N'Lập trình JavaScript với Express.js', 700),
  (N'Lập trình MongoDB', 650),
  (N'Lập trình API với Node.js', 850),
  (N'Lập trình Machine Learning với R', 960),
  (N'Lập trình Web với ASP.NET', 750),
  (N'Lập trình Python cho Web', 740),
  (N'Lập trình C++ với Qt', 890),
  (N'Lập trình ứng dụng di động', 950),
  (N'Lập trình Java với Spring Boot', 850),
  (N'Lập trình Microservices', 800),
  (N'Lập trình AI với JavaScript', 920),
  (N'Lập trình Unity 3D', 1000);






