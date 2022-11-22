public class Clinic {

//you can't create an instance of an interface because it's not a class
//instead, we use a variable of type interface
//e.g. we can't say PatientQueue patientQueue = new PatientQueue, because it's not a class

	private PatientQueue patientQueue;
	
	//then create an instance of Clinic and say patientQueue is a new PointerBasedQueue 
	//why this step? 
	
	public Clinic(){
		this.patientQueue = new PointerBasedQueue();
	}	
	
	
	public static void main(String[] args){
		Clinic myLauncher = new Clinic();
		myLauncher.launch();
  } 

  private void launch() {
     //code here to add patients etc
	 //use addPatient (which uses insert) and treatPatient (which uses retrieve)
	 //add these private methods in this class 
  }
	
//insert(Patient patient);

//Patient retrieve();

}