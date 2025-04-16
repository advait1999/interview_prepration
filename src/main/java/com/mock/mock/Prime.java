package com.mock.mock;





public class Prime {
    public static void main(String[] args) {

        int num = 43;

        boolean isprime = true;
        for (int i =2; i<Math.sqrt(num); i++) {

            if (num%i==0) {
                isprime = false;
                break;
            }

        }
        if(isprime) {
            System.out.println(num+" is prime ");
        }else {
            System.out.println(num +"not prime");
        }
    }

}

