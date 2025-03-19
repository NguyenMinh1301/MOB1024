package Bai2_Bai3;

import java.io.Serializable;

public class Staff implements Serializable {

    private String name;
    private double salary;

    public Staff() {
    }

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
