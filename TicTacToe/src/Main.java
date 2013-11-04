/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo
 */

public class Main {
    public static void main (String[] args){
        Tablero pTablero = new Tablero();
        
        pTablero.setPos("x", 0, 0);
        pTablero.setPos("o", 0, 1);
        pTablero.setPos("x", 0, 2);
        pTablero.setPos("o", 1, 0);
        pTablero.setPos("x", 1, 1);
        pTablero.setPos("x", 1, 2);
        pTablero.setPos("o", 2, 0);
        pTablero.setPos("x", 2, 1);
        pTablero.setPos("o", 2, 2);
        
                
        pTablero.printTable();
        
        
    } 
}
