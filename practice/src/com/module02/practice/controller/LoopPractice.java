package com.module02.practice.controller;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {

    }

    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        if(num<1) {
            System.out.println("잘못 입력하셨습니다.");
        }
        for(int i=1; i<=num; i++) {
            System.out.print(" " + i);
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        while(true) {
            if(num<1) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                System.out.print("1이상의 숫자를 입력하세요 : ");
            } else {
                break;
            }
            int num2 = sc.nextInt();
            num=num2;
        }
        for(int i=1; i<=num; i++) {
            System.out.print(" " + i);
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            for(int i=0; i<num; num--) {
                System.out.print(" " + num);
            }
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        while(true) {
            if(num<1) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                System.out.print("1이상의 숫자를 입력하세요 : ");
            } else {
                break;
            }
            int num2 = sc.nextInt();
            num=num2;
        }
        for(int i=num; i>0; i--) {
            System.out.print(" " + i);
        }
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

    }
}
