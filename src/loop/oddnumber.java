package loop;

import java.util.Scanner;

public class oddnumber {

	public static void main(String[] args) {
		System.out.println("enter the highest no");
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=1;i<=n;i+=2)
		{
			System.out.println( i);
		}
		
	}

}
