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
        st1.setName("DaiCa");
        st1.def(100);
        st1.setName("QuaCa");
        st1.def(50);
        st1.setName("DaiCa");
        st1.def(50);
        
    }
    
}
