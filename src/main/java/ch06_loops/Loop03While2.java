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

        int day=0;

        while(day < 5) {
            int lesson=0;         // 반복실행문1-a
            while(lesson < 10) {
                System.out.println(day + "일차 " + lesson + "교시입니다." + day + " x " + lesson + " = " + (day*lesson)); //반복실행문2
                lesson++;
            }
            System.out.println("");
            day++;  // 반복실행문1-b
        }

        int dan = 2;
        while(dan < 10) {
            int num = 1;
            while (num < 10) {
                int result = dan * num;

                System.out.println(dan + " X " + num + " = " + result);
                num++;
            }
            dan++;
        }
    }
}
