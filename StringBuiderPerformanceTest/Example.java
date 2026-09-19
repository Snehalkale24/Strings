public class Example
{
	public static void main(String args[])
	{
		StringBuffer sb1=new StringBuffer("kareena");
		StringBuffer sb2=new StringBuffer("kapoor");

		for(int i=0;i<10;i++)
			sb1.append(sb2);

		StringBuilder sb3=new StringBuilder("snehal");
		StringBuilder sb4=new StringBuilder("kale");

		// for(int i=0;i<10;i++)
		// 	sb3.append(sb4);

		System.out.println(sb1);
		// System.out.println(sb2);
	}
}