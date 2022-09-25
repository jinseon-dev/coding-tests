package com.study.codingtests.string;

import java.util.Scanner;

public class String2 {

    public String solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            // 아스키코드 이용 (A:65 ~ Z:90, a:97 ~ z:122)
            if (x >= 65 && x <= 90) {
                answer += (char) (x + 32);
            } else {
                answer += (char) (x - 32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String2 main = new String2();
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();
        System.out.println(main.solution(str));
    }
}
