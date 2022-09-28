package com.study.codingtests.string;

import java.util.Scanner;

public class String6 {

    public String solution(String str) {
        String answer = "";

        // str = ksekkset
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String6 main = new String6();
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();
        System.out.println(main.solution(str));
    }
}
