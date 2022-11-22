public interface PatientQueue {

	/**
	* Adds another patient to the queue. 
	* 
	* @param patient will be added to the queue, may be null
	*/
	void insert(String name); //make sure naming convention is the same as class
	
	/** 
	* Removes and returns patient from the queue.
	* 
	* @return the patient just removed from the queue, may be null
	*/
	String retrieve(); //make sure naming convention is the same as class
	
	
}

