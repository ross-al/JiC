public class Matrix {

public int[][] matrix;

  public Matrix(int a, int b){
    matrix = new int[a][b];
    for (int row = 0; row < matrix.length; row++){
      for (int col = 0; col < matrix[row].length; col++){
        matrix[row][col] = 1;
      }
    }  
  }

  public void setElement(int x, int y, int z){
    if (matrix.length > x && matrix[0].length > y) {
       matrix[x][y] = z;
    }
  }
 
  public void setRow(int q, String s){
   if (matrix.length >= q){
     if (s.length() == matrix[q].length){
       for (int i = 0; i < s.length(); i++){
         matrix[q][i] = Integer.parseInt(s.substring(i,i+1));
       }
     }
   }

  //takes int as row number
  //takes string as numbers "1,2,3" and then overrides
  //elements in the row 
  //must check index is valid
  //must check numbers are correct
  // e.g. if 3 cols, then need 3 numbers
  //if anything incorrect, then do nothing

  }


}