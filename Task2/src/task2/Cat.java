/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author 19301261
 */
public class Cat {

    public String color = "White";
    public String action = "Sitting";

    public Cat() {

    }

    public Cat(String c) {
        this.color = c;
    }

    public Cat(String c, String a) {
        this.color = c;
        this.action = a;
    }

    public void changeColor(String c) {
        this.color = c;
    }

    public void printCat() {
        String a = this.color + " cat is " + this.action;
        System.out.println(a);
    }
}
