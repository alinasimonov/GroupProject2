package project2;

public class T3Palindrome {
    //3. Check if a String is Palindrome: Determine whether a given string is a palindrome, which means it reads the same forwards and
    //backward. For example, "madam" is a palindrome.
    public static void main(String[] args) {
        String p = "madam";
        String reversed ="";
        for (int i = p.length() - 1; i >= 0; i--) {
            reversed = reversed + p.charAt(i);
        }
        if (p.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

