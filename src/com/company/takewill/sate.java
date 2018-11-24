package com.company.takewill;

import com.company.Calculator;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class sate {

    public static final void main(String[] arg) {

        double n = 1100;
        int count = 0;

        while (n != 1){
             if(n%2 == 0 ){
                n = n / 2;

            }else{

                 n = n * 3 + 1;
             }


count ++;


}
        System.out.println(count);
}
    }