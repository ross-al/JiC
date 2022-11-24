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

        System.out.println("Press 1 to join the queue. Press 2 to leave the Queue. Press 3 to end the call");
        System.out.println();

        boolean running = true;

        while (running) {
            
            String choicesInput = System.console().readLine();
            int choices = Integer.parseInt(choicesInput);

            switch (choices) {
                case 1:
                    System.out.println();
                    System.out.println("Please enter your name:");
                    System.out.println();
                    String name = System.console().readLine();
                    patientQueue.insert(name);
                    System.out.println();
                    System.out.println(patientQueue.getPatientName() + " has joined the queue");
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Please enter the name you want to delete:");
                    System.out.println();
                    String nameToDelete = System.console().readLine();
                    patientQueue.retrieve(); //double check what this method does for stacks
                    System.out.println();
                    System.out.println(patientQueue.retrieve() + " has left the queue");
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Goodbye!");
                    running = false;
                    break;
            }
        }


        //patientQueue.insert("Ross"); //this works
        // System.out.println(patientQueue.retrieve());

        //code here to add patients etc
        //use addPatient (which uses insert) and treatPatient (which uses retrieve)
        //add these private methods in this class
    }

//insert(Patient patient);
//Patient retrieve();

}