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
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1;
        s1 = new Student();
        System.out.println(s1);
        System.out.println(s1.nameDao());
        System.out.println(s1.boloToAmiKe());
        System.out.println(s1.addressDao());
        System.out.println(s1.cgpaDao());
        s1.nameBoshao("Tonmoy Dewanjee");
        s1.addressBoshao("Mirpur");
        s1.idBoshao("16301157");
        s1.cgpaBoshao(4.0);
        System.out.println(s1.nameDao());
        System.out.println(s1.boloToAmiKe());
        System.out.println(s1.addressDao());
        System.out.println(s1.cgpaDao());
        Student s2 = new Student("Azibun Nuder", "16301045", "Uttara", 4.0);
        System.out.println(s2);
        System.out.println(s2.nameDao());
        System.out.println(s2.boloToAmiKe());
        System.out.println(s2.addressDao());
        System.out.println(s2.cgpaDao());
        Student s3 = new Student();
        System.out.println(s3);
        System.out.println(s3.nameDao());
        System.out.println(s3.boloToAmiKe());
        System.out.println(s3.addressDao());
        System.out.println(s3.cgpaDao());
        s1.standUp();
        s2.standUp();
        System.out.println(s1.tellMeYourName());
        System.out.println(s2.tellMeYourName());
        s1.call("Sumit Dutta");
        s2.call("Ananya Ritu");
        System.out.println(s1.add2Numbers(2, 3));

    }

}
