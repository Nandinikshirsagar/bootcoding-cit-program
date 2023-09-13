import java.uti.scanner;
public class ForLoop
{
	public static void main(String args[])
	{
		scanner sc =new scanner(system.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for(int i =1; i<=n; i++)
		{
			System.out.println(i);
		}
	}
}