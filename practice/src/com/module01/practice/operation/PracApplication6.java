package com.module01.practice.operation;

import java.util.Scanner;

public class PracApplication6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();
        double sum = kor+eng+math;
        System.out.println("합계:" + (int)sum);
        double avg = sum/3;
        System.out.println("평균: " + avg);
        if(kor>=40 && eng>=40 && math>=40 && avg>=60) {
            System.out.println("합격");
        }else {
            System.out.println("불합격");
        }
    }
}
