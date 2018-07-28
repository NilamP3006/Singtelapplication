/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singtelapplication;

/**
 *
 * @author Nilam
 */

//Model Rooster without Chicken//
public class Rooster {
    
     Chicken chicken;
 
  Rooster(Chicken chicken) {
    this.chicken = chicken;
  }
 
  void playLive() {
    chicken.quack();
    System.out.println("Cock-a-doodle-doo");
  }
    
}
