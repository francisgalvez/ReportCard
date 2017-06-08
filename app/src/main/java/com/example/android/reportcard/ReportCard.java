package com.example.android.reportcard;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Francis Gálvez on 08/06/2017.
 */

public class ReportCard {
    private String studentName;
    private String studentYear;
    private HashMap<String, Integer> grades;

    public ReportCard(String studentName, String studentYear){
        this.studentName = studentName;
        this.studentYear = studentYear;
        this.grades = new HashMap<String, Integer>();
    }

    public ReportCard(String studentName, String studentYear, HashMap<String, Integer> grades) {
        this.studentName = studentName;
        this.studentYear = studentYear;
        this.grades = grades;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(String studentYear) {
        this.studentYear = studentYear;
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<String, Integer> grades) {
        this.grades = grades;
    }

    public double getAverage() {
        double average = 0;

        for (Map.Entry<String, Integer> it : grades.entrySet()) {
            average += it.getValue();
        }

        return average / grades.size();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(studentName + ", who is studying " + studentYear + " got this grades:\n");

        for(Map.Entry<String, Integer> it : grades.entrySet()){
            sb.append(it.getKey() + ": " + it.getValue() + "\n");
        }

        sb.append("Your grade point average is " + this.getAverage());
        
        return sb.toString();
    }
}
