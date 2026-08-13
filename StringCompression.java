import java.util.*;
public class StringCompression
{
	public static void compress(String str)
	{
		String result=" ";
		for(int i=0;i<str.length();i++){
			int count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.length(j))
				{
					count++;
				}
				else{
					break;
				}
			}
			result=result+str.charAt(i)+count;
			i=i+count-1;
		}
		System.out.println("compressed:"+result);
	}
	public static void main(String args[])
	{
		System.out.println("enter string:");
		String str=s.nextLine();
		compress(str);
	}
}