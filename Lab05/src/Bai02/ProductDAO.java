package Bai02;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductDAO {

    String INSERT_SQL = "INSERT INTO SanPham (MaSanPham, TenSP, DonGia, SoLuong, MaLoai) VALUES (?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE SanPham SET TenSP = ?, DonGia = ?, SoLuong = ?, MaLoai = ? WHERE MaSanPham = ?";
    String DELETE_SQL = "DELETE FROM SanPham WHERE MaSanPham = ?";
    String SELECT_ALL_SQL = "SELECT * FROM SanPham";
    String SELECT_BY_ID_SQL = "SELECT * FROM SanPham WHERE MaSanPham = ?";
    String SELECT_LOAISANPHAM_BY_ID_SQL = "SELECT * FROM LoaiSanPham WHERE MaLoai = ?";
    String SELECT_ALL_LOAISANPHAM_SQL = "SELECT * FROM LoaiSanPham";

    //Phương thức lưu sinh viên
    public void addProduct(Product product) {
        try (Connection conn = DB_Connector.getConnection(); PreparedStatement prstm = conn.prepareStatement(INSERT_SQL)) {

            //Set tham số cho câu truy vấn
            prstm.setString(1, product.getId());
            prstm.setString(2, product.getName());
            prstm.setDouble(3, product.getPrice());
            prstm.setInt(4, product.getQuantity());
            prstm.setInt(5, product.getTypeProduct().getTypeId());
            //Thực hiện câu truy vấn
            prstm.executeUpdate();

            JOptionPane.showMessageDialog(null, "Add success", "Notification", JOptionPane.INFORMATION_MESSAGE);
            conn.close();    //Đóng Connection
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Add failed", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
    }

    public void updateProduct(Product product) {
        try (Connection conn = DB_Connector.getConnection(); PreparedStatement prstm = conn.prepareStatement(UPDATE_SQL)) {

            //Set tham số cho câu truy vấn
            prstm.setString(1, product.getName());
            prstm.setDouble(2, product.getPrice());
            prstm.setInt(3, product.getQuantity());
            prstm.setInt(4, product.getTypeProduct().getTypeId());
            prstm.setString(5, product.getId());
            //Thực hiện câu truy vấn
            prstm.executeUpdate();

            JOptionPane.showMessageDialog(null, "Update success", "Notification", JOptionPane.INFORMATION_MESSAGE);
            conn.close();    //Đóng Connection
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Add failed", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }

    }

    public void deleteProduct(String productId) {
        try (Connection conn = DB_Connector.getConnection(); PreparedStatement prstm = conn.prepareStatement(DELETE_SQL)) {

            //Set tham số cho câu truy vấn
            prstm.setString(1, productId);
            //Thực hiện câu truy vấn
            prstm.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Delete failed", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
    }

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        try (Connection con = DB_Connector.getConnection(); Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery(SELECT_ALL_SQL)) {
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getString("MaSanPham"));
                product.setName(rs.getString("TenSP"));
                product.setPrice(rs.getDouble("DonGia"));
                product.setQuantity(rs.getInt("SoLuong"));
                int typeId = rs.getInt("MaLoai");
                product.setTypeProduct(this.getAllTypeProductById(typeId));
                list.add(product);

            }
        } catch (SQLException ex) {
            System.out.println("Error when get data from database " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error when get data from database", "Erorr", JOptionPane.ERROR);
        }
        return list;
    }

    public Product getAllProductById(String id) {
        Product product = new Product();
        try (Connection con = DB_Connector.getConnection(); PreparedStatement pstm = con.prepareStatement(SELECT_BY_ID_SQL)) {
            pstm.setString(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                product.setId(rs.getString("MaSanPham"));
                product.setName(rs.getString("TenSP"));
                product.setPrice(rs.getDouble("DonGia"));
                product.setQuantity(rs.getInt("SoLuong"));
                int typeId = rs.getInt("MaLoai");
                product.setTypeProduct(this.getAllTypeProductById(typeId));
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error when get data from database " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error when get data from database", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return product;
    }

    public List<TypeProduct> getAllTypeProduct() {
        List<TypeProduct> list = new ArrayList<>();

        try (Connection con = DB_Connector.getConnection(); Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery(SELECT_ALL_LOAISANPHAM_SQL)) {
            while (rs.next()) {
                TypeProduct typeProduct = new TypeProduct();
                typeProduct.setTypeId(rs.getInt("MaLoai"));
                typeProduct.setTypeName(rs.getString("TenLoai"));
                list.add(typeProduct);
            }
        } catch (Exception ex) {
            System.out.println("Error when get data from database " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error when get data from database", "Erorr", JOptionPane.ERROR);
        }
        return list;
    }

    public TypeProduct getAllTypeProductById(int id) {
        TypeProduct typeProduct = new TypeProduct();
        try (Connection con = DB_Connector.getConnection(); PreparedStatement pstm = con.prepareStatement(SELECT_LOAISANPHAM_BY_ID_SQL)) {
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                typeProduct.setTypeId(rs.getInt("MaLoai"));
                typeProduct.setTypeName(rs.getString("TenLoai"));
            }
            rs.close();
        } catch (Exception ex) {
            System.out.println("Error when get data from database " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error when get data from database", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return typeProduct;
    }

}
