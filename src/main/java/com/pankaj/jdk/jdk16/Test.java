package com.pankaj.jdk.jdk16;

public class Test {

    static class  A {
        void m1(){
            System.out.println("A.m1");
        }
    }
    static class B extends A {
        @Override
        void m1() {
            System.out.println("B.m1");
        }
    }

    public static void main(String[] args) {
//1. Pattern Matching for instanceof - (Final)

        A b = new B();
        if(b instanceof B bvar) {
            bvar.m1();
        }


//2. Records & Pattern Matching - (Final)


        record Arecord(int a,int b){
        }


        System.out.println(new Arecord(10,20).a);
        System.out.println(new Arecord(10,20));



    }


}
