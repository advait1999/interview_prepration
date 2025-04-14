package com.mock.mock;

import java.util.Arrays;
import java.util.List;

public class MockTest {


    public static void main(String[] args) {
        List<String> name= Arrays.asList("mith","Ayush","vivek","moin","firoz","washim","murli");



        name.stream().filter(e->e.toLowerCase().startsWith("m")).forEach(System.out::println); //find the name that start with "m"
      //  System.out.println("hello world");

    }
}
