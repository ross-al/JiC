public class Arrays {

public static void main(String[] args) {
  int[] inputArray = {1,1,1,1,1,1,1,2};
  ArrayChecker myArrayChecker = new ArrayChecker();
    System.out.println(myArrayChecker.isSymmetrical(inputArray));
    if (! myArrayChecker.isSymmetrical(inputArray)){
      int[] result = myArrayChecker.reverse(inputArray);
      for (int i = 0; i < result.length; i++) {
        System.out.println(result[i] +" ");
      }
    }
  }
}

//note we cannot simply print System.out.println(myArrayChecker.reverse(inputArray))
//because this will just give us the int[]'s location in memory
//and not the numbers in the array
//instead we print one by one