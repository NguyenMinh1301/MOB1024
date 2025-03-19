CREATE DATABASE QLSINHVIEN
GO
USE QLSINHVIEN;
GO

CREATE TABLE Student (
	Masv varchar(10) PRIMARY KEY
  ,	Hoten nvarchar(50) not null
  , Email nvarchar(50) not null
  , SoDT varchar(10) not null
  , Gioitinh bit 
  , Diachi nvarchar(100) not null
)

INSERT INTO Student (Masv, Hoten, Email, SoDT, Gioitinh, Diachi) VALUES
('TV001', N'Nguyễn Văn A', 'nguyenvana@gmail.com', '0987654321', 1, N'Phố Huế, Quận Hai Bà Trưng, Hà Nội'),
('TV002', N'Trần Thị B', 'tranthib@gmail.com', '0912345678', 0, N'Quận 1, TP. Hồ Chí Minh'),
('TV003', N'Lê Văn C', 'levanc@gmail.com', '0922334455', 1, N'Đường Hoàng Diệu, Quận Hải Châu, Đà Nẵng'),
('TV004', N'Phạm Thị D', 'phamthid@gmail.com', '0909123456', 0, N'Lạch Tray, Quận Ngô Quyền, Hải Phòng'),
('TV005', N'Hoàng Minh E', 'hoangminhe@gmail.com', '0933221144', 1, N'Đại lộ Hòa Bình, Ninh Kiều, Cần Thơ'),
('TV006', N'Đỗ Thu F', 'dothuf@gmail.com', '0977766554', 0, N'Đường Nguyễn Trãi, TP. Vinh, Nghệ An'),
('TV007', N'Bùi Văn G', 'buivang@gmail.com', '0955544332', 1, N'Khu phố Vân Đồn, TP. Hạ Long, Quảng Ninh'),
('TV008', N'Vũ Thị H', 'vuthih@gmail.com', '0944332211', 0, N'Đường Lý Thái Tổ, TP. Bắc Ninh'),
('TV009', N'Ngô Quốc I', 'ngoquoci@gmail.com', '0966112233', 1, N'Đường Hùng Vương, TP. Huế, Thừa Thiên Huế'),
('TV010', N'Đinh Thị K', 'dinhthik@gmail.com', '0988776655', 0, N'Quận Thủ Dầu Một, Bình Dương'),
('TV011', N'Nguyễn Thị L', 'nguyenthil@gmail.com', '0987112233', 0, N'Đường Trần Duy Hưng, Cầu Giấy, Hà Nội'),
('TV012', N'Phạm Văn M', 'phamvanm@gmail.com', '0912456789', 1, N'Quận Bình Thạnh, TP. Hồ Chí Minh'),
('TV013', N'Hoàng Thị N', 'hoangthin@gmail.com', '0933445566', 0, N'Đường Nguyễn Văn Linh, Hải Châu, Đà Nẵng'),
('TV014', N'Trần Minh O', 'tranminho@gmail.com', '0944556677', 1, N'Phường Minh Khai, Bắc Từ Liêm, Hà Nội'),
('TV015', N'Lê Quốc P', 'lequocp@gmail.com', '0965667788', 1, N'Đại lộ Võ Văn Kiệt, Quận 5, TP. Hồ Chí Minh'),
('TV016', N'Bùi Thị Q', 'buithiq@gmail.com', '0976778899', 0, N'Khu dân cư Đông Hưng, Cẩm Lệ, Đà Nẵng'),
('TV017', N'Nguyễn Văn R', 'nguyenvanr@gmail.com', '0987889900', 1, N'Đường Lạch Tray, Ngô Quyền, Hải Phòng'),
('TV018', N'Phạm Minh S', 'phamminhs@gmail.com', '0998990011', 1, N'Khu phố Trung Sơn, Bình Chánh, TP. Hồ Chí Minh'),
('TV019', N'Vũ Thị T', 'vuthitt@gmail.com', '0909111223', 0, N'Phố Bạch Mai, Hai Bà Trưng, Hà Nội'),
('TV020', N'Trần Văn U', 'tranvanu@gmail.com', '0910222334', 1, N'Khu đô thị Phú Mỹ Hưng, Quận 7, TP. Hồ Chí Minh'),
('TV021', N'Lê Thu V', 'lethuv@gmail.com', '0921333445', 0, N'Đường Trần Phú, Quận 5, TP. Hồ Chí Minh'),
('TV022', N'Hoàng Minh W', 'hoangminhw@gmail.com', '0932444556', 1, N'Phường Hưng Dũng, TP. Vinh, Nghệ An'),
('TV023', N'Bùi Văn X', 'buivanx@gmail.com', '0943555667', 1, N'Đường Nguyễn Văn Cừ, TP. Bắc Ninh'),
('TV024', N'Nguyễn Thị Y', 'nguyenthiy@gmail.com', '0954666778', 0, N'Đại lộ Hòa Bình, Quận Ninh Kiều, Cần Thơ'),
('TV025', N'Trần Quốc Z', 'tranquocz@gmail.com', '0965777889', 1, N'Phố Trần Hưng Đạo, Hoàn Kiếm, Hà Nội'),
('TV026', N'Phạm Thị AA', 'phamthiaa@gmail.com', '0976888990', 0, N'Đường 30 Tháng 4, Thủ Dầu Một, Bình Dương'),
('TV027', N'Hoàng Văn BB', 'hoangvanbb@gmail.com', '0987999001', 1, N'Đại lộ Nguyễn Tất Thành, TP. Nha Trang'),
('TV028', N'Bùi Thị CC', 'buithicc@gmail.com', '0998000112', 0, N'Đường Trường Chinh, Quận Thanh Xuân, Hà Nội'),
('TV029', N'Lê Văn DD', 'levandd@gmail.com', '0909111223', 1, N'Thành phố Biên Hòa, Đồng Nai'),
('TV030', N'Nguyễn Thị EE', 'nguyenthiee@gmail.com', '0910222334', 0, N'Trung tâm hành chính Bình Dương, TP. Thủ Dầu Một');