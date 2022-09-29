package com.study.codingtests.string;

import java.util.Scanner;

public class String7 {

    public String solution1(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        // str = GOOG
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public String solution2(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public String solution3(String str) {
        String answer = "YES";
        char[] arr = str.toUpperCase().toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        // str = GOOG
        while (lt < rt) {
            if (arr[lt] != arr[rt]) {
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }

        return answer;
    }

    public static void main(String[] args) {
        String7 main = new String7();
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();
        System.out.println(main.solution1(str));
        System.out.println(main.solution2(str));
        System.out.println(main.solution3(str));
    }
}
