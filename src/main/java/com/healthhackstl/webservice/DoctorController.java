package com.healthhackstl.webservice;

import com.healthhackstl.data.entity.Doctor;
import com.healthhackstl.data.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @RequestMapping(value="/doctors", method = RequestMethod.GET)
    List<Doctor> findAll(@RequestParam(required =false) String lastName) {
        List<Doctor> doctors = new ArrayList<>();
        if(lastName==null) {
            Iterable<Doctor> results = this.repository.findAll();
            results.forEach(doc -> {
                doctors.add(doc);
            });
        } else {
            Doctor doctor = this.repository.findBylastName(lastName);
        }

        return doctors;
    }
}
