package com.practice.hourrank1.easyschool;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:/Study/Prog_Input/myfile.txt");
		Scanner in = new Scanner(file);
        int n = in.nextInt();
        int k = in.nextInt();
        int l = in.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            sum += array[i];
        }
        
        int div = sum/n;
        if(sum%n >0)
        	div++;
        int plus = 0;
        int minus = 0;
        
        for(int i = 0; i<n; i++){
        	if(array[i]>div){
        		minus = minus + (array[i] - div);
        
        	}
        	if(array[i]<div){
        		plus = plus + (div - array[i]);
           	}
        }
        System.out.println((l * (plus - minus))+ (k * minus));
        in.close();
    }

}
