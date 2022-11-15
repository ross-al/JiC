public class myHospital {

  public static void main(String[] args){
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

   //myList just creates the list by adding the first patient
   //this is the same class (a list is just an element of the same class)

   Patient myList = newPatient1; 

   myList.addPatient(newPatient1);
   myList.addPatient(newPatient2);
   myList.addPatient(newPatient3);
   myList.addPatient(newPatient4);
   myList.addPatient(newPatient5);
   myList.addPatient(newPatient6);

   Patient current = myList;
   while (current.getNextPatient != null) {
     System.out.println(current.getName + ", " + current.getAge + ", " + current.getIllness);
     current = current.getNextPatient();
   }
  
  
 }
}