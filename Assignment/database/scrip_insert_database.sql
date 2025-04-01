USE QL_SINHVIEN;
GO

DELETE FROM SCORES;
DELETE FROM STUDENTS;
UPDATE STUDENT_COUNTER SET LastNumber = 0;

SELECT * FROM STUDENTS;
SELECT * FROM SCORES;

INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Lê Hữu Trang', 'sv001@student.edu.vn', '0979732402', 1, N'Bình Dương', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Vũ Thị Dương', 'sv002@student.edu.vn', '0917411324', 0, N'Hà Nội', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Trần Thị Nhung', 'sv003@student.edu.vn', '0972430254', 0, N'Huế', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Bùi Đức Lan', 'sv004@student.edu.vn', '0963956563', 1, N'Bình Dương', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Nguyễn Thị Hải', 'sv005@student.edu.vn', '0916700216', 0, N'Thanh Hóa', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Nguyễn Thị Bình', 'sv006@student.edu.vn', '0998765325', 0, N'Bình Dương', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Hoàng Thị Hà', 'sv007@student.edu.vn', '0950610536', 0, N'Thanh Hóa', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Hoàng Anh Mai', 'sv008@student.edu.vn', '0989666487', 1, N'Hải Phòng', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Đặng Thị Lan', 'sv009@student.edu.vn', '0957198260', 0, N'Nghệ An', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Lê Hữu Nga', 'sv010@student.edu.vn', '0964371321', 1, N'Nghệ An', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Nguyễn Thị Linh', 'sv011@student.edu.vn', '0932514393', 0, N'Hải Phòng', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Bùi Thị An', 'sv012@student.edu.vn', '0961572196', 0, N'Lâm Đồng', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Trần Thị Chi', 'sv013@student.edu.vn', '0962927654', 0, N'Lâm Đồng', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Vũ Văn Nhung', 'sv014@student.edu.vn', '0996335200', 1, N'Bình Dương', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Lê Thị Hương', 'sv015@student.edu.vn', '0975081152', 0, N'Hải Phòng', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Bùi Thị Trang', 'sv016@student.edu.vn', '0911472120', 0, N'Huế', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Phạm Thị Chi', 'sv017@student.edu.vn', '0957741850', 0, N'Hà Nội', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Trần Thị Dương', 'sv018@student.edu.vn', '0965025963', 0, N'Lâm Đồng', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Phạm Quốc Dương', 'sv019@student.edu.vn', '0920024725', 1, N'Huế', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Vũ Thị Vy', 'sv020@student.edu.vn', '0989631585', 0, N'Huế', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Bùi Đức Giang', 'sv021@student.edu.vn', '0967422482', 1, N'Đà Nẵng', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Trần Minh Hương', 'sv022@student.edu.vn', '0994885719', 1, N'TP. Hồ Chí Minh', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Phạm Thị Quỳnh', 'sv023@student.edu.vn', '0971633410', 0, N'Hải Phòng', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Phạm Thị Lan', 'sv024@student.edu.vn', '0972302291', 0, N'Đà Nẵng', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Bùi Thị Vy', 'sv025@student.edu.vn', '0966723730', 0, N'Hà Nội', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Vũ Văn Thảo', 'sv026@student.edu.vn', '0963082482', 1, N'Nghệ An', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Đỗ Thanh Mai', 'sv027@student.edu.vn', '0957875430', 1, N'Hà Nội', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Đặng Thị Lan', 'sv028@student.edu.vn', '0957557022', 0, N'TP. Hồ Chí Minh', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Đặng Thị Quỳnh', 'sv029@student.edu.vn', '0951058209', 0, N'Thanh Hóa', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Hoàng Thị Thúy', 'sv030@student.edu.vn', '0984696681', 0, N'Thanh Hóa', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Hoàng Anh Nga', 'sv031@student.edu.vn', '0989198965', 1, N'Lâm Đồng', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Lê Hữu Chi', 'sv032@student.edu.vn', '0976096661', 1, N'Thanh Hóa', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Vũ Văn Thảo', 'sv033@student.edu.vn', '0960855081', 1, N'Hà Nội', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Phạm Quốc Thảo', 'sv034@student.edu.vn', '0916345923', 1, N'Bình Dương', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Phạm Thị Khánh', 'sv035@student.edu.vn', '0983327608', 0, N'TP. Hồ Chí Minh', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Phạm Thị Quỳnh', 'sv036@student.edu.vn', '0983484248', 0, N'Lâm Đồng', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Phạm Thị Hà', 'sv037@student.edu.vn', '0938174704', 0, N'Cần Thơ', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Đỗ Thanh Nga', 'sv038@student.edu.vn', '0960192830', 1, N'Huế', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Vũ Văn Vy', 'sv039@student.edu.vn', '0948641948', 1, N'Hà Nội', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Vũ Thị Vy', 'sv040@student.edu.vn', '0943224053', 0, N'Nghệ An', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Trần Thị Hải', 'sv041@student.edu.vn', '0914231278', 0, N'Huế', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Lê Hữu Dung', 'sv042@student.edu.vn', '0935633993', 1, N'Thanh Hóa', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Nguyễn Thị Thảo', 'sv043@student.edu.vn', '0982093266', 0, N'Huế', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Đỗ Thanh Thúy', 'sv044@student.edu.vn', '0950678094', 1, N'TP. Hồ Chí Minh', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Phạm Quốc Hà', 'sv045@student.edu.vn', '0948785655', 1, N'Thanh Hóa', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Hoàng Anh Hải', 'sv046@student.edu.vn', '0969490909', 1, N'Đà Nẵng', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Nguyễn Thị Vy', 'sv047@student.edu.vn', '0943567040', 0, N'Huế', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Bùi Thị Thảo', 'sv048@student.edu.vn', '0915330318', 0, N'Lâm Đồng', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Nguyễn Thị Trang', 'sv049@student.edu.vn', '0982815546', 0, N'Huế', '');
INSERT INTO STUDENTS ([Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (N'Lê Thị Lan', 'sv050@student.edu.vn', '0915757667', 0, N'Hà Nội', '');

INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00001', 5.0, 6.5, 7.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00002', 5.5, 7.0, 5.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00003', 7.0, 7.0, 7.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00004', 5.0, 8.5, 8.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00005', 5.5, 8.5, 8.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00006', 7.0, 6.5, 5.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00007', 5.0, 6.0, 6.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00008', 7.5, 6.5, 5.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00009', 6.5, 9.0, 5.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00010', 4.5, 8.0, 6.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00011', 6.0, 9.0, 6.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00012', 8.0, 6.0, 6.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00013', 6.5, 7.0, 8.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00014', 4.0, 8.0, 5.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00015', 5.5, 7.0, 8.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00016', 5.5, 8.0, 5.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00017', 8.0, 8.5, 7.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00018', 8.0, 8.0, 5.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00019', 8.0, 7.0, 6.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00020', 8.0, 9.0, 7.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00021', 4.5, 8.0, 6.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00022', 4.5, 9.5, 6.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00023', 7.0, 9.0, 5.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00024', 5.5, 7.5, 7.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00025', 5.5, 6.0, 5.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00026', 6.5, 8.5, 5.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00027', 4.0, 7.0, 6.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00028', 5.0, 7.0, 7.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00029', 5.5, 9.0, 5.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00030', 6.0, 7.5, 5.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00031', 7.5, 8.0, 8.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00032', 7.0, 8.0, 8.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00033', 5.0, 9.0, 7.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00034', 6.0, 9.5, 7.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00035', 5.5, 8.5, 8.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00036', 4.0, 7.0, 5.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00037', 5.0, 6.0, 7.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00038', 6.0, 7.0, 7.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00039', 7.0, 7.5, 7.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00040', 6.5, 9.0, 7.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00041', 4.5, 6.5, 6.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00042', 6.0, 6.5, 7.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00043', 6.5, 7.5, 6.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00044', 7.5, 8.5, 5.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00045', 6.5, 6.5, 6.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00046', 7.5, 8.0, 6.5);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00047', 8.0, 8.0, 5.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00048', 7.5, 9.5, 5.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00049', 5.0, 7.5, 8.0);
INSERT INTO SCORES ([IdStudent], [English], [Computer], [Physical]) VALUES ('TV00050', 5.0, 7.5, 6.0);


INSERT INTO ROLES ([roleid], [rolename]) VALUES 
	(1, N'Admin'),
	(2, N'Teacher'),
	(3, N'User');


INSERT INTO USERS ([username], [password], [roleid]) VALUES
	('admin', '$2a$08$ARtGla6A4lUbyYzIifJjUepCZnZ4TBXUbxaGsZ.xqGGYF//Zdlje6', '1'); -- Pass: 123
