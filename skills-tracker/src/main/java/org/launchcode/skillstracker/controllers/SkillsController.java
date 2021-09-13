package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {


    @ResponseBody
    private String threeLanguagesPrint(){
        String string = "<html>" +
                "<head>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Programming Languages</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Ruby on Rails</li>" +
                "</ol>" +
                "</body>" +
                "</head>" +
                "</html>";
        return String;
    }


}
