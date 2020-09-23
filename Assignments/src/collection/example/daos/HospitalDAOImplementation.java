package collection.example.daos;

import java.util.ArrayList;

import collection.example.entity.DoctorClass;
import collection.example.entity.PatientClass;
import collection.example.ifaces.HospitalDAO;


public class HospitalDAOImplementation implements HospitalDAO {

	ArrayList<DoctorClass> arrayListOfDoctor;
	ArrayList<PatientClass> arrayListOfPatient;
	
	
	
	public HospitalDAOImplementation() {
		super();
		
		arrayListOfDoctor = new ArrayList<DoctorClass>();
		arrayListOfPatient = new ArrayList<PatientClass>();
	}

	@Override
	public ArrayList<DoctorClass> findAllDoctor() {
		// TODO Auto-generated method stub
		return this.arrayListOfDoctor;
	}

	@Override
	public DoctorClass retrieveDoctor(DoctorClass doctorId) {
		int index = 0;
		DoctorClass record =null;
		if(this.arrayListOfDoctor.contains(doctorId))
		{
			try {
				index = this.arrayListOfDoctor.indexOf(doctorId);
				record = this.arrayListOfDoctor.get(index);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid index");
				e.printStackTrace();
			}
		}
		return record;
	}

	@Override
	public boolean addDoctor(DoctorClass doctorElement) {
		
		
		return this.arrayListOfDoctor.add(doctorElement);
	}

	@Override
	public ArrayList<PatientClass> findAllPatient() {
		// TODO Auto-generated method stub
		return this.arrayListOfPatient;
	}

	@Override
	public boolean addPatient(PatientClass patientElement) {
		// TODO Auto-generated method stub
		return this.arrayListOfPatient.add(patientElement);
	}

	@Override
	public PatientClass retrievePatient(PatientClass patientId) {
		int index=0;
		PatientClass record = null;
		if(this.arrayListOfPatient.contains(patientId))
			{
				try {
					index = this.arrayListOfPatient.indexOf(patientId);
					record = this.arrayListOfPatient.get(index);
					System.out.println(record);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Invalid index");
					e.printStackTrace();
				}
			}
		return record;
	}

	

}
