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
        Animal bulldog = new Dog();
        Animal tom = new Cat();
        bulldog.can();
        bulldog.keu();
        tom.can();
        tom.keu();

        Animal toyDog = new Dog();
        toyDog.setCan(new CatCan());
        toyDog.can();
        toyDog.keu();
    }

}
