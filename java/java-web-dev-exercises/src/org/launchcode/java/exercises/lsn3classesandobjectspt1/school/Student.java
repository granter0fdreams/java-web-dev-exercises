package org.launchcode.java.exercises.lsn3classesandobjectspt1.school;

public class Student {

    public static void main(String[] args){
        Student myself = new Student("Jess", 1, 1, 4.0);
        Student twin = new Student("Jess", 2, 1, 4.0);
        Teacher theTeacher = new Teacher();
//        String myGradeLevel = myself.getGradeLevel();
//        System.out.println(myGradeLevel);
//        myself.addGrade(3, 3.0);
//        System.out.println(myself.gpa);

//        System.out.println(myself.equals(twin));
//        System.out.println(myself.equals(theTeacher));

        Course myFirstCourse = new Course("My First Course", 3);
        Course mySecondCourse = new Course("My Second Course", 4);

        System.out.println(myFirstCourse.toString());


    }
    //class variables
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;
    //constructors
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

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa

        //The quality score for a class is found by multiplying the letter grade score (0.0-4.0) by the number of credits.
        //quality score = letter grade (0.0-4.0) + number of credits
        //The total quality score is the sum of the quality scores for all classes.

        //Calculate their current total quality score by using the formula gpa * numberOfCredits.
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;

        //Use the new course grade and course credits to update their total quality score.
        double newQualityScore = grade * courseCredits;
        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;

        //Update the student’s total numberOfCredits.
        int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
        this.numberOfCredits = newTotalNumberOfCredits;

        //Compute their new GPA.
        double newGpa = newTotalQualityScore / newTotalNumberOfCredits;
        this.gpa = newGpa;

    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        //Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits).

        if (this.numberOfCredits >= 0 && this.numberOfCredits <=29){
            return "Freshman";
        } else if (this.numberOfCredits <=59){
            return "Sophomore";
        } else if (this.numberOfCredits <=89){
            return "Junior";
        } else if (this.numberOfCredits >=90){
            return "Senior";
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return this.name + ":" + this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Student) == false) return false;
        Student myStudentObj = (Student) obj;

        if (myStudentObj.name.equals(this.name)) return true;
        else return false;

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
