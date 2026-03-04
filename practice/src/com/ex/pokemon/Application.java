package com.ex.pokemon;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Trainer tr = new Trainer();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("---------------학교 끝난 아이 주원이 배틀을 걸어왔다.---------------");
            System.out.println("1. 이상해씨");
            System.out.println("2. 꼬부기");
            System.out.println("3. 파이리");
            System.out.println("4. 도망간다");
            System.out.println("어떤 포켓몬을 내보낼까");

            int num = sc.nextInt();

            switch (num) {
                case 1 : tr.grass(); break;
                case 2 : tr.water(); break;
                case 3 : tr.fire(); break;
                case 4 : System.out.println("----------무사히 도망쳤다."); break;
                default :
                    System.out.println("----------잘못된 번호를 입력하셨습니다"); break;

            }
            if(num == 4) {
                break;
            }

        }
    }
}
