//can use launcher here instead
//if so add code below outside of main method
//create array variable
//create new object of ArrayChecker class using
//inputArray as param
//call ArrayChecker methods (make sure to compile both files)




public class Arrays {

public static void main(String[] args) {

 int[] inputArray = {123,55,55,123};
 ArrayChecker myArrayChecker = new ArrayChecker();
 if (myArrayChecker.isSymmetrical(inputArray)) {
   System.out.println("Yes, it's symmetrical");
 }
 //else {
   //System.out.println(myArrayChecker.reverse());
 //}


}

}