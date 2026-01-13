package ch19_collections;
/*
           1. 학생의 수를 입력 받아 해당 횟수만큼 반복문을 돌릴 것.
           2. 1번 ~ 5번 학생의 응답을 fieldTrips List에 저장할 것
           3. 중복을 제거하기 위하여 fieldTripSet에 이상의 List의 element들을 옮겨 담을 것
           4. 맨 마지막 출력문은 Set -> List로 재이동하여 finalFieldTrips List에서 element들을 추출하여 작성할 것.
           실행 예
           몇 명의 학생이 수학 여행지를 입력하시겠습니까? 5 명
           1 번 학생의 수학 여행지를 입력하세요 >>> 제주
           2 번 학생의 수학 여행지를 입력하세요 >>> 제주
           3 번 학생의 수학 여행지를 입력하세요 >>> 민속촌
           4 번 학생의 수학 여행지를 입력하세요 >>> 민속촌
           5 번 학생의 수학 여행지를 입력하세요 >>> 제주

           1 번 학생의 후보지 : 제주
           2 번 학생의 후보지 : 제주
           3 번 학생의 후보지 : 민속촌
           4 번 학생의 후보지 : 민속촌
           5 번 학생의 후보지 : 제주

           수학 여행 후보지는
           제주
           민속촌
           입니다.
*/

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        int maxIndex;

        List<String> fieldTrip = new ArrayList<>();
        List<String> tmpFieldTrip = new ArrayList<>();
        Set<String> reFieldTrip = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까? >>> ");
        maxIndex = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0 ; i < maxIndex ; i++) {
            System.out.print((i+1) +" 번 학생의 여행지를 입력하세요 >>> ");
            fieldTrip.add(scanner.nextLine());
        }

        System.out.println();
        for(int i = 0 ; i < fieldTrip.size() ; i++) {
            System.out.println((i+1) +" 번 학생의 후보지 : " + fieldTrip.get(i));
        }

        reFieldTrip.addAll(fieldTrip);
        tmpFieldTrip.addAll(reFieldTrip);
        Collections.sort(tmpFieldTrip, Comparator.reverseOrder());


        System.out.println("\n수학여행 후보지는");
        for(int i = 0 ; i < tmpFieldTrip.size() ; i++) {
            System.out.println(tmpFieldTrip.get(i));
        }
        System.out.println("입니다.");
    }
}
