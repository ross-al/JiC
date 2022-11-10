public class ArrayChecker {

 public boolean isSymmetrical(int [] x){
   for (int i = 0; i < x.length / 2; i++) { 
   // we divide by two to only check position 0 with length-1
   // this removes the need to check length-1 against 0 (better code)
     if (x[0]  != x[x.length-1-i]) {
     return false;
     }
   }
   return true;
 }

 public int[] reverse(int [] x){
   //for arrays, we must first create them  using 'new'
   //and then specify length so we can assign memory
   int [] newArray = new int[x.length]; 
     for (int i = 0; i < x.length; i++) {
       //add whatever is at length-i to x at position i
       newArray[x.length-1-i] = x[i];
     }
     return newArray;
 }

}











