package com.module01.practice.variable;

import java.util.Scanner;

public class PracApplication5 {
    public static void main(String[] args) {
        double[] scores = new double[3];
        double all = 0.0;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<scores.length; i++) {
            scores[i] = sc.nextDouble();
            all += scores[i];
        }

        System.out.println("총점 : " + (int)all);
        System.out.println("평균 : " + ((int)all/scores.length));


    }

}
