import java.util.*;
public class longestsubstring{
	public static void find(String str)
	{
		int max=0;
		for(int i=0;i<str.length();i++)
		{
			String temp=" ";
			for(int j=i;j<str.length();j++)
			{
				char ch=str.charAt(i);
				if(temp.indexOf(ch)!=-1)
				{
					break;
				}
				temp=temp+ch;
				if(temp.length()>max)
				{
					max=temp.length();
				}
			}
		}
		System.out.println("longest len:"+max);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		find(str);
	}
}