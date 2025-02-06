package com.pankaj.jdk.jdk14;

import java.time.Month;

public class Test {
    public static void main(String[] args) {
// 1. Switch Expression,
//    Switch expressions can now return a value.And you can use a lambda-style syntax for your expressions
        System.out.println(findDaysOfMonth(Month.JANUARY));

    }

    static int  findDaysOfMonth(Month month) {
     return switch (month) {
         case JANUARY,MARCH,MAY -> 31;
         default -> 0;
     };
    }

}
