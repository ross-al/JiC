public class myHospital {

    public static void main(String[] args) {
        myHospital myLauncher = new myHospital();
        myLauncher.launch();
    }

    private void launch() {

        Patient newPatient1 = new Patient("Ross", 34, "TB");
        Patient newPatient2 = new Patient("Seb", 43, "Chicken pox");
        Patient newPatient3 = new Patient("Jack", 22, "Covid-19");
        Patient newPatient4 = new Patient("Phil", 22, "Covid-19");
        Patient newPatient5 = new Patient("Alice", 22, "Covid-19");
        Patient newPatient6 = new Patient("Hugh", 22, "Covid-19");
        Patient newPatient7 = new Patient("Mary", 22, "Covid-19");

        Patient myList = newPatient1; //variable to create the list

        //add Patients to list

        myList.addPatient(newPatient2);
        myList.addPatient(newPatient3);
        myList.addPatient(newPatient4);
        myList.addPatient(newPatient5);
        myList.addPatient(newPatient6);
        myList.addPatient(newPatient7);

        Patient current = myList;
        while (current.getNextPatient() != null) {
            System.out.println(current.getName() + ", " + current.getAge() + ", " + current.getIllness());
            current = current.getNextPatient();
        }

        System.out.println(current.getName() + ", " + current.getAge() + ", " + current.getIllness());
        System.out.println();
        
        myList.deletePatient("Hugh");
        myList.deletePatient("Seb");

        current = myList; //need to reinitialise 
        while (current.getNextPatient() != null) {
            System.out.println(current.getName() + ", " + current.getAge() + ", " + current.getIllness());
            current = current.getNextPatient();
        }

        System.out.println(current.getName() + ", " + current.getAge() + ", " + current.getIllness());
        System.out.println();
    }
}