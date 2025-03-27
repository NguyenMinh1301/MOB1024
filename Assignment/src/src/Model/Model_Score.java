package src.Model;

public class Model_Score {
    private String idStudent;
    private String name;
    private float english;
    private float computer;
    private float physical;

    public Model_Score() {
    }

    public Model_Score(String idStudent, String name, float english, float computer, float physical) {
        this.idStudent = idStudent;
        this.name = name;
        this.english = english;
        this.computer = computer;
        this.physical = physical;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getComputer() {
        return computer;
    }

    public void setComputer(float computer) {
        this.computer = computer;
    }

    public float getPhysical() {
        return physical;
    }

    public void setPhysical(float physical) {
        this.physical = physical;
    }

}
