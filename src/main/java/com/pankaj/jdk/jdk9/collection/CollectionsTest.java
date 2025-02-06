package com.pankaj.jdk.jdk9.collection;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class CollectionsTest {

    public static void main(String[] args) {
//1.
        List<String> list = List.of("A","B");
        System.out.println(list);
//2.
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Current Process Id: = " + currentProcess);
        IntStream.of(1, 3, 2, 5, 4, 6, 7 , 8 , 10)
                .peek(foo -> System.out.println("Peek: " + foo))
                .takeWhile(n -> n < 5)
                .forEach(bar -> System.out.println("forEach: " + bar));


//3.
        Optional<Object> optional = Optional.empty();
        optional.ifPresentOrElse((e) -> System.out.println("not empty"),()-> System.out.println("empty"));


//4.
    interface I1 {
        int a =10;
        void m1();
        default void m2(){

        }
        private void m3(){

        }

        static void m4(){

        }

        private static void m5(){

        }
    }

    }
}
