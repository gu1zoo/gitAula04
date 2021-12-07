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
public class Composição {
    public static void main(String[] args) {
        
        //1º Forma
        Automovel uno = new  Automovel();
        Automovel gol = new Automovel(2000);
        
        //2º Forma
        Automovel carro = new Automovel();
        carro.ligarP1();
        carro.ligarP1(2000);
        
        //3º Forma
        Automovel moto = new Automovel();
        Motor motor = new Motor();
        Motor motor2 = new Motor(1600);
        
        
    }
    
}
