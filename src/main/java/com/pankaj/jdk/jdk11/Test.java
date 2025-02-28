package com.pankaj.jdk.jdk11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    // 1.Collection to an Array
    List<String> list = Arrays.asList("A","B");

    // 2. The Not Predicate Method
    List<Integer> intList = Stream.of(1,2).filter(Predicate.not(((Predicate<Integer>) e -> e > 6).negate())).toList();

    //3. Local-Variable Syntax for Lambda
    List<Integer> localInt = Stream.of(1,2).filter((var e) -> e > 5).toList();

    //4. HTTP Client :
    /*The new HTTP client from the java.net.http package was introduced in Java 9. It has now become a standard feature in Java 11.*/

    //5. Nest Based Access Control
//    assertThat(MainClass.NestedClass.class.getNestHost()).isEqualTo(MainClass.class);
//    assertThat(MainClass.NestedClass.class.getNestHost()).isEqualTo(MainClass.class);

    public static void main(String[] args) {
//1.
        Comparator<String> comp3 = (var first, var second) -> second.length() - first.length();
//2. Run Source Files like java Test.java

//3.
    }

}
