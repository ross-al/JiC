public class ErrorHandling{
	public static void main(String[] args){
		ErrorHandling er = new ErrorHandling();
		er.launch();
	}
	
	private void launch(){
		int[] inputNumbers = new int[10];
		for (int i = 0; i < inputNumbers.length; i++){
			System.out.println("Please enter a number");
			String input = System.console().readLine();
			try{
				int result = Integer.parseInt(input);
				inputNumbers[i] = result;
			} catch (NumberFormatException e) {
				i--;
				System.out.println("You didn't enter a number");
			}
		}
		
		int sum = 0;
		for (int i = 0; i < inputNumbers.length; i++){
			sum +=inputNumbers[i];
		}
		double average = sum/inputNumbers.length;
		System.out.println("Mean avg: " + average);
		
		System.out.println("You entered the following numbers: ");
		for (int i = 0; i < inputNumbers.length; i++){
			System.out.println(" " + inputNumbers[i]);
		}
	}

}
