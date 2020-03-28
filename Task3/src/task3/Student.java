/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author 19301261
 */
public class Student {

    String name = "Ei name e kono student nai";
    String ID = "Student ei nai, abar id :P";
    String address = "Naam nai .. thikana ashbe koi theke?";
    double cgpa = -4.0;

    public Student() {

    }

    public String nameDao() {
        return name;
    }

    public String boloToAmiKe() {
        return ID;
    }

    public String addressDao() {
        return address;
    }

    public double cgpaDao() {
        return cgpa;
    }

    public void nameBoshao(String n) {
        this.name = n;
    }

    public void addressBoshao(String a) {
        this.address = a;
    }

    public void idBoshao(String i) {
        this.ID = i;
    }

    public void cgpaBoshao(double c) {
        this.cgpa = c;
    }

    public Student(String n, String i, String a, double c) {
        this.name = n;
        this.ID = i;
        this.address = a;
        this.cgpa = c;
    }

    public void standUp() {
        System.out.println(this.name + " is now standing up!!");
    }

    public String tellMeYourName() {
        String a = "Sir, my name is " + this.name;
        return a;
    }

    public void call(String n) {

        System.out.println(this.name + ":" + " Hey," + n + " , Sir is calling you!!");
    }

    public int add2Numbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

}
