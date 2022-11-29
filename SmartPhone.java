public class SmartPhone extends MobilePhone{
	
	//browseWeb(String);
	//findPosition(); this is return a fake GPS-found position as a String
	
	public void browseWeb(String url){
		System.out.println("Browsing "+url+"...");
	}
	
	public void findPosition(){
		System.out.println("You are at 5126.32476.5489.2546");
	}
	
	@Override 
	public void call(String number){
		if(number.startsWith("00")){ 
		//startsWith() is from java lang
		System.out.print("Calling "+ number +" through VoIP!");
		storeNumber(number); 
		//we need to make this storeNumber() method protected so any class in 
		//same package can access it
		} else {
			super.call(number);	
			}			
	}
}