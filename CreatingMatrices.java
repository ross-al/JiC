public class CreatingMatrices {

  public static void main(String[] args){

    Matrix myMatrix = new Matrix(3,3);
    
    for (int row = 0; row < myMatrix.matrix.length; row++){
       for (int col = 0; col < myMatrix.matrix[row].length; col++){
         System.out.println(myMatrix.matrix[row][col]);
       }
    }


    myMatrix.setElement(0,0,9);
    System.out.println(myMatrix.matrix[0][0]);
   
   
    myMatrix.setRow(1,"345");
    System.out.println(myMatrix.matrix[1][0]);
    System.out.println(myMatrix.matrix[1][1]);
    System.out.println(myMatrix.matrix[1][2]);


   }

}