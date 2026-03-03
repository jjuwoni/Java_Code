package com.module01.practice.variable;

import java.util.Scanner;

public class PracApplication3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name : " );
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter your age : " );
        String age = sc.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("enter your gender(m or f) : " );
        String gender = sc.nextLine();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("enter your height : " );
        String height = sc.nextLine();

        System.out.println(age + "살" + name+ "님 키가" + height + "cm 이시군요!");


    }

}
