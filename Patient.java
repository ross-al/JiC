public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;


    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
    }

    public void addPatient(Patient myPatient) {
        if (nextPatient == null) {
            nextPatient = myPatient;
        } else {
            nextPatient.addPatient(myPatient); 
        }
    }

    public Patient getNextPatient() {
        return nextPatient;
    }

    public void deletePatient(String name) {
        if (nextPatient == null) {
            return;
        }
        if (nextPatient.name.equals(name)) {
            nextPatient = nextPatient.nextPatient;
        } else {
            nextPatient.deletePatient(name);

        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIllness() {
        return illness;
    }

}
 
  