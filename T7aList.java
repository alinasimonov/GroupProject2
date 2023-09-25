package project2;

import java.util.ArrayList;

public class T7aList {
    //You have a list of strings and you want to keep only those that start with “A” and you want to return them in lower case"
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Sarah");
        names.add("Ahmed");
        names.add("Ali");
        names.add("Alina");
        names.add("Leia");

        for(int i=0;i<names.size();i++){
            if(names.get(i).contains("A")){
                System.out.println(names.get(i).toLowerCase());
            }
        }

    }
}


