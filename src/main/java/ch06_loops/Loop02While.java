package ch06_loops;
/*
    1부터 100까지 출력하시오
    실행 예
    1
    2
    3
    ...
    100
 */
public class Loop02While {
    public static void main(String[] args) {

//        int i = 0;
//
//        while(i < 100)
//        {
//            System.out.println(++i);
//        }

/*
    2번문제
    1 2 3 4 5 6 .... 10
    11 12 13 14 15 16 .... 20
    ...
    91 92 93 94 95 96 .... 100
 */
        System.out.println("첫번째 풀이방법");

        int i = 0;

        while(i<100) {
            System.out.print(++i + " ");
            if(i%10 == 0)   System.out.println();
        }

        System.out.println("두번째 풀이방법");

        int k = 0;
        int j=1;

        while(k < 100) {
            while(j < 11){
                System.out.print((k+j) + " ");
                j++;
            }
            System.out.println();
            j=1;
            k+=10;
        }

        System.out.println("세번째 풀이방법");

        int a = 0;
        while(a < 10) {
            System.out.println((10*a+1) + " " + (10*a+2) + " " + (10*a+3) + " " + (10*a+4) + " " + (10*a+5) + " " + (10*a+6) + " " + (10*a+7) + " " + (10*a+8) + " " + (10*a+9)+ " " + (10*a+10));
            a++;
        }


    }
}
