package com.study.codingtests.string;

import java.util.Scanner;

public class String3 {

    /**
     * split 사용
     */
    public String solution1(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;

        // 문자열을 공백 기준으로 나누어 배열에 저장
        // str = it is time to study
        String[] arr = str.split(" ");

        for (String x : arr) {
            int length = x.length();
            if (max < length) {
                max = length;
                answer = x;
            }
        }

        return answer;
    }

    /**
     * indexOf, substring 사용
     */
    public String solution2(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int pos;

        // str = it is time to study
        while ((pos=str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int length = tmp.length();

            if (max < length) {
                max = length;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }

        // 마지막 단어 검증
        if (max < str.length()) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        String3 main = new String3();
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.nextLine();
        System.out.println(main.solution2(str));
    }
}
