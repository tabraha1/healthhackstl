package com.healthhackstl.business.service;

//@Service
//public class DoctorVisitService {
//
//
//    private DoctorRepository doctorRepository;
//    private UserRepository userRepository;
//    private DoctorVisitRepository doctorVisitRepository;
//
//    @Autowired
//    public DoctorVisitService(DoctorRepository doctorRepository, UserRepository userRepository, DoctorVisitRepository doctorVisitRepository) {
//        this.doctorRepository = doctorRepository;
//        this.userRepository = userRepository;
//        this.doctorVisitRepository = doctorVisitRepository;
//    }

//    public List<Doctor> getAllVisitInfo() {
//
//        List<Doctor> doctors = new ArrayList<>();
//        this.doctorRepository.findAll().forEach(doctors::add);
//        return doctors;
//
//    }

//    public List<UsersVisit> getUsersVisit(Date date){
//
//        Iterable<Doctor> doctors = this.doctorRepository.findAll();
//        Map<Long, UsersVisit> usersVisitMap = new HashMap<>();
//        for(Doctor doc :  doctors) {
//            UsersVisit usersVisit = new UsersVisit();
//            usersVisit.setDoctorId(doc.getId());
//            usersVisit.setDoctorName(doc.getLastName());
//            usersVisit.setVisitInfo(doc.getVisitInfo());
//            usersVisit.setAddress(doc.getAddress());
//            usersVisitMap.put(doc.getId(), usersVisit);
//        }
//
//        Iterable<DoctorVisit> visits = this.doctorVisitRepository.findByDate(new java.sql.Date(date.getTime()));
//
//    }


//}

//import com.healthhackstl.business.service.domain.UsersVisit;
//import com.healthhackstl.data.entity.Patient;
//import com.healthhackstl.data.repository.PatientRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class DoctorVisitService {
//
//    private PatientRepository patientRepository;
//
//    @Autowired
//    public DoctorVisitService(PatientRepository patientRepository) {
//        this.patientRepository = patientRepository;
//    }
//
//    public Patient getPatientByLastName(){
//        Iterable<Patient> patients = this.patientRepository.findAll();
//        for(Patient p : patients) {
//            UsersVisit usersVisit = new UsersVisit();
//            if(p!=null) {
//                usersVisit.setUserFirstName(p.getFirstName());
//                usersVisit.setUserLastName(p.getLastName());
//            }
//        }
//    }
//}