public class countword
{
	public static int count(String str)
	{
		String words[]=str.split(" ");
		return words.length;
	}

	public static void main(String args[])
	{
		String str="hello i am java sdf sdgs";
		System.out.println("no of words:"+count(str));
	}
}