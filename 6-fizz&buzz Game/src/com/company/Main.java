package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        for (int i = 1; i <= 100; i++) {
            System.out.printf("\n");
            if (i % 3 == 0) System.out.printf("Fizz");
            if (i % 5 == 0) System.out.printf("Buzz");
            if (i % 3 != 0 && i % 5 != 0) System.out.printf("" + i);
            /**
             *
             * در کد بالا با استفاده از چیز هایی که تاحلا یاد گرفتیم یه بازی ساختیم
             * که داستان بازی اینجوریه اعدادی که باقیمانده اون ها به ۳  صفر هست رو برا ما فیز میزنه
             * و به ۵ هم صفر است بازز میزنه که یه بازیه به اسم fizz&buzz
             * که مربوط به مضرب ها در ریاضی هست
             *
             * یه مقدار کد رو ببینید خیلی ساده هست و متوجه میشید و این قسمت به این اشاره کردم که ما میتونیم دستورات تک خطی
             * رو جلوی خود if هم بنویسیم و صرفا نیاز نیست از کروشه یا آکولاد استفاده کنیم
             *
             */

        }
    }
}
