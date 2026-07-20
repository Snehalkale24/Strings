import java.util.*;
public class practice
{
	public static void shift(String str)
	{
		System.out.println(str.charAt(str.length()-1));
		for(int i=1;str.length()-1;i++)
		{
			System.out.println(str.charAt(i));
		}
		System.out.println(str.length()-1);
		
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String str=s.nextLine();

		shift(str);
	}
}

