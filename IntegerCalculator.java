public class IntegerCalculator {

//add main method

public static void main(String[] args) {


String a = add(2,2);
String b = substract(2,2);
String c = multiply(2,2);
String d = divide(2,2);
String e = modulus(2,2);

//add class 

 }

class Calculator {


int add(int x, int y){
int z = x + y;
return z;
System.out.println(z);
}

int subtract(int x, int y){
int z = x - y;
return z;
System.out.println(z);
}

int multiply(int x, int y){
int z = x * y;
return z;
System.out.println(z);
}

double divide(int a, int b){
double x = (double) a;
double y = (double) b;
double z = x/y;
return z;
System.out.println(z);
}

int modulus(int x, int y){
int z = x % y;
return z;
System.out.println(z);
}


}//close class
}//close class