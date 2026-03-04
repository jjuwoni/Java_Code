package com.ex.coffee;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Barista bar = new Barista();

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("============스마트 커피 머신 시뮬레이션===========");
            System.out.println("1. 머신 켜기");
            System.out.println("2. 커피 추출");
            System.out.println("3. 재료 채우기");
            System.out.println("4. 머신 세척");
            System.out.println("5. 전원 끄기");
            System.out.println("6. 프로그램 종료");
            System.out.print("메뉴를 선택해 주세요. ");

            int num = sc.nextInt();

            switch (num) {
                case 1 : bar.turnOn(); break;
                case 2 : bar.brewing(); break;
                case 3 : bar.reFill(); break;
                case 4 : bar.waching(); break;
                case 5 : bar.turnOff(); break;
                case 6 :
                    System.out.println("----------프로그램을 종료합니다."); break;
                default :
                    System.out.println("----------잘못된 번호를 입력하셨습니다"); break;

            }
            if(num == 6) {
                break;
            }
        }
    }
}
