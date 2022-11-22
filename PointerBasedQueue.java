/**
* This is a class that uses the interface PatientQueue
* We need to create an instance of a queue
* We will use this in our Clinic class later
*/

public class PointerBasedQueue implements PatientQueue {
	//first we create a variable of type Patient
	//this will be our queue 
	
	private Patient queueTail;

	public PointerBasedQueue(){
		this.queueTail = null;
	}
	
	public void insert(String name){
		Patient newPatient = new Patient(name);
		//need a pointer to next Patient in queue
		//need to remeber the last pointer so we don't lose the space in memory
		//then set newPatient to old pointer
		//rest of code here
	}
	
	public String retrieve(){
		//code here
		return "hello"; //just to test
	}
	
	
}