package com.module01.practice.operation;

import java.util.Scanner;

public class PracApplication5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc + "일 경우");
        int age = sc.nextInt();

        if(age <= 13) {
            System.out.println("어린이");
        } else if(age>13 && age<=19) {
            System.out.println("청소년");
        } else if(age>19) {
            System.out.println("성인");
        }
    }
}
