package com.mock.mock;

public class Palindrome {
    public static void main(String args[]) {
        String s = "noaonr";
        String reverse = "";

        for(int j=s.length()-1; j>=0; j--){

            reverse += s.charAt(j);

        }

        if(reverse.equals(s)){
            System.out.print(reverse + ": is palindrome");
        } else {
            System.out.print(s + ": is not palindrome");
        }
    }
}
