package com.ex.pokemon;

import java.util.Scanner;

public class Skill {

    Pokemons pok1 = new Eisanghaessi();
    Pokemons pok2 = new Ggobugi();
    Pokemons pok3 = new Pairi();

    Scanner sc = new Scanner(System.in);

    public void goGreen() {
        while(true) {
//            System.out.println("---------------가랏! 이상해씨!!!---------------");
            System.out.println("---------------이상해씨는 무얼 할까?---------------");
            System.out.println("1. 몸통박치기");
            System.out.println("2. 째려보기");
            System.out.println("3. 덩쿨채찍");
            System.out.println("4. 포켓몬을 교체한다");
            System.out.println("5. 도망간다");
            System.out.print("-----------번호를 골라주세요   ");

            int num = sc.nextInt();

            switch (num) {
                case 1 : pok1.tackle(); break;
                case 2 : pok1.staring(); break;
                case 3 : ((Eisanghaessi)pok1).rootAttack(); break;
                case 4 : {
                    System.out.println("----------어떤 포켓몬으로 교체하시겠습니까.");
                    System.out.println("1. 꼬부기");
                    System.out.println("2. 파이리");
                    System.out.print("-----------번호를 골라주세요   ");
                    int num2 = sc.nextInt();
                    if(num2 == 1) {
                        goblue();
                    } else if(num2 == 2) {
                        gored();
                    }
                    break;
                }
                case 5 :
                    System.out.println("----------도망쳤다.");
                    System.exit(0);
                default :
                    System.out.println("----------잘못된 번호를 입력하셨습니다"); break;

            }

        }
    }

    public void goblue() {
        while(true) {
//            System.out.println("---------------가랏! 꼬부기!!!---------------");
            System.out.println("---------------꼬부기는 무얼 할까?---------------");
            System.out.println("1. 몸통박치기");
            System.out.println("2. 째려보기");
            System.out.println("3. 물대포");
            System.out.println("4. 포켓몬을 교체한다");
            System.out.println("5. 도망간다");
            System.out.print("-----------번호를 골라주세요   ");

            int num = sc.nextInt();

            switch (num) {
                case 1 : pok2.tackle(); break;
                case 2 : pok2.staring(); break;
                case 3 : ((Ggobugi)pok2).waterShot(); break;
                case 4 : {
                    System.out.println("----------어떤 포켓몬으로 교체하시겠습니까.");
                    System.out.println("1. 이상해씨");
                    System.out.println("2. 파이리");
                    System.out.print("-----------번호를 골라주세요   ");
                    int num2 = sc.nextInt();
                    if(num2 == 1) {
                        goGreen();
                    } else if(num2 == 2) {
                        gored();
                    }
                    break;
                }
                case 5 :
                    System.out.println("----------도망쳤다.");
                    System.exit(0);
                default :
                    System.out.println("----------잘못된 번호를 입력하셨습니다"); break;

            }

        }
    }

    public void gored() {
        while(true) {
//            System.out.println("---------------가랏! 파이리!!!---------------");
            System.out.println("---------------파이리는 무얼 할까?---------------");
            System.out.println("1. 몸통박치기");
            System.out.println("2. 째려보기");
            System.out.println("3. 불꽃세레");
            System.out.println("4. 포켓몬을 교체한다");
            System.out.println("5. 도망간다");
            System.out.print("-----------번호를 골라주세요   ");

            int num = sc.nextInt();

            switch (num) {
                case 1 : pok3.tackle(); break;
                case 2 : pok3.staring(); break;
                case 3 : ((Pairi)pok3).fireShot(); break;
                case 4 : {
                    System.out.println("----------어떤 포켓몬으로 교체하시겠습니까.");
                    System.out.println("1. 이상해씨");
                    System.out.println("2. 꼬부기");
                    System.out.print("-----------번호를 골라주세요   ");
                    int num2 = sc.nextInt();
                    if(num2 == 1) {
                        goGreen();
                    } else if(num2 == 2) {
                        goblue();
                    }
                    break;
                }
                case 5 :
                    System.out.println("----------도망쳤다.");
                    System.exit(0);
                default :
                    System.out.println("----------잘못된 번호를 입력하셨습니다"); break;

            }

        }
    }


}
