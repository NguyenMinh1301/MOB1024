package Bai02;

public class Product {

    private String id;
    private String name;
    private double price;
    private int quantity;
    private TypeProduct TypeProduct;

    public Product() {
    }

    public Product(String id, String name, double price, int quantity, TypeProduct typeId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.TypeProduct = typeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TypeProduct getTypeProduct() {
        return TypeProduct;
    }

    public void setTypeProduct(TypeProduct typeId) {
        this.TypeProduct = typeId;
    }

    

}
