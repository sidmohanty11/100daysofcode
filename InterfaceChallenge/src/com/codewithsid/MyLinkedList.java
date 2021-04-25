package com.codewithsid;

public class MyLinkedList implements NodeList{
    private ListItem root = null;
    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null){
            //the list is empty and this is the head
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if (comparison==0){
                //both are equal items
                System.out.println(newItem.getValue()+"is already present");
                return false;
            }
            else if (comparison<0){
                //newItem is greater. move right (newItem = b, currentItem = a)
                if (currentItem.next() != null){
                    //there is something on right
                    currentItem = currentItem.next();
                }else {
                    //there is nothing on right
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            }else {
                //newItem is smaller. move left (newItem = a, currentItem = b)
                if (currentItem.previous() != null){
                    //there is something on left
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setPrevious(currentItem);
                    currentItem.setNext(newItem);
                }
                else {
                    //there is nothing on left, it can be the root
                    currentItem.setPrevious(newItem);
                    newItem.setNext(currentItem);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null){
            System.out.println("nothing found");
        }
        else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
