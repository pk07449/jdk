package com.pankaj.jdk.jdk17;

public class Test {

    static class SuperParent {

    }

    interface SuperInterface {

    }
//    1. Sealed Classes
     sealed static class Parent extends SuperParent implements SuperInterface permits Child1, Child2 {
        int m1() {
            System.out.println("from a sealed parent class ");
            return 0;
        }
    }

    final static class Child1 extends Parent {
        int m1() {
            System.out.println("from a child1  class ");
            return 10;
        }
    }

    final static class Child2 extends Parent {
        int m1() {
            System.out.println("from a child2  class ");
            return 20;
        }

    }

    public static void main(String[] args) {

    }
}
