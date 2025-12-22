package ch02_operator;
/*
    Camel case -> Java 상에서의 변수 표기법(JavaScript에서도 사용)
    Snake case -> Java 에서 쓸 일이 없습니다. 근데 상수 표기에서 비슷하게 사용됨
    Pascal case -> 첫 번째 문자가 대문자고 나머지는 소문자로 가다가 두번째 단어의 첫번째 문자는 대문자
        ex) 한단어 : Operator01
        복수단어 : OperatorTestResult - > Pascal case는 클래스 명명 규칙에 해당
 */

public class Operator01 {
    public static void main(String[] args) {
        int i = 10;

        // 이전 패키지까지 해서 자료형, 변수명, 데이터에 대해서 학습했습니다.
        // 이번에는 '='를 학습할겁니다.
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        /*
            대입 연산자 = : 왼쪽과 오른쪽이 같다는 의미가 아니라
            = 오른쪽에 있는 '데이터'를 = 왼쪽에 있는 '변수'에 '대입'한다는 의미

            그렇다면 왼쪽과 오른쪽이 같다는 의미로는 어떻게 표시할까요? ==
         */

        // 일반 연산자
        /*
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지 연산자
         */

        int a = 5;
        int b = 2;
        System.out.println(a/b);
        double result = (double)(a/b);
        System.out.println(result);
        // 알아서 2.5 나오면 좋겠지만 아까 말씀드렸던 것처럼 얘네가 생각보다 더 멍청해서
        // 하나 하나 잘 지정해줘야합니다.
        /*
            즉 개발자는 어떤 사람이다?
            컴퓨터가 잘 작동할 수 있도록 명령을 잘내리는 사람이다. 라고 생각해주시고
            혹시 컴퓨터가 기분 나쁘지 않는지 체크도 좀 해줘야 합니다.
         */
        /*
            복합 대입 연산자
            1) +=
            2) -=
            3) *=
            4) /=
         */
        int num1 = 1;
        System.out.println(num1);
        num1 += 2;
        System.out.println(num1);
        num1 -= 1;
        System.out.println(num1);
        num1 *= 10;
        System.out.println(num1);
        num1 /= 5;
        System.out.println(num1);

        System.out.println("----------------------------");
        int j = 10;
        System.out.println(j);
        System.out.println(j++); // 변수명 ++ : 코드를 실행시킨 후에 J에 1을 더함 / 그래서 10
        System.out.println(j);
        System.out.println(++j); // ++ 변수명 : 코드를 실행시키기 전에 j에 1을 더함 / 그래서 12
        System.out.println(j);
        System.out.println(j--); // 변수명 -- : 코드를 실행시킨 후에 j에 1을 뺀다 / 그래서 12
        System.out.println(j);
        System.out.println(--j); // -- 변수명 : 코드를 실행시키기 전에 j에 1을 뺀다 / 그래서 10
        System.out.println(j);

        int age = 20;
        System.out.println("제 나이는 " + age + "살이 됩니다.");
        System.out.println("내년에는 " + age + 1 + "살이 됩니다.");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");
        System.out.println("내년에는 " + ++age + "살이 됩니다.");
        // 79번 라인에서 왜 원하 결과값이 나오지 않는가 설명
        // Operator02 클래스를 생성하시오
    }
}
