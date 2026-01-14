package ch21_exception;

class LoginFailedException extends Exception{
    public LoginFailedException(String message) {
        super(message); // message를 argument로 한 LoginFailedException의 슈퍼클래스의 생성자를 호출한다는 뜻
        System.out.println("로그인시 예외가 발생하였습니다.");
    }
}


public class Exception2 {

    public static void login(String id, String passward) throws LoginFailedException {
        String correctId = "admin";
        String corretPassword = "1q2w3e4r!!";
        // 특정 메서드에서 예외가 발생하는 것을 지정하고 싶다면 throws 명령어를 입력해야 함(3인칭 단수라서)

        if(!id.equals(correctId) || !passward.equals(corretPassword)) {
            throw new LoginFailedException("ID또는 PW가 틀렸습니다.");
            // throw(s가 없습니다) : 동사 원형으로 시작했으니까 명령문
            // LoginFailedException() 생성자에 String argument를 집어넣어서 객체를 생성했는데,
            // 그 객체를 던지라는 의미로 해석
        }
    }
    /*
        Exception(String message) {
            this.message = message;
        }
        인 상태라고 봐야겠네요. 그걸 getter(getMessage())를 통해서 출력했기 때문에 콘솔상의 순서가 다르게 보임
     */

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "1234qwer!!";

//        login(inputId, inputPassword);
        // throws를 달고 나니까 오류가 발생 -> try / catch / finally를 써라
        // 혹은 main도 method에 해당하니까 main 메서드에 throws
        try {
            login(inputId, inputPassword);
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}