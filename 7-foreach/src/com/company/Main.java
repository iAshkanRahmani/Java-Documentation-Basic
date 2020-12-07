package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /**
         * کد های زیر ما اومدیم یه ارایه تعریف کردیم
         * و با استفاده از دستور forech  هر ایندکس اون رو به اضافه ۲ کردیم
         */


	// write your code here
        int[] iList = {12,26,39,52,14,9}; //در این خط یک آرایه با چند متود تعریف میکنیم


        // حالا در کد های زیر یا استفاده از foreach مقدار های آرایه خودمون رو مثبت ۲ میکنیم
        for (int i:
             iList) {
            System.out.println(i+2);

        }
    }
}
