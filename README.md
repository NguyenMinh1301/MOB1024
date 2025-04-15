# Thực Hành Lập Trình Java 2

Dự án này chứa các bài thực hành lập trình Java dựa trên khóa học **MOB1024 – Lập Trình Java 2**. Mỗi bài lab tập trung vào một chủ đề nâng cao của lập trình Java như GUI, JDBC, Socket, Email, Đa luồng và các kỹ thuật OOP chuyên sâu.

---

## Mục Lục

1. [Tổng Quan](#tổng-quan)
2. [Tóm Tắt Các Lab](#tóm-tắt-các-lab)
   - [Lab 1: Giao Diện Và Sự Kiện](#lab-1-giao-diện-và-sự-kiện)
   - [Lab 2: JTable, JCombobox, JSlider](#lab-2-jtable-jcombobox-jslider)
   - [Lab 3: Menu, JFileChooser, XFile](#lab-3-menu-jfilechooser-xfile)
   - [Lab 4: JDBC Cơ Bản – CRUD Sinh Viên](#lab-4-jdbc-cơ-bản--crud-sinh-viên)
   - [Lab 5: CRUD Sản Phẩm – JTable nâng cao](#lab-5-crud-sản-phẩm--jtable-nâng-cao)
   - [Lab 6: Đa Luồng](#lab-6-đa-luồng)
   - [Lab 7: Socket và Email](#lab-7-socket-và-email)
   - [Lab 8: Generic, Enum, DAO](#lab-8-generic-enum-dao)
3. [Hướng Dẫn Cài Đặt](#hướng-dẫn-cài-đặt)
4. [Thông Tin Liên Hệ](#thông-tin-liên-hệ)

---

## Tổng Quan

Bộ bài tập này giúp sinh viên làm quen với các công nghệ Java nâng cao thông qua việc xây dựng ứng dụng quản lý, giao tiếp mạng, đa luồng và thao tác với cơ sở dữ liệu.

---

## Tóm Tắt Các Lab

### Lab 1: Giao Diện Và Sự Kiện

- **Mục tiêu**: Thiết kế giao diện, xử lý sự kiện, tạo form login, validate và quản lý nhân viên.
- **Nội dung**:
  - Tính toán số học (calculator).
  - Sử dụng các loại `JOptionPane`.
  - Xử lý sự kiện form đăng nhập.
  - Giao diện quản lý sinh viên với validate & reset.

### Lab 2: JTable, JCombobox, JSlider

- **Mục tiêu**: Thành thạo các component nâng cao.
- **Nội dung**:
  - Quản lý học viên với `JTable`, `JComboBox`, `JProgressBar`.
  - Thêm, sửa, xóa sinh viên.
  - Sắp xếp theo tên/điểm.
  - Đồng bộ giá trị `JSlider` với font size.

### Lab 3: Menu, JFileChooser, XFile

- **Mục tiêu**: Làm việc với menu, thao tác file, quản lý nhân viên.
- **Nội dung**:
  - Xây dựng ứng dụng xử lý menu và toolbar.
  - Ghi/đọc file với `XFile`.
  - Quản lý nhân viên bằng file đối tượng.

### Lab 4: JDBC Cơ Bản – CRUD Sinh Viên

- **Mục tiêu**: Làm việc với SQL Server qua JDBC.
- **Nội dung**:
  - Kết nối và truy vấn CSDL.
  - CRUD bảng `Students`.
  - Điều hướng bản ghi (First, Next...).

### Lab 5: CRUD Sản Phẩm – JTable nâng cao

- **Mục tiêu**: Tương tác mạnh với `JTable`, `JComboBox`, và DAO.
- **Nội dung**:
  - Tìm kiếm, xoá sách từ database.
  - Quản lý sản phẩm, loại sản phẩm.
  - Xử lý nút điều hướng, cập nhật form động.

### Lab 6: Đa Luồng

- **Mục tiêu**: Sử dụng `Thread`, `Runnable`, `join`, `sleep`, `priority`.
- **Nội dung**:
  - Tạo đồng hồ thời gian thực.
  - Sổ xố 3 số.
  - Thread in số lẻ/chẵn và đồng bộ bằng `join`.

### Lab 7: Socket và Email

- **Mục tiêu**: Lập trình mạng với Socket TCP và gửi email qua SMTP.
- **Nội dung**:
  - Xây dựng ứng dụng chat (client-server).
  - Mô phỏng Messenger đơn giản.
  - Gửi email có đính kèm và CC bằng JavaMail API.

### Lab 8: Generic, Enum, DAO

- **Mục tiêu**: Thực hành với `ArrayList`, `Enum`, `DAO pattern`, `Annotation`.
- **Nội dung**:
  - Generic `ArrayList`.
  - Quản lý sản phẩm với lớp DAO.
  - Sử dụng `static import`, `boxing/unboxing`.

---

## Hướng Dẫn Cài Đặt

1. Cài đặt [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Cài đặt [NetBeans IDE](https://netbeans.apache.org/) hoặc [IntelliJ IDEA](https://www.jetbrains.com/idea/).
3. Cài đặt SQL Server (nếu làm bài JDBC).
4. Clone dự án:
   ```bash
   git clone https://github.com/ten-ban/MOB1024-Java2-Labs.git
---
## Thông Tin Liên Hệ
Nếu bạn có bất kỳ câu hỏi hoặc ý kiến nào, vui lòng liên hệ:
- **Email**: nguyenminh1301.dev@gmail.com
- **GitHub**: [NguyenMinh1301](https://github.com/NguyenMinh1301)

Chúc bạn học tốt!