package com.example.helloworld;

public class PalindromeNumber {
    public static void main(String[] args) {
       int no = 1441;
       int num = no;
       int rev = 0;

       do{
           int digit = num% 10;
           rev = (rev * 10) + digit;
           num = num/10;

       }
       while (num > 0);

       if(rev == no){
           System.out.println("Palindrome");
       }else{
           System.out.println("Not a Palindrome");
       }

    }
}
