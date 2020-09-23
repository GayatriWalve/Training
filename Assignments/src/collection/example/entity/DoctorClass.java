package collection.example.entity;

public class DoctorClass implements Comparable<DoctorClass> {

	
	private int doctorId;
	private String doctorName;
	private String doctorSpecialization;
	private double doctorFees;
	
	public DoctorClass(int doctorId, String doctorName, String doctorSpecialization, double doctorFees) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorSpecialization = doctorSpecialization;
		this.doctorFees = doctorFees;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}

	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}

	public double getDoctorFees() {
		return doctorFees;
	}

	public void setDoctorFees(double doctorFees) {
		this.doctorFees = doctorFees;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(doctorFees);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + doctorId;
		result = prime * result + ((doctorName == null) ? 0 : doctorName.hashCode());
		result = prime * result + ((doctorSpecialization == null) ? 0 : doctorSpecialization.hashCode());
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
		DoctorClass other = (DoctorClass) obj;
		if (Double.doubleToLongBits(doctorFees) != Double.doubleToLongBits(other.doctorFees))
			return false;
		if (doctorId != other.doctorId)
			return false;
		if (doctorName == null) {
			if (other.doctorName != null)
				return false;
		} else if (!doctorName.equals(other.doctorName))
			return false;
		if (doctorSpecialization == null) {
			if (other.doctorSpecialization != null)
				return false;
		} else if (!doctorSpecialization.equals(other.doctorSpecialization))
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "DoctorClass [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorSpecialization="
				+ doctorSpecialization + ", doctorFees=" + doctorFees + "]";
	}

	@Override
	public int compareTo(DoctorClass obj) {
		
		return 0;
	}
	
	
	
}
