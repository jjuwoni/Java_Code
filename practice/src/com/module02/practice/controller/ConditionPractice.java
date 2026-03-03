package com.module02.practice.controller;

import java.util.Scanner;

public class ConditionPractice {
    public static void main(String[] args) {

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
                System.out.println(month + "월은 겨울입니다");
                break;
            case 3,4,5:
                System.out.println(month + "월은 봄입니다");
                break;
            case 6,7,8:
                System.out.println(month + "월은 여름입니다");
                break;
            case 9,10,11:
                System.out.println(month + "월은 가을입니다");
                break;
            default:
                System.out.println("잘못 입력된 달");
        }

    }

    public void practice5() {
        String id = "boram";
        int pw = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디 : ");
        String eid = sc.nextLine();
        System.out.print("비밀번호 : ");
        int epw = sc.nextInt();
        if(eid.equals(id) && epw==pw) {
            System.out.println("로그인 성공");
        } else if(!(eid.equals(id))) {
            System.out.println("아이디가 틀렸습니다.");
        } else if(epw!=pw) {
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }

    public void practice6() {
        String master = "관리자";
        String people = "회원";
        String stranger = "비회원";
        Scanner sc = new Scanner(System.in);
        System.out.println("권한을 확인하고자 하는 회원 등급 : ");
        String rank = sc.nextLine();
        if(rank.equals(master)) {
            System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
        } else if(rank.equals(people)) {
            System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
        } else if(rank.equals(stranger)) {
            System.out.println("게시글 조회");
        } else {
            System.out.println("잘못 입력했습니다.");
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

    public void practice10() {
        System.out.println("실행할 기능을 선택하세요.");
        System.out.println("1. 메뉴 출력");
        System.out.println("2. 짝수/홀수");
        System.out.println("3. 합격/불합격");
        System.out.println("4. 계절");
        System.out.println("5. 로그인");
        System.out.println("6. 권한 확인");
        System.out.println("7. BMI");
        System.out.println("8. 계산기");
        System.out.println("9. 점수 결과 출력");
        Scanner sc = new Scanner(System.in);
        System.out.println("선택 : ");
        int a = sc.nextInt();
        switch(a) {
            case 1:
                System.out.println(a);
                practice1();
                break;
            case 2:
                System.out.println(a);
                practice2();
                break;
            case 3:
                System.out.println(a);
                practice3();
                break;
            case 4:
                System.out.println(a);
                practice4();
                break;
            case 5:
                System.out.println(a);
                practice5();
                break;
            case 6:
                System.out.println(a);
                practice6();
                break;
            case 7:
                System.out.println(a);
                practice7();
                break;
            case 8:
                System.out.println(a);
                practice8();
                break;
            case 9:
                System.out.println(a);
                practice9();
                break;
            default:
                break;
        }

    }
}
