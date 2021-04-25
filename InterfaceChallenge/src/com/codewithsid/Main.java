package com.codewithsid;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
       //write your code here
        MyLinkedList list = new MyLinkedList(null);
        String data = "Chai Coffee Drinks ColdDrinks Blueberry Raspberry CocaCola";
        String[] array = data.split(" ");

        for (String s : array) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
    }
}

