package ch05;

public class StringTest_01 {
    public static void main(String[] args) {
        String proverb = "A barking dog"; // 문자열 리터럴. new 연산자 생략
        String S1, S2, S3, S4; // 참조변수로서 메소드에서 반환된 참조값을 받음

        System.out.println("문자열의 길이 =" + proverb.length()); // 문자열의 길이를 리턴함

        S1 = proverb.concat(" naver Bites!"); // 문자열 결합
        S2 = proverb.replace('B', 'b'); // 문자 교환
        S3 = proverb.substring(2, 5); // 부분 문자열 추출(마지막 index 는 추출하지 않음)
        S4 = proverb.toUpperCase(); // 대문자로 변환

        // 출력
        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        System.out.println(S4);
    }
}
