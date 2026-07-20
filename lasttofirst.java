import java.util.*;
public class practice
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String str=s.nextLine();
		System.out.println(str.charAt(str.length()-1));

		for(int i=0;i<str.length()-1;i++)
		{
			System.out.print(str.charAt(i));
		}
	}
}