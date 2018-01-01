/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 * @author Apple
 */
public abstract class Animal {

    private Can can;
    private Keu keu;

    Animal() {
    }



    public Can getCan() {
        return can;
    }

    public void setCan(Can can) {
        this.can = can;
    }

    public Keu getKeu() {
        return keu;
    }

    public void setKeu(Keu keu) {
        this.keu = keu;
    }

    public void can() {
        can.doCan();
    }

    public void keu() {
        keu.doKeu();
    }
}
