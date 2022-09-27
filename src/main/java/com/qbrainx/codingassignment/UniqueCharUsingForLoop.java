package com.qbrainx.codingassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueCharUsingForLoop {
    public static void main(String[] args) {

        String s="kangaroo";
        int count=0;
        List<Character> list=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }if(count==1)
                list.add(s.charAt(i));
            count=0;
        }
        System.out.println(list);

    }
}
