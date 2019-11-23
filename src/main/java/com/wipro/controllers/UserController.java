package com.wipro.controllers;

import java.util.List;

import com.wipro.model.*;
import com.wipro.repositories.*;
import com.wipro.services.EvaluateData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AnswersRepository answersRepository;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping("/register.html")
    public String register() {
        return "thymeleaf/register";
    }

    @RequestMapping(value = "registration/do", method = RequestMethod.POST) 
    public String registerUser(@Validated User user, Model model){
        user.setUserType("candidate");
        this.userRepository.save(user);
        model.addAttribute("firstName", user.getfirstname());
        model.addAttribute("lastName", user.getlastname());
        return "registrationSuccess";
    }

    @RequestMapping(value="login/do", method = RequestMethod.POST)
    public String login(@Validated User user, Model model) {
        User inputData = this.userRepository.findById(user.getemail()).orElse(null);
        if(inputData == null){
            model.addAttribute("msg", "Sorry you are not a registered User !!!");
            model.addAttribute("title", "Invalid User Page");
            model.addAttribute("linkText", "Home Page");
            model.addAttribute("valid", false);
        } else {
            inputData = this.userRepository.findByEmailAndPassword(user.getemail(), user.getPassword());
            if(inputData == null){
                model.addAttribute("msg", "Sorry your Password is Wrong !!! Login again !!!");
                model.addAttribute("title", "Password Error Page");
                model.addAttribute("linkText", "login again");
                model.addAttribute("valid", false);
            } else {
                model.addAttribute("email", user.getemail());
                model.addAttribute("title", "Select Tests");
                model.addAttribute("linkText", "Logout");
                model.addAttribute("valid", true);
                model.addAttribute("userType", inputData.getUserType());
                if(inputData.getUserType().equals("candidate"))
                    model.addAttribute("msg", "Select the Test");
                else
                    model.addAttribute("msg", "Select Reports");
            }
        }
        return "loginResult";
    }

    @RequestMapping(value="springAssessment.html")
    public String springAssessment(@Validated User user, Model model) {
        model.addAttribute("email", user.getemail());
        return "springAssessment";
    }

    @RequestMapping(value="hibernateAssessment.html")
    public String hibernateAssessment(@Validated User user, Model model) {
        model.addAttribute("email", user.getemail());
        return "hibernateAssessment";
    }
    
    @RequestMapping(value="evaluate/spring/test", method = RequestMethod.POST)
    public String evaluateSpring(@Validated Answers answer, Model model) { 
        EvaluateData.evaluate(answer, model, this.answersRepository);
        return "result";
    }

    @RequestMapping(value="evaluate/hibernate/test", method = RequestMethod.POST)
    public String evaluateHibernate(@Validated Answers answer, Model model) { 
        EvaluateData.evaluate(answer, model, this.answersRepository);
        return "result";
    }

    @RequestMapping(value="users/all")
    public String listUsers(@Validated User user, Model model) {
        List<User> users = userRepository.findAllSorted();
        model.addAttribute("users", users);
        return "listUsers";
    }

    @RequestMapping(value="tests/all")
    public String listTests(@Validated User user, Model model) {
        List<Answers> answers = answersRepository.findAllSorted();
        model.addAttribute("users", answers);
        return "listTests";
    }

}