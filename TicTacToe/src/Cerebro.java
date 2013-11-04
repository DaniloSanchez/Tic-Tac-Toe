/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo
 */
public class Cerebro {

    
    public Cerebro() {}
    
    
    public boolean estado(Tablero tablero){
        boolean fila = fila(tablero);
        boolean columana = columna(tablero);
        boolean diagonal = diagonal(tablero);
        
        if(fila==true)
            return true;
        if( columana == true )
            return true;
        if (diagonal == true)
            return true;
        else
            return false;
    }
    
    
    /**
     * Verifica las filas, devuelve True si hay una fila completa
     * @param tablero
     * @return 
     */
    private boolean fila(Tablero tablero){
        boolean match = false;
        for(int fila = 0 ; fila < 3 ; fila++)
            if(tablero.getPos(fila, 0).equals(tablero.getPos(fila, 1)))
                if (tablero.getPos(fila, 1).equals(tablero.getPos(fila, 2)))
                    match =  true;
        return match;
    }
    
    /**
     * Verifica las columnas, devuelve True si hay una columna completa
     * @param tablero
     * @return 
     */
    private boolean columna(Tablero tablero){
        boolean match = false;
        for(int columna = 0 ; columna < 3 ; columna++)
            if(tablero.getPos(0, columna).equals(tablero.getPos(1, columna)))
                if (tablero.getPos(1, columna).equals(tablero.getPos(2, columna)))
                    match =  true;
        return match;
    }
    
    /**
     * Verifica las diagonles, devuelve True si hay una diagonal completa
     * @param tablero
     * @return 
     */
    private boolean diagonal (Tablero tablero){
        boolean match = false;        
        
        if(tablero.getPos(0, 0).equals(tablero.getPos(1, 1)))
                if (tablero.getPos(1, 1).equals(tablero.getPos(2, 2)))
                match =  true;
        
        if(tablero.getPos(0, 2).equals(tablero.getPos(1, 1)))
            if (tablero.getPos(1, 1).equals(tablero.getPos(2, 0)))
                match =  true;
        
        return match;
    }
    
    
    
}
