package ch06_loops;
/*
    Nested for - loop
    for (시작값;한계값;증감값) {
        반복실행문1-a
        for (시작값;한계값;증감값) {
            반복실행문2
        }
        반복실행문1-b
        for (시작값;한계값;증감값) {
            반복실행문3
        }
        반복실행문1-c
    }

    *                   고려 사항
    **                  반복이 몇 번 일어나는가?
    ***                 무엇을 기준으로 반복이 이루어진다고 판단할 수 있나?
    ****                각 라인마다 별의 개수가 달라진다면 어떻게 통제해야하는가?
    *****
 */
public class Loop07Star {
    public static void main(String[] args) {
        System.out.println("과제 1 별짓기");
        for(int i = 1 ; i < 6 ; i++) {
            for(int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        /*
            별찍기를 통한 for문 구조 학습
                           i=0, j=0 일 경우 반복실행문2가 아예 실행되지 않습니다. 한계값이 0 < 0 false라서
            *              i=1, j=0 일 때 별이 하나찍히고, i=1 / j=1 일 때 false라서 개행
            **             i=2, j=0 일 때 각각 별이 하나씩 찍히기 때문에 별이 두 개 되고 개행
            ***
            ****
            *****          i=5, j=0, 1, 2, 3, 4 까지 다섯개의 별이 찍히고 개행
         */
        /*
            *****
            ****
            ***
            **
            *
         */

        System.out.println("과제 2 별짓기");
        for(int i = 5 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
