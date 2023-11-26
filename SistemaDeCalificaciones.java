// Ejemplo de código para el sistema de calificaciones
public class Student {
    private String name;
    private String class;
    private int totalSubjects;
    private int[] grades;
 
    public Student(String name, String class, int totalSubjects, int[] grades) {
        this.name = name;
        this.class = class;
        this.totalSubjects = totalSubjects;
        this.grades = grades;
    }
 
    public String getName() {
        return name;
    }
 
    public String getClass() {
        return class;
    }
 
    public int getTotalSubjects() {
        return totalSubjects;
    }
 
    public int[] getGrades() {
        return grades;
    }
 
    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / totalSubjects;
    }
 }
 