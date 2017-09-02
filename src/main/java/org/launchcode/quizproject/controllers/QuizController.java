package org.launchcode.quizproject.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuizController {
    @RequestMapping(value = "")
    public String index(HttpServletRequest request){
        String name = request.getParameter("name");
        return "Hello " + name;
    }

    @RequestMapping(value="goodbye")
    public String goodbye(){
        return "Goodbye";
    }

}
