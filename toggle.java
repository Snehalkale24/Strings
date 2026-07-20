import java.util.*;
public class toggle
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String str=s.nextLine();

		String result="";

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);

			if(Character.isUpperCase(ch))
			{
				result=result+Character.toLowerCase(ch);
			}

			else if(Character.isLowerCase(ch))
			{
				result=result+Character.toUpperCase(ch);
			}

			else{
				result=result+ch;
			}
		}
		System.out.println("toggle:"+result);
	}
}