package com.minzzigle.codetoenglish.hackerrank.question1;

/**
 * 입력값이 주어졌을 때, 입력값을 역순으로 출력한다.
 * [1, 4, 3, 2] => [2, 3, 4, 1]
 *
 * https://www.hackerrank.com/challenges/arrays-ds/problem
 */

public class Arrays {
    public String solutions(int [] input, int size) {
        String ans = "";
        for (int i = size-1; i >= 0; i--){
            ans += input[i] + " ";
        }
        return ans;
    }

    public String solutions_recursive(int [] input, int idx) {
        if(input.length - 1 == idx) {
            return String.valueOf(input[idx]);
        }

        String prefix = solutions_recursive(input, idx + 1);

        return prefix + " " + input[idx];
    }
}
