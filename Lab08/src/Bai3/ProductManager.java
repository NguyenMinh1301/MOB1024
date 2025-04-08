package Bai3;

public class ProductManager {
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();

        Product p1 = new Product("Laptop", 1500.0);
        Product p2 = new Product("Smartphone", 850.0);

        dao.add(p1);
        dao.add(p2);

        for (Product p : dao.getList()) {
            System.out.println(p);
        }

        Product updateP1 = new Product("Laptop", 1350.0);
        dao.update(updateP1);

        System.out.println("After update:");
        for (Product p : dao.getList()) {
            System.out.println(p);
        }

        Product found = dao.find("Smartphone");
        System.out.println("Found product: " + found);

        
        dao.load("products.dat");
        dao.getList().clear();
        System.out.println("List cleared.");

        dao.store("products.dat");
        System.out.println("After loading from file:");
        for (Product p : dao.getList()) {
            System.out.println(p);
        }
    }
}
