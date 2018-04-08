package com.healthhackstl.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="health")
public class HealthController {

    @RequestMapping(value="")
    public String index(Model model) {

        return "health/index";
    }

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

    @RequestMapping(value="/sleep")
    public String sleep(Model model) {

        return "health/sleep";
    }

    @RequestMapping(value="/depressed")
    public String depressed(Model model) {

        return "health/depressed";
    }

    @RequestMapping(value="/diabetes")
    public String diabetes(Model model) {

        return "health/diabetes";
    }

    @RequestMapping(value="/sick")
    public String sick(Model model) {

        return "health/sick";
    }

    @RequestMapping(value="/feeling")
    public String feeling(Model model) {

        return "health/feeling";
    }
}