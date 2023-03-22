package ch05;

import java.util.*;

public class StringTest_02 {
    public static void main(String[] args) {
        String str; // 입력 값을 저장할 변수
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("문자열을 입력하세요. >");
            str = sc.next(); // 값 입력 받기

            if (str.equals("quit") == true) { // equals: 대소문자 엄격 구분, quit 입력 시 msg 발생 동시에 프로그램 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (str.matches("^www\\.(.+)")) { // matches: 정규표현식을 인자로 받음, 문자열과 패턴이 일치하는지 반환
                System.out.println(str + "은 'www' 로 시작합니다.");  // www 로 시작할 경우
            } else {
                System.out.println(str + "은 'www' 로 시작하지 않습니다."); // www 로 시작하지 않을 경우

            }
        }
    }
}
