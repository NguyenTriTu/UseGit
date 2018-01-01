/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Apple
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        st1.setId(123);
        st1.setName("A");
        st2.setId(321);
        st2.setName("B");
        st3.setId(123);
        st3.setName("B");
        System.out.println("Name: "+st1.getName()+" Id: "+st1.getId());
        System.out.println("Name: "+st2.getName()+" Id: "+st2.getId());
        System.out.println("Name: "+st3.getName()+" Id: "+st3.getId());
    }
    
}
