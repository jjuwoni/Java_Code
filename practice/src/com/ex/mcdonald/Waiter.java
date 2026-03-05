package com.ex.mcdonald;

import java.util.Scanner;

public class Waiter {

    Scanner sc = new Scanner(System.in);

    WildcardBurger wb = new WildcardBurger();

    public void BurChee() {
        while (true) {
            System.out.println("---------------옵션을 선택해 주세요.---------------");
            System.out.println("1. 치즈 추가");
            System.out.println("2. 패티 추가");
            System.out.println("3. 소스 추가");
            System.out.println("4. 추가 안함");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    wb.Cheese(new Kitchen<Burger>(new Burger()));

                    break;
                case 2:
                    wb.Patty(new Kitchen<Burger>(new Burger()));

                    break;
                case 3:
                    wb.Sauce(new Kitchen<Burger>(new Burger()));

                    break;
                case 4:
                    System.out.println("----------재료 추가 없이 제공되었습니다.");
                    break;
                default:
                    System.out.println("----------잘못된 번호를 입력하셨습니다");
                    break;

            }
            System.out.println("더 주문하시겠습니까?");
            System.out.println("1. 예");
            System.out.println("2. 아니오");
            int no2 = sc.nextInt();
            switch (no2) {
                case 1:
                    break;
                case 2:
                    System.out.println("주문이 완료되었습니다.");
                    System.exit(0);
                    break;

            }
            if(no2==1) {
                break;
            }

        }
    }

    public void BurChic() {
        while (true) {
            System.out.println("---------------옵션을 선택해 주세요.---------------");
            System.out.println("1. 토마토 추가");
            System.out.println("2. 패티 추가");
            System.out.println("3. 소스 추가");
            System.out.println("4. 추가 안함");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    wb.Cheese(new Kitchen<Burger>(new Burger()));

                    break;
                case 2:
                    wb.Patty(new Kitchen<Burger>(new Burger()));

                    break;
                case 3:
                    wb.Sauce(new Kitchen<Burger>(new Burger()));

                    break;
                case 4:
                    System.out.println("----------재료 추가 없이 제공되었습니다.");
                    break;
                default:
                    System.out.println("----------잘못된 번호를 입력하셨습니다");
                    break;

            }
            System.out.println("더 주문하시겠습니까?");
            System.out.println("1. 예");
            System.out.println("2. 아니오");
            int no2 = sc.nextInt();
            switch (no2) {
                case 1:
                    break;
                case 2:
                    System.out.println("주문이 완료되었습니다.");
                    System.exit(0);
                    break;

            }
            if(no2==1) {
                break;
            }

        }
    }

    public void BurDro() {
        while (true) {
            System.out.println("---------------옵션을 선택해 주세요.---------------");
            System.out.println("1. 토마토 추가");
            System.out.println("2. 패티 추가");
            System.out.println("3. 소스 추가");
            System.out.println("4. 추가 안함");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    wb.Cheese(new Kitchen<Burger>(new Burger()));
                    break;
                case 2:
                    wb.Patty(new Kitchen<Burger>(new Burger()));
                    break;
                case 3:
                    wb.Sauce(new Kitchen<Burger>(new Burger()));
                    break;
                case 4:
                    System.out.println("----------재료 추가 없이 제공되었습니다.");
                    break;
                default:
                    System.out.println("----------잘못된 번호를 입력하셨습니다");
                    break;

            }
            System.out.println("더 주문하시겠습니까?");
            System.out.println("1. 예");
            System.out.println("2. 아니오");
            int no2 = sc.nextInt();
            switch (no2) {
                case 1:
                    break;
                case 2:
                    System.out.println("주문이 완료되었습니다.");
                    System.exit(0);
                    break;

            }
            if(no2==1) {
                break;
            }

        }
    }
}