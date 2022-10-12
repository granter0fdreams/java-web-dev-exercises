package org.launchcode.java.exercises.lsn3classesandobjectspt1.school;

public class Student {

    public static void main(String[] args){
        Student myself = new Student("Jess", 1, 1, 4.0);
    }
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    /*Getters and Setters*/
    public String getName() { return this.name; }
    public void setName(String name){ this.name = name;}

    public int getStudentId(){ return this.studentId;}
    private void setStudentId(int studentId){  this.studentId = studentId; }

    public int getNumberOfCredits() { return numberOfCredits; }
    private void setNumberOfCredits(int numberOfCredits) { this.numberOfCredits = numberOfCredits; }

    public double getGpa() { return gpa; }
    private void setGpa(double gpa) { this.gpa = gpa; }
}
