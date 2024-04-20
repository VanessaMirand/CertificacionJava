package INTERESCOMPUESTO;

public class Gradebook {
    private String courseName;
    private int total;
    private int gradeCounter;
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;


    // constructor
    public Gradebook(String name) {
        courseName = name;
    }
    //metodo set para el coursName

    public void setCourseName(String name) {
        courseName = name;

    }
    public String getCourseName() {
        return courseName;
    }
}


