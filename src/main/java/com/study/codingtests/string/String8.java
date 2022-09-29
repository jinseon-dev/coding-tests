package com.study.codingtests.string;

import java.util.Scanner;

public class String8 {

    public String solution(String str) {
        String answer = "NO";

        // str = found7, time: study; Yduts; emit, 7Dnuof
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        String8 main = new String8();
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.nextLine();
        System.out.println(main.solution(str));
    }
}
