package com.qbrainx.codingassignment;

public class Fibannoci {

    public static void main(String[] args) {

        int num=10,n1=0,n2=1,n3=0;
        System.out.print(n1+" "+n2);
        while (num!=0){

            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            num--;
        }


    }
}
