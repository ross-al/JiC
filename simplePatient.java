/** 
* A simple version of the class Patient
*/

public class simplePatient { 
  private String name;
  private simplePatient nextPatient; 
  
	
  public simplePatient(String name) {
   this.name = name;
   this.nextPatient = null;
  }
  
  public simplePatient getNextPatient(){
	return nextPatient;
  }

  public void setNextPatient(simplePatient nextPatient){
    this.nextPatient = nextPatient;
  
  public String getName(){
	return name;
  }
}