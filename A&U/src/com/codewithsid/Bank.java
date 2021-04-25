package com.codewithsid;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String nameOfBranch) {
        for (int i = 0; i < branches.size(); i++) {
            if (nameOfBranch.equals(branches.get(i).getName())) {
                return this.branches.get(i);
            }
        }
        return null;
    }

    public boolean addBranch(String name) {
        if (findBranch(name)==null) {
            Branch branch = new Branch(name);
            branches.add(branch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer,
                               double initialTransaction) {
        if (findBranch(nameOfBranch) != null) {
            return findBranch(nameOfBranch).newCustomer(nameOfCustomer, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer,
                                          double transaction) {
        if (findBranch(nameOfBranch)==null) {
           return false;
        }
        return findBranch(nameOfBranch).addCustomerTransaction(nameOfCustomer, transaction);
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions){
        Branch branch =findBranch(nameOfBranch);
        if (branch!=null){
            System.out.println("List of "+branch.getName()+" Branch Customers:");
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i =0; i<branchCustomers.size(); i++) {
                System.out.println("Customer:"+"["+(i+1)+"]"+branchCustomers.get(i).getName());
                if (printTransactions){
                    System.out.println("Customer Transaction details of "+branchCustomers.get(i).getName()
                    +" is "+ branchCustomers.get(i).getTransactions());
                }
            }
            return true;
        }
        return false;
    }
}