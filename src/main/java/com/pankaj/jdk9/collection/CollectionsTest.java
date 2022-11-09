package com.pankaj.jdk9.collection;

import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {
//1.
        List<String> list = List.of("A","B");
        System.out.println(list);
//2.
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Current Process Id: = " + currentProcess);




    }
}
