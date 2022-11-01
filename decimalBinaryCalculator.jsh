

//print options

System.out.println("Enter 1 to convert a binary number to decimal:");
System.out.println("Enter 2 to convert a decimal number to binary:");

//create switch

String s = System.console().readLine();
int choice = Integer.parseInt(s);  

switch (choice){
  case 1:
    //binary to decimal

    // call conversion method
    binary2decimal(binaryNumber);
    break;   
  case 2: 
    //decimal to binary 
    //get user input for base 10 number
    System.out.println("Enter a decimal number");
    String decimalNumber = System.console().readLine();  
    //call conversion method
    String decFinalResult = decimal2binary(decimalNumber);
    System.out.println(decimalNumber + " in binary is " + decFinalResult);
    break;
    
  default: 
    System.out.println("Not a valid option. Please restart");
    
  }


//add first method here to caculate power
int calculatesPower(int base, int exponent) {
	int result = 1;
	for (int n = 0; n < exponent; n++) {
	 result = result * base;
	}	
	return result;
}

//then create power2 method and call first method to use first method to calculate power for base 2

int calculatesPower2(int exponent) {
	int result = calculatesPower(2, exponent);
	return result;
}
  
//add another method to convert binary to decimal
//exponent is equal to position

    //get user input for binary number
    System.out.println("Enter a binary number");
    String binaryNumber = System.console().readLine();


int binary2decimal(String binaryNumber){
  
int result = 0; 
  int length = binaryNumber.length(); 
  int characterPosition = 0; 
  for (int n = length; n > 0; n--) { 
    int exponent = n-1; //gets exponent based on position
    char binaryDigit = binaryNumber.charAt(characterPosition);
    int y = Integer.parseInt("" + binaryDigit);
    int power = calculatesPower2(exponent);
    int answer = y*power;
    characterPosition++;
    result = answer + result;
    }
  return result;
  System.out.println(binaryNumber + " in base 10 is " + result);

  }

//method for converting base 10 to binary

String decimal2binary(String decimalNumber){
    String result = "";
    int n = Integer.parseInt(decimalNumber);
    while (n > 0) {
     int remainder = n%2;
      String s = String.valueOf(remainder); 
      result = s + result;
      n = (n-remainder)/2;  

    } 
    return result;
  }
