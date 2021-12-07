/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composição;

/**
 *
 * @author IFSC
 */
public class Automovel {
    private Motor motor;
    private Direcao direcao;
   
   
   public Automovel(){
       motor = new Motor();
   }
   public Automovel(int potencia){
       motor = new Motor(potencia);
   }
  
   public void ligarP1(){
       motor = new Motor();
   }
   public void ligarP1(int potencia){
       motor = new Motor(potencia);
   }
    
}
