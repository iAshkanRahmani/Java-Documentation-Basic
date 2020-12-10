package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //صدا زدن فانکشن اول با استفاده از متغیر های ثابت در فانکشن
        addion(12,14,11);


        //======================================

        /**
         * صدا زدن فانکشن دوم با استفاده از دستور چاپ
         * (دلیل این دستور چاپ برای اینکه return خودش را برمیگرداند نه مقدار را برای درک بهتر در گوگل سرچ بزنید)
         */
        System.out.println(addion2(21,33));
    }


    /**
     * در فانکشن زیر با استفده از چند متغیر یک غانکشن تعریف کردیم که یک در موقع صدا زدن مقدار هارا میدهید و کار های لازم رو روی مقدار ها انجام میدهد
     * در کل مقدار ثابت نیست و ما میتونیم اینگونه دستورات رو بنویسیم و مقدار رو وقتی که میخوایم فانکشن رو صدا بزنیم همونجا بهش بدی
     * مثاب زده شده
     */

    public static void addion(int number1,int number2, int number3) {
        System.out.println("Jame Adad --> " + number1 + " + " + number2 + " + " + number3+" = "+(number1+number2+number3));
    }


    /**
     *تعریف یک فانکشن با return
     * نکته Return مقدار برگشتی را به خود تابع میدهد در خروجی نشان نمیدهد برای نشان دادن آن باید در صدا زدن فانکشن خود فانکشن را چاپ کنید
     * برای مثال برمیگرداند داخل خودش
     * برای درک بهتر در گوگل سرچ بزنید که درک بهتری از کاربرد return داشته باشید
     */
    public static int addion2(int number1,int number2){
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("Jame Do adde Shoma Ba function Return ");
        return number1 + number2;
    }
}
