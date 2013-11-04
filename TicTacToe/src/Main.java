
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

            System.out.println("Turn PC");

            pTablero.setPos("x", 0, 0);
            pTablero.setPos("o", 0, 1);
            pTablero.setPos("o", 0, 2);
            
            pTablero.setPos("x", 1, 0);
            pTablero.setPos("o", 1, 1);
            pTablero.setPos("x", 1, 2);
            
            pTablero.setPos("o", 2, 0);
            pTablero.setPos("x", 2, 1);
            pTablero.setPos("x", 2, 2);
            

            pTablero.printTable();
            String pchar;



            //InputStreamReader ir = new InputStreamReader(System.in);
            //BufferedReader in=new BufferedReader(ir);
        
        
        
            
        
            turno++;
            Finalizado = pCerebro.estado(pTablero);
            
            
            if(turno == 5 )
                Finalizado=true;
            
        }
        
        /**
         * Imprime el Resultado Final de la Partida
         */
        System.out.println("Resultado Final");
        pTablero.printTable();
    } 
}
