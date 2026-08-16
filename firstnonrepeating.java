// // import java.util.*;
// // public class firstnonrepeating
// // {
// // 	public static void nonrepeat(String str)
// // 	{
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
// // 			if(count==1)
// // 			{
// // 				System.out.println("first non repating:"+str.charAt(i));
// // 				return;
// // 			}
// // 		}
// // 		System.out.println("no non repating");
// // 	}
// // 	public static void main(String args[])
// // 	{
// // 		Scanner s=new Scanner(System.in);
// // 		System.out.println("enter string:");
// // 		String str=s.nextLine();

// // 		nonrepeat(str);
// // 	}
// // }

// public class firstnonrepeating
// {
// 	public static void main(String args[])
// 	{
// 		String str="swiss";
// 		for(int i=0;i<str.length();i++)
// 		{
// 			int count=0;
// 			for(int j=0;j<str.length();j++)
// 			{
// 				if(str.charAt(i)==str.charAt(j))
// 				{
// 					count++;
// 				}
// 			}
// 			if(count==1)
// 			{
// 				System.out.println(str.charAt(i));
// 				break;
// 			}
// 		}
// 	}
// }

public class firstnonrepeating{
  static char firstnonrepeating(String str){
  char ch[]= str.toCharArray();
  
  for( int i=0 ;i<ch.length;i++){
  	int count=0;
  	for(int j=0;j<ch.length;j++){
  		if ( ch[i]==ch[j]){
  			count++;
  		}
  	}
  	if(count==1){
  		return ch[i];
  	}
  }
return 0;
  }
	public static void main(String args[])
	{
		String str="swiss";
		System.out.println(firstnonrepeating( str));
	}
}