//package com.healthhackstl.Controllers;
//
//import com.healthhackstl.data.entity.Patient;
//import com.healthhackstl.data.repository.PatientRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.propertyeditors.PathEditor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//@Controller
//@RequestMapping(value="profile")
//public class ProfileController {
//
//    @Autowired
//    private PatientRepository patientRepository;
//
//    @RequestMapping(value="/all")
//    public String index(Model model){
//
////        Iterable<User> users = this.userRepository.findAll();
//
//        Iterable<Patient> patients = this.patientRepository.findAll();
//
//        model.addAttribute("userInfo", patients);
//
//        return "home";
//
//    }
//}
