package ch11_arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {

        int num;
        double sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        num = scanner.nextInt();
        scanner.nextLine();

        String[] name = new String[num];
        double[] score = new double[num];

        for(int i = 0 ; i < num ; i++) {
            System.out.print((i+1)+" 번 학생의 이름을 등록하세요 >>> ");
            name[i] = scanner.nextLine();
        }
        System.out.println();
        for(int i = 0 ; i < num ; i++) {
            System.out.print((i+1)+" 번 학생의 점수를 입력하세요 >>> ");
            score[i] = scanner.nextDouble();
            sum += score[i];
        }
        System.out.println();
        System.out.println("학생들의 점수 총합은 "+ sum+"점 입니다.");
    }
}
