package lab04;

public class Student {
    //Lớp student chứa các thuộc tính của sinh viên
    private String id;
    private String name;
    private String email;
    private String phone;
    private boolean gender;
    private String address;
    
    //Contructor không tham số
    public Student() {
    }

    //Contructor có tham số
    public Student(String id, String name, String email, String phone, boolean gender, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
    }
    
    //Getter và Shetter
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
