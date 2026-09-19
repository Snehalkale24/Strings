// import java.util.*;
// public class practice
// {
// 	public static void main(String args[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		System.out.println("enter string:");
// 		String str=s.nextLine();
// 		System.out.println(str.charAt(str.length()-1));

// 		for(int i=0;i<str.length()-1;i++)
// 		{
// 			System.out.print(str.charAt(i));
// 		}
// 	}
// }
import java.util.*;
public class lasttofirst{
	public static void last(String str)
	{
		char ch[]=str.toCharArray();
		char last=ch[ch.length-1];
		for(int i=ch.length-1;i>0;i++)
		{
			ch[i]=ch[i-1];
		}
		ch[0]=last;
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
	public static void main(String args[])
	{
		String str="swiss";
		last(str);
	}
}