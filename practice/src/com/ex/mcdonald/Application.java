package com.ex.mcdonald;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Kiosk kis = new Kiosk();

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("============주문하시겠습니까?===========");
            System.out.println("1. 치즈버거");
            System.out.println("2. 치킨버거");
            System.out.println("3. 떨군버거");
            System.out.println("4. 떠나기");

            int num = sc.nextInt();

            switch (num) {
                case 1 : kis.BurgerChee(); break;
                case 2 : kis.BurgerChic(); break;
                case 3 : kis.BurgerDrop(); break;
                case 4 :
                    System.out.println("----------안녕히가세요.");
                    System.exit(0);
                    break;
                default :
                    System.out.println("----------잘못된 번호를 입력하셨습니다"); break;

            }

        }
    }
}
