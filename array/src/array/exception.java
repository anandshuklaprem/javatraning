package array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
	public static void main(String[] args) {
		try
		{
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		System.out.println("square"+d*d); 
		}
		catch(NullPointerException e) 
		//catch(InputMismatchException e)
		{
		System.out.println("wrong input");
		} 
	

	}
}
