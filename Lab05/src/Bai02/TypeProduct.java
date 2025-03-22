package Bai02;

public class TypeProduct {
    private int typeId;
    private String typeName;

    public TypeProduct() {
    }

    public TypeProduct(int typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    
    @Override
    public String toString() {
        return this.getTypeName(); // Trả về tên loại sản phẩm để hiển thị trong combobox
    }
    
}
