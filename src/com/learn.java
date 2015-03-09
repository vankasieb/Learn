package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ivan.balaban on 09.03.2015.
 */
public class learn {
    public static void main(String[] args) {
        List<String> myAList = new ArrayList<String>(Arrays.asList("four", "five"));
        System.out.println(myAList);
        myAList.add("one");
        myAList.add("two");
        myAList.add("three");

        for (String s:myAList) {
            System.out.println(s);
        }
        int two = myAList.indexOf("two");
        System.out.println("two is " + (two+1) + " of " + myAList.size());

        

    }
}
