/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singtelapplication;


public class Chicken implements Animals {

 

    @Override
    public void quack() {
        System.out.println("Cluck, cluck!");
    }
    @Override
    public void swim() {
        System.out.println("Swaim!");
    }
    @Override
    public void fly() 
    {
        System.out.println("fly");
    }
    
    @Override
    public void walk() {
        System.out.println("walk");
    }
    
    @Override
    public void sing() {
        System.out.println("sing");
    }
}