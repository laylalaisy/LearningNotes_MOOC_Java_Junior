//嗷 感谢爸爸教导 鞠躬跪舔2333333
//好嘛 养一个智障宝宝不容易 加油lol
//本题特殊版本 特别赐名blingbling
//(正经脸感叹一句怪不得WK爸爸上Java课的时候说 你们写的代码到公司都不能用...

package com.example.demo;

import java.util.Scanner;

public class Main {

    public static final String tag = "$GPRMC";

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = "";
        String s4 = "";
        while (!s1.equals("END")) {


            int w1 = s1.indexOf(',');
            int w2 = s1.indexOf(',', w1 + 1);
            boolean checkRes = false;
            if (w2 != -1) {
                char c1 = s1.charAt(w2 + 1);
                if (c1 == 'A') {
                    checkRes = true;
                }
            }
            if (s1.startsWith(tag) && checkRes) {
                s2 = s1;


                int q1 = s1.lastIndexOf('*');
                String s3 = s1.substring(q1 + 1);
                int ji = Integer.parseInt(s3, 16);


                int yh = s1.charAt(1);
                int e1 = s1.indexOf('*');
                for (int i = 2; i < e1; i++) {
                    yh = yh ^ s1.charAt(i);
                }
                boolean checkRes2 = (yh == ji);
                //yh = s1.charAt(1);
                if (checkRes2) {
                    s4 = s2;
                }
            }
            s1 = in.nextLine();
        }
        String sp = s4.substring(7, 9);
        String sq = s4.substring(9, 11);
        String se = s4.substring(11, 13);
        int hour = Integer.parseInt(sp);
        if (hour < 16) {
            hour += 8;
            System.out.println(hour + ":" + sq + ":" + se);
        } else {
            hour -= 16;
            System.out.println("0" + hour + ":" + sq + ":" + se);
        }
    }

}
