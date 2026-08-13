import java.util.*;
public class reverse{
	public static void reverse(String str)
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.length();
		}
		System.out.println("reverse:"+rev);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=s.nextLine();
		reverse(str);
	}
}