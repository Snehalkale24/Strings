// // import java.util.*;
// // public class findmaxoccur

// // {
// // 	public static void max(String str)
// // 	{
// // 		char maxChar=' ';
// // 		int max=0;
// // 		for(int i=0;i<str.length();i++)
// // 		{
// // 			int count=0;
// // 			for(int j=0;j<str.length();j++)
// // 			{
// // 				if(str.charAt(i)==str.charAt(j))
// // 				{
// // 					count++;
// // 				}
// // 			}
// // 			if(count>max)
// // 			{
// // 				max=count;
// // 				maxChar=str.charAt(i);
// // 			}
// // 		}
// // 		System.out.println("max:"+maxChar);
// // 		System.out.println("freq:"+max);
// // 	}
// // 	public static void main(String args[])
// // 	{
// // 		Scanner s=new Scanner(System.in);
// // 		System.out.println("enter a string");
// // 		String str=s.nextLine();

// // 		max(str);
// // 	}
// // }

// import java.util.*;
// public class findmaxoccur{
// 	public static void max(String str)
// 	{
// 		int max=0;
// 		char maxchar=' ';
// 		for(int i=0;i<str.length();i++)
// 		{
// 			int count=0;
// 			for(int j=0;j<str.length();j++){
// 				if(str.charAt(i)==str.charAt(j))
// 				{
// 					count++;
// 				}
// 			}
// 			if(count>max)
// 			{
// 				max=count;
// 				maxchar=str.charAt(i);
// 			}
// 		}
// 		System.out.println("max:"+maxchar);
// 		System.out.println("freq:"+max);
// 	}
// 	public static void main(String args[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		System.out.println("enter a string:");
// 		String str=s.nextLine();
// 		max(str);
// 	}
// }
import java.util.*;
public class findmaxoccur
{
	public static void max(String str)
	{
		int max=0;
		char maxchar=' ';
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				maxchar=str.charAt(i);
			}
		}
		System.out.println("max:"+maxchar);
		System.out.println("freq:"+max);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=s.nextLine();

		max(str);
	}
}