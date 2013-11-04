
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
