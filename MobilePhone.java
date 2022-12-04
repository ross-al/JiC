public class MobilePhone extends OldPhone {

    private PhoneBook frontOfQueue;
    private PhoneBook rearOfQueue;
    private int callHistorySize;
    private String alarm;
    private String game;

    private static final int MAX_PHONEBOOK_SIZE = 10; //best to use constants where possible

    //constructor for Class
    public void MobilePhone() {
        frontOfQueue = null;
        rearOfQueue = null;
        callHistorySize = 0;
    }

    public void ringAlarm(String alarm) {
        System.out.println("Your alarm '" + alarm + "' is going off...");
    }

    public void playGame(String game) {
        System.out.println("Your game '" + game + "' is loading...");
    }

    @Override
    public void call(String number) {
        storeNumber(number);
        super.call(number);
    }

    protected void storeNumber(String number) {
        if (callHistorySize < MAX_PHONEBOOK_SIZE) {
            if (frontOfQueue == null) {
                rearOfQueue = new PhoneBook(number);
                frontOfQueue = rearOfQueue;
            } else {
                PhoneBook newPhoneBook = new PhoneBook(number);
                rearOfQueue.setNumber(newPhoneBook);
                rearOfQueue = rearOfQueue.getNextNumber();
            }
            callHistorySize++;
        } else {
            dequeue();
            storeNumber(number);
        }
    }

    public String dequeue() {
        if (frontOfQueue != null) {
            String number = frontOfQueue.getNumber();
            frontOfQueue = frontOfQueue.getNextNumber();
            callHistorySize--;
            return number;
        }
        return null;
    }

    public void printLastNumbers() {
        PhoneBook currentNumber = frontOfQueue;
        System.out.println("The last 10 numbers you dialled: ");
        while (currentNumber != null) {
            String number = currentNumber.getNumber();
            System.out.println(number);
            currentNumber = currentNumber.getNextNumber();
        }
    }

    public int getCallHistorySize() {
        return callHistorySize;
    }
}


