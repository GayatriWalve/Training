package collection.example;

import java.util.ArrayList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import collection.example.daos.HospitalDAOImplementation;
import collection.example.entity.DoctorClass;
import collection.example.entity.PatientClass;
import collection.example.ifaces.HospitalDAO;

public class CollectionApplication {

	public static void printDoctorsList(ArrayList<DoctorClass> doctorList )
	{
		
		Iterator<DoctorClass>iterator = doctorList.iterator();//just like for each loop we have iterator
		while(iterator.hasNext())
		{
			DoctorClass drclass = iterator.next();
			System.out.println(drclass);
		}
	}
	
	public static void printPatientsList(ArrayList<PatientClass> patientList )
	{
		
		Iterator<PatientClass>iterator1 = patientList.iterator();//just like for each loop we have iterator
		while(iterator1.hasNext())
		{
			PatientClass patientclass = iterator1.next();
			System.out.println(patientclass);
		}
	}
	public static void printAppointment(HashMap<DoctorClass,ArrayList<PatientClass>> myHashTable)
	{
		ArrayList<PatientClass> temp = new ArrayList<PatientClass>();
		Set<Map.Entry<DoctorClass, ArrayList<PatientClass>>> myList = myHashTable.entrySet();
		for(Map.Entry<DoctorClass,ArrayList<PatientClass>> eachEntry: myList)
		{
			System.out.println("\n\n\n");
			
			System.out.println(eachEntry.getKey());
			temp = eachEntry.getValue();
			printPatientsList(temp);
	
		}
	}
	
	public static void main(String[] args) {
		
    DoctorClass ram = new DoctorClass(101,"Ramesh", "MD", 1500);
    DoctorClass sham = new DoctorClass(102,"Sham", "MBBS", 1000);
    DoctorClass neha = new DoctorClass(103,"Neha", "BHMS", 800);
    
    HospitalDAO hospitaldao = new HospitalDAOImplementation();
    
   hospitaldao.addDoctor(ram);
   hospitaldao.addDoctor(sham);
   hospitaldao.addDoctor(neha);
    
   PatientClass ravi = new PatientClass(11, "Ravikumar", 30);
   PatientClass raj = new PatientClass(12, "Rajveer", 25);
   
   PatientClass rani = new PatientClass(13, "Rani kumari", 45);   
   PatientClass tejal = new PatientClass(14, "Tejal", 30);
   
   PatientClass raju = new PatientClass(15, "Rajaram", 40);   
   PatientClass pavan = new PatientClass(16, "Pavan Divan", 30);
   
   hospitaldao.addPatient(ravi);
   hospitaldao.addPatient(raj);
   hospitaldao.addPatient(tejal);
   hospitaldao.addPatient(rani);
   hospitaldao.addPatient(raju);
   hospitaldao.addPatient(pavan);
   
	ArrayList<DoctorClass>	doctorList = hospitaldao.findAllDoctor();

	ArrayList<PatientClass> patientList = hospitaldao.findAllPatient();
	System.out.println("Doctors List ");
	printDoctorsList(doctorList);
	
	System.out.println("Patients List");
	printPatientsList(patientList);
	
	PatientClass patient = hospitaldao.retrievePatient(pavan);
	System.out.println("Details:"+patient);
	
	DoctorClass doctor = hospitaldao.retrieveDoctor(ram);
	System.out.println("Details:"+doctor);
	
	
	Appointments myAppointment = new Appointments();
	HashMap<DoctorClass,ArrayList<PatientClass>> myHashTable  = new HashMap<DoctorClass, ArrayList<PatientClass>>();
	myAppointment.bookAppointment(ram, ravi);
    myAppointment.bookAppointment(ram, tejal);
    myAppointment.bookAppointment(neha, pavan);
    myAppointment.bookAppointment(neha, raju);
    myAppointment.bookAppointment(sham,rani );
    myAppointment.bookAppointment(sham, raj);
	
    System.out.println("All Appointments:\n\n");
	myHashTable= myAppointment.viewAppointment();
	printAppointment(myHashTable);
	
}
	
}
