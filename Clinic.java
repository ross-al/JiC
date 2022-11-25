public class Clinic {

//you can't create an instance of an interface because it's not a class
//instead, we use a variable of type interface
//e.g. we can't say PatientQueue patientQueue = new PatientQueue, because it's not a class

    private PatientQueue patientQueue;

    //then create an instance of Clinic and say patientQueue is a new PointerBasedQueue
    //why this step?

    public Clinic() {
        this.patientQueue = new PointerBasedQueue();
    }

    public static void main(String[] args) {
        Clinic myLauncher = new Clinic();
        myLauncher.launch();
    }

    private void launch() {


        System.out.println();
        System.out.println("Hello and welcome to Ross's Clinic. Please select one of the following options:");
        System.out.println();
        System.out.println("Press 1 to join the queue.");
        System.out.println("Press 2 to move the queue along.");
        System.out.println("Press 3 to see the current size of the queue.");
        System.out.println("Press 4 to end");
        System.out.println();

        boolean running = true;
        while (running) {
            String choicesInput = System.console().readLine();
            int choices = Integer.parseInt(choicesInput);

            switch (choices) {
                case 1:
                    System.out.println();
                    System.out.println("Please enter your name:");
                    String name = System.console().readLine();
                    patientQueue.enqueue(name);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Patient " + patientQueue.dequeue() + " has left the queue");
                    System.out.println("Patients in the queue:" + patientQueue.getQueueSize());
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Patients in the queue:" + patientQueue.getQueueSize());
                    System.out.println("The following patients are in the queue: ");
                    patientQueue.displayQueue();
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Goodbye!");
                    running = false;
                    break;
            }
        }


    }

}


//use addPatient (which uses insert) and treatPatient (which uses retrieve)
//add these private methods in this class