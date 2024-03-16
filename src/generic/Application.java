package generic;

import modifier1.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Application {
    public static void main(String[] args) {

        //원시유형
        ArrayList myList = new ArrayList();
        ArrayList<String> myList2 = new ArrayList<String>();

        myList.add("hello");
        myList.add(100);
        myList.add(false);

        String myval = (String) myList.get(0);


    }
}