package Bai1_Bai2_Bai3;

public class Student {

    private String name;
    private Double mark;
    private String course;

    public Student(String name, Double mark, String course) {
        this.name = name;
        this.mark = mark;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        if (this.mark < 3) {
            return "Least";
        }
        if (this.mark < 5) {
            return "Weak";
        }
        if (this.mark < 6.5) {
            return "Medium";
        }
        if (this.mark < 7.5) {
            return "Rather";
        }
        if (this.mark < 9) {
            return "Good";
        } else {
            return "Excellent";
        }
    }
    
    public boolean isBonus() {
        return this.mark >= 7.5;
    }
}
