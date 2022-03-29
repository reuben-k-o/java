//package com.example.helloworld;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int no;
                System.out.println("Enter a number ");
                no = sc.nextInt();
                int flag = 0;

                for(int i=2; i<=no/2; i++){
                    if(no%i == 0){
                        flag = 1;
                        break;
                    }
                    if(flag == 0){
                        System.out.println("Prime Number");
                    }else{
                        System.out.println("Not a prime Number");
                    }
                }
    }
}

