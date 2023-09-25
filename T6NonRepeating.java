package project2;

public class T6NonRepeating {
    //Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating character. For example, in the
    //string "abracadabra", the first non-repeating character is 'c'.

    public static void main(String[] args) {
        String str="abracadabra";
        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(str.charAt(i));
            }
        }

    }
}

