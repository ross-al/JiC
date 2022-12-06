public class PhoneLauncher {


    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }

    public void launch() {
        SmartPhone myPhone = new SmartPhone("ACME"); //need to make sure we create the right type based on the methods we call
        myPhone.call("07964663940");
        myPhone.call("07964663941");
        myPhone.call("07964663942");
        myPhone.call("07964663943");
        myPhone.call("07964663944");
        myPhone.call("07964663945");
        myPhone.call("07964663946");
        myPhone.call("07964663947");
        myPhone.call("07964663948");
        myPhone.call("07964663949");
        myPhone.call("07964663940");
        myPhone.call("00964663940");
        myPhone.call("07964663939");
        myPhone.ringAlarm("6am");
        myPhone.playGame("Flappy Bird");
        myPhone.browseWeb("www.amazon.co.uk");
        myPhone.findPosition();
        myPhone.printLastNumbers();
        System.out.println("Number of saved numbers: " +myPhone.getCallHistorySize());
		System.out.println(myPhone.getBrandName());

    }
}
