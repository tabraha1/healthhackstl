package com.healthhackstl.data.repository;

import com.healthhackstl.data.entity.DoctorVisit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DoctorVisitRepository extends CrudRepository<DoctorVisit, Long> {

    List<DoctorVisit> findByDate(Date date);

}
