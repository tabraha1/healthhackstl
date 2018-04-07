package com.healthhackstl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupController {

    @RequestMapping(value="/signup")
    public String index(Model model) {

        return "new/signup";
    }

    @RequestMapping(value="signup/mood")
    public String mood(Model model) {

        return "mood/healthmood";
    }


}
