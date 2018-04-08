package com.healthhackstl.data.repository;

import com.healthhackstl.data.entity.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    Doctor findBylastName(String lastName);
}
