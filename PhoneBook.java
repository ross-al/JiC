public class PhoneBook {
    private String number;
    private PhoneBook nextNumber;


    public PhoneBook(String number) {
        this.number = number;
        this.nextNumber = null;
    }

    public void setNumber(PhoneBook nextNumber) {
        this.nextNumber = nextNumber;
    }

    public PhoneBook getNextNumber() {
        return nextNumber;
    }
    
    public String getNumber() {
        return number;
    }
}