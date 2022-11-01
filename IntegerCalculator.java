public class IntegerCalculator {

//add main method

public static void main(String[] args) {


System.out.println("ADD: " + Calculator.add(2,2));
System.out.println("SUBTRACT: " + Calculator.subtract(2,2));
System.out.println("MULTIPLY: " + Calculator.multiply(2,2));
System.out.println("DIVIDE: " + Calculator.divide(2,2));
System.out.println("MODULUS: " + Calculator.modulus(2,2));

//add class 

 }

class Calculator {

//needs to be static as method belongs to class, not object.
//i.e. there's no object to call from as we have not made an instance of this class anywhere
//all methods of a class must be private, unless their purpose is to be called outside the class
//i.e. like here where we call the methods outside of the class
//if a class has methods (like this one), its fields must be private (there are no fields here fyi)

public static int add(int x, int y){ 
int z = x + y;
return z;
}

public static int subtract(int x, int y){
int z = x - y;
return z;
}

public static int multiply(int x, int y){
int z = x * y;
return z;
}

public static double divide(int a, int b){
double x = (double) a;
double y = (double) b;
double z = x/y;
return z;
}

public static int modulus(int x, int y){
int z = x % y;
return z;
}


}//close class
}//close class