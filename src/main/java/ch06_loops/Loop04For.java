package ch06_loops;
/*
    for 반복문(for loop)
    : 대부분의 경우 횟수가 고정되어 있을 때 사용하는 반복문
    (근데 아까 저희는 구구단 하든지 레슨 어쩌고 할 때 횟수를 고정시켜서 사용했었습니다만
    사실 for문을 쓰는 편이 훨씬 간단합니다)

    그럼 무엇을 기준으로 for / while을 선택하는가?
    : 홋쉬를 기준으로 특정 반복횟수가 되었을 때 반복을 정지하고 싶다면 - for
    : 몇 번이나 진행될지 모르지만 특정 상태가 되었을 때 반복을 정지하고 싶다면 - while

    형식 :
    for(시작값 ; 종료값 ; 증감값) {
        반복실행문
    }
 */
public class Loop04For {
    public static void main(String[] args) {
//        int i = 1;
//        while(i < 11) {
//            System.out.println(i + " ");
//            i++;
//        }
//        System.out.println();
//
//        for(int j = 1 ; j < 11 ; j++) {
//            System.out.println(j + " ");
//        }

        // 1부터 100까지 합을 구하시오(for문과 while문)
        int sum=0;
        for(int num = 1 ; num < 101 ; num++) {
            sum += num;
        }
        System.out.println("1~100까지 총합은 " + sum +"입니다.");

        System.out.println();

        int num2=1;
        int sum2=0;
        while(num2 < 101) {
            sum2 += num2;
            num2++;
        }
        System.out.println("1~100까지 총합은 " + sum2 +"입니다.");
    }
}
