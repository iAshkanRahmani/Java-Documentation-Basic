package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //تعریف آریه در for
        String[] names = new String[45];


        // مقدار دهی به آرایه با استفاده از For
        int ii = 0;
        for (int m = 0;m<45;m++){
            names[ii] = "AShkan rahmani";
            ii++;
        }

        // چاپ مقدار آرایه با استفاده از For  و چاپ یک عدد در کنار متغیر
        int x = 0 ;
        for (int j=0;j<45;j++){
            System.out.println(names[j]+" "+x);
            x = x+1;
        }


    }
}
