package pro.ski.basikAlgoritmInteger.service;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntegerList integerList = new IntegerListImpl();
        System.out.println(integerList.add(23));
        System.out.println(integerList.get(0));
        System.out.println(integerList.add(71));
        System.out.println(integerList.get(1));
        System.out.println(integerList.contains(71));
        System.out.println(integerList.remove(0));
        System.out.println(integerList.contains(23));
        System.out.println(integerList.get(0));
        System.out.println(integerList.add(58));
        System.out.println(integerList.indexOf(58));
        System.out.println(integerList.lastIndexOf(58));
        System.out.println(integerList.indexOf(71));
        System.out.println(integerList.set(1, 69));
        System.out.println(integerList.contains(69));
        System.out.println(Arrays.toString(integerList.toArray()));
        System.out.println(integerList.remove(1));
        System.out.println(integerList.contains(23));
        System.out.println(integerList.get(1));
        System.out.println(integerList.add(0, 88));
        System.out.println(Arrays.toString(integerList.toArray()));
        IntegerList integerList2 = new IntegerListImpl();
        integerList2.add((88));
        integerList2.add((71));
        System.out.println(integerList.equals(integerList2));
        integerList.clear();
        System.out.println(integerList.get(0));
    }
}