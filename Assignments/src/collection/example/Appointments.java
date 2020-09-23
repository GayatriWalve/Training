package collection.example;

import java.util.ArrayList;
import java.util.HashMap;


import collection.example.entity.DoctorClass;
import collection.example.entity.PatientClass;

public class Appointments {

	HashMap<DoctorClass,ArrayList<PatientClass>> AppointmentTable ;
	ArrayList<DoctorClass> arrayListOfDoctor;
	ArrayList<PatientClass> tempListOfPatient;
	ArrayList<PatientClass> arrayListOfPatient;
	
	
	public Appointments(){
		super();
		this.AppointmentTable = new HashMap<DoctorClass, ArrayList<PatientClass>>();
		this.arrayListOfDoctor = new ArrayList<DoctorClass>();
		this.arrayListOfPatient = new ArrayList<PatientClass>();
	}
	
	
	public boolean bookAppointment(DoctorClass doctor, PatientClass patient)
	{
		this.tempListOfPatient = new ArrayList<PatientClass>();
		
		if(!doctorExist(doctor))
		{
			this.tempListOfPatient.add(patient);
			//this.AppointmentTable.put(doctor, tempListOfPatient);			
		}
		else
		{
			this.tempListOfPatient = AppointmentTable.get(doctor);
			this.tempListOfPatient.add(patient);
		}
		
		this.AppointmentTable.put(doctor, tempListOfPatient);
		return true;
	}
	
	public boolean doctorExist(DoctorClass doctor)
	{
	   return this.arrayListOfDoctor.contains(doctor);
	}
	
	public boolean cancelAppointment(DoctorClass doctor, PatientClass patient)
	{
		this.tempListOfPatient = new ArrayList<PatientClass>();
		
		this.tempListOfPatient = AppointmentTable.get(doctor);
		
		this.tempListOfPatient.remove(patient);
		this.AppointmentTable.put(doctor, tempListOfPatient);
		
		return true;
	}
	
	public HashMap<DoctorClass,ArrayList<PatientClass>> viewAppointment()
	{
	
		return this.AppointmentTable;
	}
}

