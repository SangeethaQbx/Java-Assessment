package com.qbrainx.codingassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PosNeg {
    public static void main(String[] args) {
       int a[]= {-3,-4,-1,2,3,-9,0,10};

        List<Integer> list=new ArrayList<>();
        for (int j : a) {
            if (j < 0) {
                list.add(j);
            }
        }
        for (int j : a) {
            if (j >= 0) {
                list.add(j);
            }
        }

        System.out.println(list);
    }
}
