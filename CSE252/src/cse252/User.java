/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse252;

/**
 *
 * @author yunus
 */
public class User {
     String name;
     String postalCode;
     String phoneNumber;
     String province;
     String city;
     String address;
     String date;
     String creditNo;
     String validationId;

    public User(String name, String postalCode, String phoneNumber, String province, String city, String address, String date, String creditNo) {
        this.name = name;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.province = province;
        this.city = city;
        this.address = address;
        this.date = date;
        this.creditNo = creditNo;
    }
     

    

    @Override
    public String toString() {       
        return "Name: " + name + " Postacode: " + postalCode + " PhoneNumber: " + phoneNumber + " Province: " + province + " City: " + city + 
                "\nAddress: " + address + " Date: " + date + " CreditcardNo: " + creditNo ;
    }
}
