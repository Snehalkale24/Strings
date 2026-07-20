import java.util.*;
public class removeduplicate
{
	public static void remove(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					break;
				}
			}
			if(j==i)
			{
				System.out.print(str.charAt(i));
			}
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String str=s.nextLine();
		remove(str);
	}
}