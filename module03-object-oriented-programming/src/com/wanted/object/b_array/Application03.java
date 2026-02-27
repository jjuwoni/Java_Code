package com.wanted.object.b_array;

public class Application03 {
    public static void main(String[] args) {
        
        // 출력 예시 : 당신이 뽑은 카드는 SPADE ACE 입니다!
        // 필요한 값 : 카드넘버, 문양
        
        String[] shapes = { "SPADE" , "CLOVER", "HEART", "DIAMOND" };
        String[] numbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
        int a = shapes.length;
        System.out.println(a);
        // Math 클래스 -> 수학적 요소(합계, 평균, 올림, 내림, 등등)
        // 우리 같은 수학 혐오자들을 위해 개발자들이 미리 만들어둠.
        int ramdomShape = (int)(Math.random() * shapes.length);
        System.out.println("ramdonShape = " + ramdomShape);
        int ramdomNumber = (int)(Math.random() * numbers.length);
        System.out.println("ramdonNumber = " + ramdomNumber);

        System.out.println("당신이 뽑은 카드는 " + shapes[ramdomShape] + " " + numbers[ramdomNumber] + "입니다!");
    }
}
