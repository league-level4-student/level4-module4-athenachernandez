package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if (patients.size() < 3) {
			patients.add(patient);
		} else {
			throw new DoctorFullException();
		}
		
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (Patient p : patients) {
			p.checkPulse();
		}
		
	}

	public List<Patient> getPatients() {
		return patients;
	}


}
