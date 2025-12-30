package ch09_getter_setter;

public class Person {
    String name;
    int age;
    String address;
    // 기본생성자
    public Person() {
    }

    // String name을 매개변수로 받는 생성자
    public Person(String name) {
        this.name = name;
    }

    // setName, setAge, setAddress 작성
    public void setName(String name) {
        int nameLength = name.length();
        if(nameLength > 4) {
            System.out.println("변경할 수 없습니다.");
            return; // 뒷부분 실행 안함
        }
        System.out.println("이름이 변경되었습니다.");
        System.out.println("변경 전 : " + this.name);
        this.name = name;
        System.out.println("변경 후 : " + this.name);
    }

    public void setAge(int age) {
        if(age < 0 || age > 200) {
            System.out.println("입력이 불가능한 나이입니다!");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // getName, getAge, getAddress 작성
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
    // PersonMain에 person1 객체를 기본 생성자를 통해 생성하시오.
    // person1.name = "김일", person1.age = -10, person1.address = "부산광역시 부산진구"
    // 를 대입하시오.
}