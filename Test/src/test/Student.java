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
public class Student {

    private String name;
    private String skill;

    public void setName(String setName) {
        name = setName;
        System.out.println(name);
    }

    public void def(int dame) {
        skill = "skill " + dame;
        System.out.println(skill);
    }
}
