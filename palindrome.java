// public class palindrome {
//     public static void main(String[] args) {

//         String str = "madam";
//         String rev = "";

//         for(int i = str.length() - 1; i >= 0; i--) {
//             rev = rev + str.charAt(i);
//         }

//         if(str.equals(rev)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }
public class palindrome
{
    public static void main(String args[])
    {
        String str = "madam";

        char ch[] = str.toCharArray();

        String rev = "";

        for(int i = ch.length - 1; i >= 0; i--)
        {
            rev = rev + ch[i];
        }

        if(str.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}