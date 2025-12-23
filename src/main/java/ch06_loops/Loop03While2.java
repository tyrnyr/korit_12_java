package ch06_loops;
/*
    중첩 while문(Nested - while)
    형식 :
    while(조건식1) {
        반복실행문1-a
        while(조건식2) {
            반복실행문2
        }
        반복실행문1-b
    }

    1일차 1교시 입니다.
    ...
    1일차 3교시 입니다.
    ...
    5일차 1교시 입니다.
    ...
    5일차 3교시 입니다.
 */
public class Loop03While2 {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;

        while(i<6) {
            while(j<4) {
                System.out.println(i + "일차 " + j + "교시입니다.");
                j++;
            }
            i++;
            j = 1;
            System.out.println();
        }

        System.out.println("두번째 방법");
        int k = 1;
        int t = 0;

        while(k<6) {
            t++;
            System.out.println(k + "일차 " + t + "교시입니다.");
            if(t == 3) {
                k++;
                t =0;
                System.out.println();
            }
        }
    }
}
