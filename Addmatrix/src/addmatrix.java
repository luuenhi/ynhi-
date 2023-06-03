import java.util.Scanner;
public class addmatrix {
	public static void main(String[]args) {
		   Scanner mt = new Scanner(System.in);
		   System.out.println("enter the number of rows :");
		   int row = mt.nextInt();
		   
		   System.out.println("enter the number of columns:");
		   int colum = mt.nextInt();
		   
		int[][] matrix1 = new int[row][colum];
		int[][] matrix2 = new int[row][colum];
		  
		System.out.println("enter the element of matrix 1:");
		    for(int i =0; i<row ; i++) {
		    	for(int j=0; j<colum; j++) {
		    		matrix1[i][j] = mt.nextInt();
		    	}
		    }
		    System.out.println("enter the element of matrix 2:");
		    for(int i =0; i<row ; i++) {
		    	for(int j=0; j<colum; j++) {
		    		matrix2[i][j] = mt.nextInt();
	   }
	}
		    int[][] add = new int [row][colum] ;
		    for(int i =0; i<row ; i++) {
		    	for(int j=0; j<colum; j++) {
		    		add[i][j] = matrix1[i][j] + matrix2[i][j];
		    		
		    }
	}
		     System.out.println("add off 2 matrix :");
		     for (int i = 0; i < row; i++) {
		            for (int j = 0; j < colum; j++) {
		                System.out.println(add[i][j] + " ");
}
		     }
	}
}
