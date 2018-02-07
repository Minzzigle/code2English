package com.minzzigle.codetoenglish.hackerrank.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrays {
    public void solutions() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        //int newArr[] = new int[n];
        //for (int i= n-1; i>=0; i--){
        //    newArr[n-i-1]= arr[i];
        //}
        //System.out.println(newArr);

        List newArr = new ArrayList<Integer>();
        String ans = "";
        for (int i = n-1; i >= 0; i--){
            ans += arr[i] + " ";
        }
        System.out.println(ans);
    }
}
