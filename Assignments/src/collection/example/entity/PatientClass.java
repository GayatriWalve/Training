package collection.example.entity;

public class PatientClass implements Comparable<PatientClass> {

	private int patientId;
	private String patientName;
	private int patientAge;
	
	public PatientClass(int patientId, String patientName, int patientAge) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + patientAge;
		result = prime * result + patientId;
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatientClass other = (PatientClass) obj;
		if (patientAge != other.patientAge)
			return false;
		if (patientId != other.patientId)
			return false;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PatientClass [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ "]";
	}

	@Override
	public int compareTo(PatientClass o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
