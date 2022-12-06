public class SmartPhone extends MobilePhone{
	private String brandName;

	public SmartPhone(String brandName){
		this.brandName = brandName;
	}
	
	public String getBrandName(){
		return brandName;
	}

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
		System.out.println("Calling "+ number +" through VoIP!");
		storeNumber(number); 
		//we need to make this storeNumber() method protected so any class in 
		//same package can access it
		} else {
			super.call(number);	
			}			
	}
}