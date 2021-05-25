package com.AI;

import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) {

        String string1 =new String("Noha");
        String string2 = new String("Noha Saeed");

        String longer_test = StringUtils.betterString(string1,string2,(s1,s2)->s1.length()>s2.length());
        String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);
        
        System.out.printf(longer_test+"\n");
        System.out.printf(first);

    }
}
