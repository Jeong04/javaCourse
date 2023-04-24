package ch05;

import java.util.Scanner;


class inputString {
    private String str; // 문자열

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inputString str = new inputString();

        while(true) {
            System.out.print("문자열을 입력하세요> ");
            str.setStr(sc.next());

            if (str.getStr().substring(0, 3).equals("www")) {
                System.out.println(str.getStr() + " 은 'www'로 시작합니다.");
            } else if (str.getStr().equals("quit")) {
                break;
            } else if (!str.getStr().substring(0, 3).equals("www")) {
                System.out.println(str.getStr() + " 은 'www'로 시작하지 않습니다.");
            }
        }

    }
}
