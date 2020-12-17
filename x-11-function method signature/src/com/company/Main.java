package com.company;

import java.util.Arrays;

/**
 * فرق این برنامه با برنامه های معدل های دیگه اینه که اول اینکه از متد ها استفاده شده
 * دوم اینکه با میتونید هرچند تعداد که نمره دلمون میخواد رو موقع فراخونی متد بهش بدیم و اون معدل اون هارو حساب کنه
 * حالا یکی دوتا یا ۱۰۰ تا متد اونورو محاسبه کرده و در خروجی نمایش میده
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        //فراخوانی متود با ورودی هایی از نوع عدد صحیح
        moadel(19,20,18,17,16,12,20,20,19,14,11);


    }
    // در کد های زیر با استفاده از متد یک متد ساخته شده که با ورودی های دلخواه شما معدل رو محاسبه کرده و نمایش میدهد
    public static void moadel(int ... nomarat){
        int result = 0;
    for (int nomre:nomarat) result = result + nomre;
        int avrage = result / nomarat.length;
        System.out.println("Moadele Shoma = "+avrage);
    }
}
