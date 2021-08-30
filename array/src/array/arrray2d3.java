package array;

public class arrray2d3 {

	public static void main(String[] args) {
	int[][]mark=new int[3][4];
	mark[0][0]=22;
	mark[0][1]=23;
	mark[0][2]=24;
	mark[0][3]=25;
	mark[1][0]=26;
	mark[1][1]=27;
	mark[1][2]=28;
	mark[1][3]=29;
	mark[2][0]=33;
	mark[2][1]=44;
	mark[2][2]=55;
	mark[2][3]=77;
	 System.out.println("print 2d array in for loop");
	 for(int i=0;i<mark.length;i++)
	  {
     for(int j=0;j<mark[i].length;j++)	
	{
		System.out.print(mark[i][j]);
	System.out.print(" ");
	
	}
	System.out.println("");
	}
	}

}
