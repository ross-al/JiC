public class CreatingMatrices {

  public static void main(String[] args){

    Matrix myMatrix = new Matrix(8,8);
    
    for (int row = 0; row < myMatrix.matrix.length; row++){
       for (int col = 0; col < myMatrix.matrix[row].length; col++){
         System.out.println(myMatrix.matrix[row][col]);
       }
    }
    
    System.out.println(" ");


    myMatrix.setElement(0,0,9);
    System.out.println(myMatrix.matrix[0][0]);


    System.out.println(" ");

   
    myMatrix.setRow(7,"34567890");


    for (int row = 0; row < myMatrix.matrix.length; row++){
      for (int col = 0; col < myMatrix.matrix[row].length; col++){
        System.out.println(myMatrix.matrix[row][col]);
      }
    }
  

    System.out.println(" ");

 
    myMatrix.setColumn(6,"12345678");


    for (int row = 0; row < myMatrix.matrix.length; row++){
      for (int col = 0; col < myMatrix.matrix[row].length; col++){
        System.out.println(myMatrix.matrix[row][col]);
      }
    }

    


   }

}