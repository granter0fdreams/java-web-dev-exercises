package org.launchcode.java.exercises.lsn3classesandobjectspt1.school;

import java.util.ArrayList;

public class Course {
    //At least 3 fields
    //Name
    private String name;
    //List of Students
    private ArrayList<Student> students;
    //Number of credits
    private int worthNumOfCredits;

    public Course(String name, int numOfCredits){
        this.name = name;
        this.worthNumOfCredits = numOfCredits;
    }

    @Override
    public String toString() {
        return this.name + " is worth " + this.worthNumOfCredits + " number of credits.";
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Course) == false) return false;
        Course myCourseObj = (Course) obj;

        if (myCourseObj.name.equals(this.name)) return true;
        else return false;

    }
}
