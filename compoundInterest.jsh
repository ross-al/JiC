

//methods go here

//get savings amount

double getSavingsAmount() {
System.out.println("How much starting money do you have?");
String a = System.console().readLine();
double result = Double.parseDouble(a); 
return result;
}

//get interest rate

double getInterestRate() {
System.out.println("What is the expected interest rate?");	
String a = System.console().readLine();
double result = Double.parseDouble(a); 
return result;
}


//ask for savings goal

String getSavingsGoal() {
System.out.println("Enter your savings goal:");
String result = System.console().readLine();
return result;
} 

//ask for years goal

String getYearsGoal() {
System.out.println("Enter your years goal:");
String result = System.console().readLine();
return result;
} 

//calculate savings

int goalSavings(){
double goal = Double.parseDouble(getSavingsGoal());
int years = 0;
while (savedAmount < goal){ 
 double compoundInterest = savedAmount * interestRate;
 savedAmount = savedAmount + compoundInterest;  
 years++;
 }
 return years;
}

//calculate years 


double goalYears(){
int years = Integer.parseInt(getYearsGoal());
int n = 0;
while (n < years){
 double compoundInterest = savedAmount * interestRate; 
 double savedAmount = savedAmount + compoundInterest; 
 n++;
 }
 return savedAmount;

}

//main code

//ask how much they have in savings and what the interest rate is


double savedAmount = getSavingsAmount();
double interestRate = getInterestRate();

//ask if they have a savings goal or know how long they want to save for

System.out.println("If you have a savings target in mind, press 1.");
System.out.println("If you know how long you want to save for, press 2."); 
    
String s = System.console().readLine();
    int choice = Integer.parseInt(s);

//create switch
    
switch(choice){
  case 1: 
    int years = goalSavings();
	System.out.println(years);
    break;
  case 2:
    double savings = goalYears();
	System.out.println(savings);
    break;
  default:
   System.out.println("Not an option. Please restart.");
    break;
    }



