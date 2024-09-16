//Check if a string is a palindrome.

public class Stringpalindrome {

    public static Boolean palindrome(String str){
        int start=0;
        int end=str.length()-1;

        while(start <= end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String ans="mom";
        palindrome(ans);

        if(palindrome(ans)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is Not not palindrome");
        }
    }
}