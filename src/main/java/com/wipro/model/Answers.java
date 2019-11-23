package com.wipro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String email;
    String Question1;
    String Question2;
    String Question3;
    String Question4;
    String Question5;
    String assessment;
    int marks;
    String result;
    String takenOn;
    int totalMarks;

    public String getQuestion1() {
        return Question1;
    }

    public void setQuestion1(String question1) {
        Question1 = question1;
    }

    public String getQuestion2() {
        return Question2;
    }

    public void setQuestion2(String question2) {
        Question2 = question2;
    }

    public String getQuestion3() {
        return Question3;
    }

    public void setQuestion3(String question3) {
        Question3 = question3;
    }

    public String getQuestion4() {
        return Question4;
    }

    public void setQuestion4(String question4) {
        Question4 = question4;
    }

    public String getQuestion5() {
        return Question5;
    }

    public void setQuestion5(String question5) {
        Question5 = question5;
    }

    @Override
    public String toString() {
        return "Answers [Question1=" + Question1 + ", Question2=" + Question2 + ", Question3=" + Question3
                + ", Question4=" + Question4 + ", Question5=" + Question5 + "]";
    }

    public Answers() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }


    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTakenOn() {
        return takenOn;
    }

    public void setTakenOn(String takenOn) {
        this.takenOn = takenOn;
    }

    public Answers(String email, String question1, String question2, String question3, String question4,
            String question5, String assessment, int marks, String result, String takenOn, int totalMarks) {
        this.email = email;
        Question1 = question1;
        Question2 = question2;
        Question3 = question3;
        Question4 = question4;
        Question5 = question5;
        this.assessment = assessment;
        this.marks = marks;
        this.result = result;
        this.takenOn = takenOn;
        this.totalMarks = totalMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}