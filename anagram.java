// public class anagram{
// 	public static void main(String args[])
// 	{
// 		String str1="listen";
// 		String str2="silent";

// 		char arr1[]=str1.toCharArray();
// 		char arr2[]=str2.toCharArray();


// 		Arrays.sort(arr1);
// 		Arrays.sort(arr2);

// 		if(Arrays.equals(arr1,arr2))
// 		{
// 			System.out.println("anagram");
// 		}
// 		else{
// 			System.out.println("not anagram");
// 		}

// 	}
// }


public class anagram
{
    public static void main(String args[])
    {
        String s1="silent";
        String s2="listen";

        char ch[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);
        if(ch.equals(ch2))
        {
            System.out.println("anagram");
        }
        else{
            System.out.println("not")
        }
    }
}