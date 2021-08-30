package array;

public class array2d2ndDemo {

	public static void main(String[] args) {
		int[][] hostel=new int[2][3];
		hostel[0][0]=101;
		hostel[0][1]=102;
		hostel[0][2]=103;
		hostel[1][0]=201;
		hostel[1][1]=202; 
		hostel[1][2]=203;
		System.out.println("print 2d array using for loop");
		for(int i=0;i<hostel.length;i++) {
		for(int j=0;j<hostel[i].length;j++) {
			System.out.print(hostel[i][j]);
		System.out.print(" ");
		}
		System.out.println("");
		}		
			
       

	}

}
