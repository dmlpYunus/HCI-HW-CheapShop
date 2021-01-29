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
public class Product {
     private int number;
     private int cost;
     private static int count=0;

    public Product(int number, int cost) {
        number = count++;
        this.cost = cost;       
    }

    @Override
    public String toString() {
        return "Product ID :" + number + "\ncost :" + cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }
    
    
    
    
}
