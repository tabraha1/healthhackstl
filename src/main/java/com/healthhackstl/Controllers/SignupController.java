package com.healthhackstl.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/signup")
@Controller
public class SignupController {

    @RequestMapping(value="")
    public String index(Model model) {

        return "new/signup";
    }

    @RequestMapping(value="/start")
    public String ready(Model model) {

        return "new/ready";
    }

    @RequestMapping(value="start/mood")
    public String mood(Model model) {

        return "new/healthmood";
    }

    @RequestMapping(value="start/welcome")
    public String welcome(Model model) {

        return "new/welcome";
    }


}
