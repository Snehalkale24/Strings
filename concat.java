// public class concat
// {
// 	public static void main(String args[])
// 	{
// 		// String s1="snehal";
// 		// s1=s1.concat("kale");
// 		// // System.out.println(s1);
// 		// System.out.println(s1);




// 		String s1="KareenaKapoor";
// 		String s2="Kareena";
// 		String s3=s2+"Kapoor";

// 		System.out.println(s1==s3);
// 		System.out.println(s1.equals(s3));

		
// 	}
// }



public class concat{
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello I Love India");
			// start>=  <end
		sb.delete(8,12);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);

		sb.replace(0,4,"Hello");
		System.out.println(sb);
	}

}