package com.codewithsid;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> cities = new LinkedList<>();
        cities.add("cuttack");
        addInOrder("konark", cities);
        addInOrder("bhubaneswar", cities);
        addInOrder("puri", cities);
        addInOrder("khorda", cities);
        addInOrder("rourkela", cities);
        addInOrder("paradip", cities);
        System.out.println(cities);

    }
    private static boolean addInOrder(String newCity, LinkedList<String> linkedList){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
                //same duplicate
                return false;
            }
            else if (comparison > 0){
                //change B -> A
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return false;
    }

    public static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            return;
        }

    }

}
