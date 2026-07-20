public class countvowels
{
	public static int count(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		String str="sfaifdgf";
		System.out.println("no of vowels:"+count(str));
	}
}