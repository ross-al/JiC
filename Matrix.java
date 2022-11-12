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
  }


  public void setColumn(int k, String s){ //2 //123
    if (matrix[0].length >= k){
      if (s.length() == matrix.length){
        for (int i = 0; i < s.length(); i++){
          matrix[i][k] = Integer.parseInt(s.substring(i,i+1));
        }
      }  
    }
  }


}