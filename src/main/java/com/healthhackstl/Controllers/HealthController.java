package com.healthhackstl.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="health")
public class HealthController {

    @RequestMapping(value="/diet")
    public String diet(Model model) {

        return "health/diet";
    }

    @RequestMapping(value="/drink")
    public String drink(Model model) {

        return "health/drink";
    }

    @RequestMapping(value="/smoke")
    public String smoke(Model model) {

        return "health/smoke";
    }
}