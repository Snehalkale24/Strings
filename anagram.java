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
import java.util.*;

public class anagram {
    public static void main(String args[]) {

        String str1 = "snehal";
        String str2 = "kale";

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("anagram");
        }
        else {
            System.out.println("not anagram");
        }
    }
}