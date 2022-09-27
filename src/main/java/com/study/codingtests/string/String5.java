package com.study.codingtests.string;

import java.util.Scanner;

public class String5 {

    public String solution(String str) {

        // str = a#b!GE*T@S
        char[] arr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String5 main = new String5();
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();
        System.out.println(main.solution(str));
    }
}
