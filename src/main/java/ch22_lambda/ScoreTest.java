package ch22_lambda;

import java.util.List;

public class ScoreTest {
    public static void main(String[] args) {
        List<Integer> score = List.of(23,1657,2654,94003,59,68,1,5,67,4,3,56);

        score.stream()                              // 1. StreamAPI 사용
                .filter(s-> s>60)            // 2. 60점 미만은 버림
                .map(s -> s+5)               // 3. 남아있는 자료에 5점씩 더함
                .sorted()                           // 4. 오름차순으로 정렬
                .forEach(System.out::println);      // 5. 각각 출력
    }
}
