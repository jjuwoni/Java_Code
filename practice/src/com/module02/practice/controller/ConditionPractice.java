package com.module02.practice.controller;

import java.util.Scanner;

public class ConditionPractice {
    public static void main(String[] args) {
        ConditionPractice app = new ConditionPractice();
        app.practice1();
    }

    public void practice1() {
       /* System.out.println("1. 수정");
        System.out.println("2. 조회");
        System.out.println("3. 삭제");
        System.out.println("4. 종료");

        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 번호를 입력하세요 : ");
        int num = sc.nextInt();

        if(num == 1) {
            System.out.println("수정 메뉴입니다.");
        } else if(num == 2) {
            System.out.println("조회 메뉴입니다.");
        } else if(num == 3) {
            System.out.println("삭제 메뉴입니다.");
        } else if(num == 4) {
            System.out.println("프로그램이 종료됩니다.");
        } else {} */


        String[] menu={"입력","수정","조회","삭제","종료"};

        for(int i=0; i<5;i++){
            System.out.println((i+1)+". "+menu[i]);
        }

        System.out.print("메뉴 번호를 입력하세요 : ");

        Scanner sc =new Scanner(System.in);
        int menunum = sc.nextInt();

        System.out.println(menu[menunum-1]+"메뉴입니다.");

    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 한 개 입력하세요 : ");
        int num = sc.nextInt();
        if(num%2 == 0 && num > 0) {
            System.out.println("짝수다");
        } else if(num%2 == 1) {
            System.out.println("홀수다");
        } else if(num<0) {
            System.out.println("양수만 입력해주세요");
        }
    }

    public void practice3() {
        Scanner score = new Scanner(System.in);

        System.out.println("국어점수 : ");
        int kor = score.nextInt();

        System.out.println("수학점수 : ");
        int math = score.nextInt();

        System.out.println("영어점수 : ");
        int eng = score.nextInt();

        if(kor>=40 && math>=40 && eng>=40 && ((kor+math+eng)/3)>=60) {
            System.out.println("국어점수 : "+kor);
            System.out.println("수학점수 : "+math);
            System.out.println("영어점수 : "+eng);
            System.out.println("영어점수 : "+eng);
            System.out.println("합계 : "+(kor+math+eng));
            System.out.println("평균 : "+(kor+math+eng)/3.0);
            System.out.println("축하합니다, 합격입니다.");
        } else {
            System.out.println("불합격입니다");
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~12 사이의 정수 입력 : ");
        int month = sc.nextInt();
        switch(month) {
            case 1,2,12:
                System.out.println(month + "는 겨울입니다");
                break;
            case 3,4,5:
                System.out.println(month + "는 봄입니다");
                break;
            case 6,7,8:
                System.out.println(month + "는 여름입니다");
                break;
            case 9,10,11:
                System.out.println(month + "는 가을입니다");
                break;
            default:
                System.out.println("잘못 입력된 달");
        }

    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("키를 입력해주세요");
        double height = sc.nextDouble();
        System.out.println("몸무게를 입력해주세요");
        double weight = sc.nextDouble();
        double BMI = weight/((height*0.1)*(height*0.1));

        if(BMI < 18.5) {
            System.out.println("BMI지수 : " + BMI);
            System.out.println("저체중");
        } else if(BMI>=18.5 && BMI<23) {
            System.out.println("BMI지수 : " + BMI);
            System.out.println("정상체중");
        } else if(BMI>=23 && BMI <30) {
            System.out.println("BMI지수 : " + BMI);
            System.out.println("비만");
        } else {
            System.out.println("고도비만");
        }
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("피연산자1 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("피연산자2 입력 : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("연산자를 입력(+,-,*,/,%) : ");
        char cr = sc.nextLine().charAt(0);

        switch(cr) {
            case '+':
                System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
                break;
            case '/':
                System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
                break;
            case '%':
                System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
                break;
        }


    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("중간 고사 점수 : ");
        double mid = sc.nextDouble()*0.2;
        System.out.println("기말 고사 점수 : ");
        double fin = sc.nextDouble()*0.3;
        System.out.println("과제 점수 : ");
        double wok = sc.nextDouble()*0.3;
        System.out.println("출석 회수 : ");
        double ab = sc.nextDouble();

        double all = mid+fin+wok+ab;

        System.out.println("============결과============");
        System.out.println("중간고사점수(20) : " + mid);
        System.out.println("기말고사점수(30) : " + fin);
        System.out.println("과제 점수(30) : " + wok);
        System.out.println("출석 점수(20) : " + ab);
        System.out.println("총점 : " + (mid+fin+wok+ab));
        double allscore = mid+fin+wok+ab;
        double go = wok/20;
        if(allscore>=70 && go>=0.7) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
