public class MobilePhone extends OldPhone{
	
	private String[] numberMemory; //create array for storage 	
	private String alarm;
	private String game;
	private int memoryIndex;
	private static final int MEMORY_SIZE = 10; //best to use constants where possible 
	
	//constructor for Class
	public void MobilePhone(){
		numberMemory = new String[MEMORY_SIZE];
		memoryIndex = 0;
	}
	
	public void ringAlarm(String alarm){
		System.out.println("Your alarm '"+alarm+"' is going off...");
	}
		
	public void playGame(String game){
		System.out.println("Your game '"+game+"' is loading...");
	}		

	@Override
	public void call(String number){
		storeNumber(number); //need to store number in array;
		super.call(number); //need to call number and print using super.class
	}
	
	protected void storeNumber(String number){ //we use protected so SmartPhone can access method
	
		numberMemory[memoryIndex] = number;
		memoryIndex++;
		if (memoryIndex > MEMORY_SIZE -1){
			memoryIndex = 0; //we can make this better so it is chronological
		}	
	}
	
	public void printLastNumbers(){
		for (int i = 0; i < MEMORY_SIZE; i++){
			System.out.println(numberMemory[i]);
		}
	}
}