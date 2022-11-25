/**
 * This is a class that uses the interface PatientQueue
 * We need to create an instance of a queue
 * We will use this in our Clinic class later
 */

public class PointerBasedQueue implements PatientQueue {
    //first we create a variable of type SimplePatient
    //this will be our queue

    private SimplePatient frontOfQueue; //implemented as stack for now
    private SimplePatient rearOfQueue;
    private int queueSize;

    //constructor
    public PointerBasedQueue() {
        frontOfQueue = null; //of type SimplePatient
        rearOfQueue = null;
        queueSize = 0;
    }

    public int getQueueSize() {
        return queueSize;
    }

    public void displayQueue() {
        SimplePatient currentPatient = frontOfQueue;
        while (currentPatient != null) {
            String name = currentPatient.getName();
            System.out.println(name);
            currentPatient = currentPatient.getNextPatient();
        }
    }

    public void enqueue(String name) {
        if (frontOfQueue == null) {
            rearOfQueue = new SimplePatient(name);
            frontOfQueue = rearOfQueue;
        } else {
            SimplePatient newPatient = new SimplePatient(name);
            rearOfQueue.setNextPatient(newPatient);
            rearOfQueue = rearOfQueue.getNextPatient();
        }
        queueSize++;
        System.out.println("Patient " + name + " was added to the queue");
        System.out.println();
    }

    //Remove item from the front of the queue.
    public String dequeue() {
        if (frontOfQueue != null) {
            String name = frontOfQueue.getName();
            frontOfQueue = frontOfQueue.getNextPatient();
            queueSize--;
            return name;
        }
        return null;
    }

}


