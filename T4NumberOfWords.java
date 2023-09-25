package project2;

public class T4NumberOfWords {
    //Count the Number of Words in a String: Write a function to count the number of words in a given string. Words are separated by spaces or punctuation.
    //For example, the input "Hello, world!" should return 2.

    String number(String words){
        String []arr=words.split(" ");
        System.out.println(arr.length);

        return words;
    }
    public static void main(String[] args) {


            T4NumberOfWords obj=new T4NumberOfWords();
            obj.number("Hello, world!");



            String str="Hello, word!";
            String [] ab=str.split("[,]");
            System.out.println(ab.length);
    }
}

