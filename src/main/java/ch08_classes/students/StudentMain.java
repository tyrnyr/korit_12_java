package ch08_classes.students;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(2025002);
        Student student3 = new Student("김삼");
        Student student4 = new Student(2025004,"김사");
        Student student5 = new Student(2025005,"김오",80.7);
        System.out.println();

        // student1은 기본 생성자로 만들었으니 전체 필드에 값을 대입
        student1.name = "김일";
        student1.studentCode = 2025001;
        student1.score = 4.5;

        // student2는 StudentCode를 받는 매개변수 생성자로 만들었으니 나머지 필드에 값을 대입
        student2.name = "김이";
        student2.score = 100;

        // student3은 name을 받는 매개변수 생성자로 만들었으니 나머지 필드에 값을 대입
        student3.studentCode = 2025003;
        student3.score = 95.8;

        // student4은 name, StudentCode를 받는 매개변수 생성자로 만들었으니 나머지 필드에 값을 대입
        student4.score = 4.0;

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();

        Student2 student21 = new Student2(20260001, "김이십일", 1000);

    }
}