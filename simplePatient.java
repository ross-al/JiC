/**
 * A simple version of the class Patient
 */

public class SimplePatient {
    private String name;
    private SimplePatient nextPatient;


    public SimplePatient(String name) {
        this.name = name;
        this.nextPatient = null;
    }

    public void setNextPatient(SimplePatient nextPatient) {
        this.nextPatient = nextPatient;
    }

    public SimplePatient getNextPatient() {
        return nextPatient;
    }
    
    public String getName() {
        return name;
    }
}