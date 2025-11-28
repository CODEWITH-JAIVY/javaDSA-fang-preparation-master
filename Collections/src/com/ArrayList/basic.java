package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class basic {


    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>() ;
        List<Integer>list1 = new ArrayList<>() ;
//        System.out.println(list.size());
         list1.add(50) ;
         list1.add(60) ;
        list1.add(50) ;
        list1.add(60) ;
        list1.add(70) ;
        list1.add(80) ;
        list1.add(90) ;
        list1.add(6100) ;
        list1.add(50) ;
        list1.add(60) ;
        list1.remove(6) ;
        list1.remove(Integer.valueOf(6100)) ;
        final List<String> list2 = Arrays.asList("Apple ", "Banana", "gava");

        System.out.println(list1);
        String [] arr =   { "banan" , "Apple" , "mango"} ;
        List<String>list3 = Arrays.asList(arr) ;
        Integer[] arr2  = { 1,2,3,4,5,6,7,8 } ;
        List<Integer>list12 = Arrays.asList(arr2) ;
         Object[] array = list12.toArray();
        System.out.println(array);
        System.out.println(list12);



  /*
        System.out.println(list.addAll(list1));
        for (int x : list ){
            System.out.print(x + " ");
        }
        System.out.println(list.contains(50));


        System.out.println(list1);
        System.out.println(list1.contains(20));
        */

    }

}
