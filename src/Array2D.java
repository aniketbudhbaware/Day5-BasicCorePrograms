import java.util.Scanner;

public class Array2D {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number of rows and columns");
	int Row = scan.nextInt();
	int Column=scan.nextInt();
	int [][] arr=new int[Row][Column];
	System.out.println("Enter the element of array");
	for(int i=0; i<Row; i++) {
		for(int j=0; j<Column; j++ ) {
		arr[i][j] = scan.nextInt();
		System.out.println(arr[i][j]+ " ");
		
	}
	System.out.println(" ");
}
}
}
