package com.codewithsid;

import java.util.ArrayList;

public class MobilePhone{
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public void printContacts(){
        System.out.println("Contact List: ");
        for (int i = 0; i<myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            System.out.println((i+1) +"."+contact.getName()+" -> "+contact.getPhoneNumber());
        }
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName())>=0){
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){

        for (int i = 0; i<myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if (position<0){
            return false;
        }
        myContacts.set(position, newContact);
        return true;
    }
    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if (position<0){
            return false;
        }

        myContacts.remove(contact);
        return true;
    }
    public Contact queryContact (String name){
        int position = findContact(name);
        if (position>=0){
                return myContacts.get(position);
        }
        else return null;
    }
}
