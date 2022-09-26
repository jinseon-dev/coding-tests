package com.study.codingtests.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String4 {

    /**
     * StringBuilder reverse() 이용
     */
    public List<String> solution1(String[] str) {
        List<String> answer = new ArrayList<>();

        // str = ['good', 'Time', 'Big']
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    /**
     * 문자 자리 바꾸기
     */
    public List<String> solution2(String[] str) {
        List<String> answer = new ArrayList<>();

        // str = ['good', 'Time', 'Big']
        for (String x : str) {
            // x = Time
            char[] arr = x.toCharArray();
            int lt = 0;
            int rt = arr.length - 1;

            while (lt < rt) {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;

                lt++;
                rt--;
            }
            answer.add(String.valueOf(arr));
        }

        return answer;
    }

    public static void main(String[] args) {
        String4 main = new String4();
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = keyboard.next();
        }

        for (String x : main.solution1(str)) {
            System.out.println(x);
        }

        for (String x : main.solution2(str)) {
            System.out.println(x);
        }
    }
}
