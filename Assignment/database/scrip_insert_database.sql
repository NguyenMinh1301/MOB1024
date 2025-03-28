USE QL_SINHVIEN;
GO

INSERT INTO STUDENTS ([IdStudent], [Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES
	('TV00001', N'Nguyễn Quang Minh', 'minhnqtv00001@gmail.com', '0900000001', 0, N'Bình Dương', 'C:\Users\minhg\OneDrive\Desktop\MOB1024\Assignment\src\img\user-avatar\user.png')
  , ('TV00002', N'Trần Thanh Phúc', 'phuctttv00002@gmail.com', '0900000002', 0, N'Bình Dương', 'C:\Users\minhg\OneDrive\Desktop\MOB1024\Assignment\src\img\user-avatar\user.png')
  , ('TV00003', N'Hoàng Minh Khôi', 'khoihmtv00003@gmail.com', '0900000003', 0, N'Bình Dương', 'C:\Users\minhg\OneDrive\Desktop\MOB1024\Assignment\src\img\user-avatar\user.png')
  , ('TV00004', N'Nguyễn Toàn Thắng', 'thangnttv00004@gmail.com', '0900000004', 0, N'Bình Dương', 'C:\Users\minhg\OneDrive\Desktop\MOB1024\Assignment\src\img\user-avatar\user.png')
  , ('TV00005', N'Phạm Ngọc Đức', 'ducpntv00005@gmail.com', '0900000005', 0, N'Bình Dương', 'C:\Users\minhg\OneDrive\Desktop\MOB1024\Assignment\src\img\user-avatar\user.png')
  , ('TV00006', N'Trần Minh Phúc', 'phuctmtv00006@gmail.com', '0900000006', 0, N'Bình Dương', 'C:\Users\minhg\OneDrive\Desktop\MOB1024\Assignment\src\img\user-avatar\user.png')

GO

INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES
    ('TV00001', 10, 10, 10)
  , ('TV00002', 7, 8, 6)
  , ('TV00003', 9, 6, 7)
  , ('TV00004', 6, 9, 8)
  , ('TV00005', 7, 7, 7)
  , ('TV00006', 8, 8, 7)

GO

INSERT INTO ROLES ([roleid], [rolename]) VALUES 
	('1', 'admin')
  , ('2', 'user')

INSERT INTO USERS ([username], [password], [roleid]) VALUES
	('minh', '123', '1');
