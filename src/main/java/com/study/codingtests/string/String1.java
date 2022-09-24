package com.study.codingtests.string;

import java.util.Scanner;

public class String1 {

    public int solution(String str, char c) {
        int answer = 0;

        // 문자열과 캐릭터 모두 대문자로 변환
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        // 문자열에서 주어진 문자를 발견하면 answer++
        for (char x : str.toCharArray()) {
            if (x == c) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        String1 main = new String1();
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();
        char c = keyboard.next().charAt(0);
        System.out.println(main.solution(str, c));
    }
}
