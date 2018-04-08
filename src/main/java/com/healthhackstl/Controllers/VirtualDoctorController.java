package com.healthhackstl.Controllers;

import com.healthhackstl.data.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="doctor")
public class VirtualDoctorController {

    @Autowired
    private DoctorRepository repository;

    @RequestMapping(value="")
    public String index(Model model) {

        model.addAttribute("title", "Pick your virtual Doctor");
        model.addAttribute("doctors", this.repository.findAll());

        return "home/home";
    }
}
