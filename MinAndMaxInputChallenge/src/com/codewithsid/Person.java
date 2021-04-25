package com.codewithsid;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){

        if (age<0 || age>100){
            return 0;
        }
        return age;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(java.lang.String secondName) {
        this.lastName = secondName;
    }

    public void setAge(int newAge){
        this.age= newAge;
    }
    public boolean isTeen (){
        return age < 20 && age > 12;
    }
    public String getFullName(){
        if (firstName.isEmpty()){
            return lastName;
        }
        else if (lastName.isEmpty()){
            return firstName;
        }
        else if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        return firstName +" "+ lastName;
    }
}
