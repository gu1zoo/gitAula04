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
       direcao = new Direcao();
   }
   public Automovel(int potencia, String cor){
       motor = new Motor(potencia);
       direcao = new Direcao(cor);
   }
  
   public void ligarP1(){
       motor = new Motor();
       direcao = new Direcao();
   }
   public void ligarP1(int potencia, String cor){
       motor = new Motor(potencia);
       direcao = new Direcao(cor);
   }
   
   public void imprimeDados(){
       System.out.println(motor.potencia);
       System.out.println(direcao.cor);
   }
}
