package project2;

import java.util.ArrayList;

public class T1Swap {
    //Write a program to swap 2 String without a temporary variable?

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Alina");
        words.add("Simonov");
        words.add(0, words.get(1));
        words.remove(2);




        String a="Alina";
        String b="Simonov";

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("First String is "+a);
        System.out.println("Second  String is "+b);

    }
}

