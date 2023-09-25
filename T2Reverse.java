package project2;

public class T2Reverse {
    //Reverse a String: Write a function to reverse a given string. For
    //example, given the input "Hello", the output should be "olleH".
    public void reversedString(String a) {

        for (int i = a.length()-1; i >= 0; i--) {

            System.out.print(a.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {

        T2Reverse word = new T2Reverse();
        word.reversedString("Hello");



        String str="Hello";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i)+" ");
        }
    }
    }

