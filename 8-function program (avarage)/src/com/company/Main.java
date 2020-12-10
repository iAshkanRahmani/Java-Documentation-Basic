package com.company;

public class Main {

    /**
     * ما در کد های زیر اومدیم و یک فانکشن یا متد برای گرفتن معدل تعریف کردیم و یک کاره تکراری با هر بار صدا زدن اون داخل کلاس main
     * اجرا میشه
     *سعی شده با تمام چیز هایی که گفتیم یک خروجی ساده بگیریم
     */
    public static void main(String[] args) {
	// write your code here
        avrage();
    }

    //از اینجا کد های فانکشن یا متد avarage ما شروع میشه که به صورت بسیار ساده نوشتیم این فانکشن رو
    public static void avrage(){
        int ii = 0;
        double[] nomarat = {12, 19, 18, 19, 20, 18, 18, 17, 14};
        int jame_adad = 0;
        for (double i :
                nomarat) {
            jame_adad += i;
        }
        double moadel = jame_adad / 9;
        System.out.println(moadel);
    }

}
