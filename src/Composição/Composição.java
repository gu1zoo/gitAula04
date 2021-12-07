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
        Automovel gol = new Automovel(2000,"Vermelho");
        
        
        //2º Forma
        Automovel moto = new Automovel();
        moto.ligarP1();
        moto.ligarP1(1600,"Preta");
        
        System.out.println("--------UNO----------");
        uno.imprimeDados();
        
        System.out.println("--------GOL----------");
        gol.imprimeDados();
        
        System.out.println("--------MOTO----------");
        moto.imprimeDados();
    }
    
}
