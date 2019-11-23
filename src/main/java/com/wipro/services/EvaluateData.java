package com.wipro.services;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.wipro.model.Answers;
import com.wipro.repositories.AnswersRepository;

import org.springframework.ui.Model;

public class EvaluateData {
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY HH:MM:SS");
    
    public static void evaluate(Answers answer, Model model, AnswersRepository answersRepository) {
        int marks = 0;
        if(answer.getAssessment().equals("Spring-L1")) {
            if (answer.getQuestion1().equals("J2EE App Development Framework"))
                marks += 10;
            if (answer.getQuestion2().equals("Inversion Of Control"))
                marks += 10;
            if (answer.getQuestion3().equals("Aspect Oriented Programming"))
                marks += 10;
            if (answer.getQuestion4().equals("Application Context"))
                marks += 10;
            if (answer.getQuestion5().equals("Dispatcher Servlet"))
                marks += 10;
        } else {
            if (answer.getQuestion1().equals("Object Relational Mapping"))
                marks += 10;
            if (answer.getQuestion2().equals("uni-directional & bi-directional"))
                marks += 10;
            if (answer.getQuestion3().equals("configuration file"))
                marks += 10;
            if (answer.getQuestion4().equals("Hibernate Query Language"))
                marks += 10;
            if (answer.getQuestion5().equals("isolation levels"))
                marks += 10;
        }
        answer.setMarks(marks);
        answer.setTakenOn(sdf.format(new Date()));
        answer.setTotalMarks(50);
        if(marks>=30){
            model.addAttribute("msg", "Congratulations !!! You have passed !!!");
            model.addAttribute("title", "Success Page");
            answer.setResult("Passed");
        } else {
            model.addAttribute("msg", "Sorry !!! Better Luck Next Time !!!");
            model.addAttribute("title", "Failure Page");
            answer.setResult("Failed");
        }
        answersRepository.save(answer);
    }
}