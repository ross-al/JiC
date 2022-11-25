public interface PatientQueue {

	/**
	* Adds another patient to the queue. 
	* 
	* @param patient will be added to the queue, may be null
	*/
	void enqueue(String name); //make sure naming convention is the same as class
	// also make sure return type is same, i.e. Patient here
	
	/** 
	* Removes and returns patient from the queue.
	* 
	* @return the patient just removed from the queue, may be null
	*/
	String dequeue(); //make sure naming convention is the same as class
	// also make sure return type is same, i.e. Patient here
	

	int getQueueSize();
	void displayQueue();

}

