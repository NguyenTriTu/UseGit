/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 * @author Apple
 */
public class Cat extends Animal {

    private static final String name = "cat";

    public Cat() {
        this.setCan(new CatCan());
        this.setKeu(new CatKeu());
    }
}
