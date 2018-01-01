/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 * @author Apple
 */
public class Dog extends Animal {

    private static final String name = "cat";

    public Dog() {
        this.setCan(new DogCan());
        this.setKeu(new DogKeu());
    }
}
