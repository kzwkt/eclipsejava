package k;

public class apple {

	public static void main(String [] args) {
		int array[][]= {{4,5,6,7},{1,2,3},{7,8,9}	,{2}};
		int array2[][]= {{10,11},{12},{13,14,15}};
		System.out.println("this is first array "+array[0].length);
		display(array);
		System.out.println("this is second  array");
		display(array2);
		
		
	}
	public static void display(int x[][]) {
		for (int row=0;row<x.length;row++) {
		for (int col=0; col<x[row].length;col++) {
			System.out.print(x[row][col]+ "\t");
		
			
		}
		System.out.println();
		}
	}
}