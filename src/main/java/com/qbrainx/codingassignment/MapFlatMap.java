package com.qbrainx.codingassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {
    public static void main(String[] args) {

        List<List<Integer>> list=Arrays.asList(Arrays.asList(1,5,3),Arrays.asList(6,3,8));
        List<String> strings = Arrays.asList("akas","sans","nivs");

        System.out.println(list.stream().flatMap(Collection::stream).collect(Collectors.toList()));

        System.out.println(list.stream().map(integers -> integers.stream().findAny().get()).collect(Collectors.toList()));



    }

}
