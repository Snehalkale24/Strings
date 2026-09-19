public class shiftfirstandlast{
	public static String swap(String str)
	{
		char ch[]=str.toCharArray();

		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;

		return new String(ch);
	}

	public static void main(String args[])
	{
		String str="india";
		System.out.println("result:"+swap(str));
	}
}