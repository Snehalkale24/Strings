import java.util.*;
public class removespace
{
	public static String remove(String str)
	{
		String result=" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != ' ')
			{
				result = result + str.charAt(i);
			}
		}
		return result;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=nextLine();

		String ans=remove(str);
		System.out.println("String after removing space:"+ans);
	}
}