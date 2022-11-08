public class Arrays {

public static void main(String[] args) {

//create array variable

int[] inputArray = {123,55,55,123};

//create new object of ArrayChecker class using
//inputArray as param

ArrayChecker myArrayChecker = new ArrayChecker(inputArray);

//call ArrayChecker methods (make sure to compile both files)


if (myArrayChecker.isSymmetrical(inputArray)) {
System.out.println("Yes, it's symmetrical");
}
else {
System.out.println(myArrayChecker.reverse());
}


}

}