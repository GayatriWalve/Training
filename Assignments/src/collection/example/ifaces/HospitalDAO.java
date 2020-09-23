package collection.example.ifaces;

import java.util.ArrayList;
import java.util.Collection;
import collection.example.entity.DoctorClass;
import collection.example.entity.PatientClass;

public interface HospitalDAO {

	ArrayList<DoctorClass> findAllDoctor();
	DoctorClass retrieveDoctor(DoctorClass doctorId);
	
	boolean addDoctor(DoctorClass doctorElement);
	
	ArrayList<PatientClass> findAllPatient();
	
	boolean addPatient(PatientClass patientElement);
	PatientClass retrievePatient(PatientClass patientId);
	
	
}
