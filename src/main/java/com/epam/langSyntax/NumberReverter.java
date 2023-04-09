package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        StringBuilder reverter = new StringBuilder(String.valueOf(number));
        System.out.println(reverter.reverse());
    }

}
