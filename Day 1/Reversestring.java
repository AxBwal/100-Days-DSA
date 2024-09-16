//Reverse a string in place

public class Reversestring {

    public static String Reversestring(String str) {
        StringBuilder sb=new StringBuilder(str);
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            char s1 = sb.charAt(start);
            char s2 = sb.charAt(end);
           sb.setCharAt(start, s2);
           sb.setCharAt(end, s1);
            start++;
            end--;

        }
        return sb.toString();

    }

    public static void printingstring(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        String ans = "ansh";
       String reversed= Reversestring(ans);
        printingstring(reversed);
    }

}


//Used StringBuilder to handle the string, as it is mutable.

//Returned the reversed string from the Reversestring method and passed it to printingstring.

//Directly printed the reversed string in printingstring.