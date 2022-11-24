/**
 * This is a class that uses the interface PatientQueue
 * We need to create an instance of a queue
 * We will use this in our Clinic class later
 */

public class PointerBasedQueue implements PatientQueue {
    //first we create a variable of type SimplePatient
    //this will be our queue

    private SimplePatient head; //implement as stack for now

    //this creates an empty queue
    public PointerBasedQueue() {
        head = null;
    }

    public void insert(String name) { //this is a stack not queue
        SimplePatient newPatient = new SimplePatient(name);
        newPatient.setNextPatient(head);
        head = newPatient;

        //need a pointer to next Patient in queue
        //need to remeber the last pointer so we don't lose the space in memory
        //then set newPatient to old pointer
        //rest of code here
        //can we just use Patient.java to do all this? No because PointerBasedQueue is a diff type
    }

    public String retrieve() { //this is a stack not queue
        if (head == null) {
            return null;
        }
        String result = head.getName();
        head = head.getNextPatient();
        return result;
    }

    public String getPatientName() {
        String result = head.getName();
        return result;
    }


}