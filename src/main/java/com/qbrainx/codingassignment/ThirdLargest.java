package com.qbrainx.codingassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdLargest {
    public static void main(String[] args) {

        int first=0,sec=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
        Integer a[]={3,5,1,7,8,12,9,34};
        List<Integer> list=Arrays.asList(a);


        Integer integer = list.stream().sorted((integer1, t1) -> t1-integer1).collect(Collectors.toList()).get(2);
        System.out.println(integer);


        first=a[0];
        for(int i=1;i<a.length;i++){

                if(a[i]>first){
                    third=sec;
                    sec=first;
                    first=a[i];

                } else if (a[i]>sec) {
                    third=sec;
                    sec=a[i];

                }else if(a[i]>third){
                    third=a[i];
                }

        }
        System.out.println(third);

    }
}
