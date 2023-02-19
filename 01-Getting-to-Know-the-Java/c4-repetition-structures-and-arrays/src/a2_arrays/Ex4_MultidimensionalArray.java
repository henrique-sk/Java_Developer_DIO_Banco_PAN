package a2_arrays;

import java.util.Random;

/*
Generate and print a 4x4 matrix M with random values between 0-9.
*/

public class Ex4_MultidimensionalArray {

  public static void main(String[] args) {
    Random random = new Random();
    
    int[][] M = new int[4][4];
    
    for (int i = 0; i < M.length; i++) {
      for (int j = 0; j < M[i].length; j++) {
        M[i][j] = random.nextInt(10);
      }
    }
    
    for (int[] row : M) {
      for(int column : row) {
        System.out.print(column + " ");
      }
      System.out.println();
    }
  }

}
