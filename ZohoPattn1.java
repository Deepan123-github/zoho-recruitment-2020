import java.util.Scanner;
public class ZohoPattn1 {
	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=n;i>0;i--)
		{
		for(int j=n;j>i;j--)
		{
		System.out.print(j);
		}
		for(int j=i;j>0;j--)
		{
		System.out.print(i);
		}
		System.out.println();
		}
	}

}
