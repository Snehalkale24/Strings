public class countvowels
{
	public static void main(String args[])
	{
		String str="snehal";
		int vowels=0;
		int consonent=0;

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);

			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
			else{
				consonent++;
			}
		}
		System.out.print("vowels:"+vowels);
	}
}