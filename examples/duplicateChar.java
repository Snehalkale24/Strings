// public class duplicateChar
// {
// 	public static void main(String args[])
// 	{
// 		String str="programming";
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
// 			if(count>1)
// 			{
// 				System.out.println(str.charAt(i));
// 			}

// 		}
// 	}
// }

public class duplicateChar{
	public static void main(String args[])
	{
		String str="programming";
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				id(str.charAt(i)==str.length(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(str.charAt(i));
			}
		}
	}
}