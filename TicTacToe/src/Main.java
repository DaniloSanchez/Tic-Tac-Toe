
import java.io.*;

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
        Cerebro pCerebro = new Cerebro();
        int turno = 0;
        boolean Finalizado = false;
        
        
        
        
        
        System.out.println("PC: X");
        System.out.println("Human: O");
        
                
        while( turno < 9 && !Finalizado){
            
            //=========================//
            System.out.println("Turno PC");
            pTablero = pCerebro.turnoPC(pTablero);
            pTablero.printTable();
            
            
            //========================//
            System.out.println("Turno Humano");
            System.out.println("Digite la Fila: 0 o 1 o 2 ");
            int pfila = pCerebro.leerDato();
            System.out.println("Digite la Columna: 0 o 1 o 2 ");
            int pColumna = pCerebro.leerDato();
            pTablero.setPos("O", pfila, pColumna);    
            pTablero.printTable();
            
            
            
            
            
            

            
            
            
            
        
        
        
            
        
            turno++;
            Finalizado = pCerebro.estado(pTablero);
        }
        
        /**
         * Imprime el Resultado Final de la Partida
         */
        System.out.println("Resultado Final");
        pTablero.printTable();
    } 
}
