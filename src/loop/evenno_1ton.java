package loop;
import java.util.Scanner;
public class evenno_1ton {

	public static void main(String[] args) {
		{
		System.out.println("enter the highest number");
		}
		Scanner sc= new Scanner(System.in);
				int n =sc.nextInt();
				for(int i=1;i<=n;i++)
					if(i%2==0) {
						System.out.println("the number is =" +i);
					}
	}

}
