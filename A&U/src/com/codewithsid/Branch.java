package com.codewithsid;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction){
            if (findCustomer(nameOfCustomer) == null) {
                Customer newCustomer = new Customer(nameOfCustomer,initialTransaction);
                customers.add(newCustomer);
                return true;
            }
            return false;
        }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction){
        if (findCustomer(nameOfCustomer) == null) {
            return false;
        }
        findCustomer(nameOfCustomer).addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String nameOfCustomer){
        for (int i =0; i<customers.size();i++) {
            if (nameOfCustomer.equals(customers.get(i).getName())){
                return this.customers.get(i);
            }
        }
        return null;
    }
}
