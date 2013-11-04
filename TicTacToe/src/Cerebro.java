
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
public class Cerebro {
    private InputStreamReader ir;
    private BufferedReader in;
    private String dato;    
    
    public Cerebro() {}
    
    
    public Tablero turnoPC(Tablero Table){
        return Table;
    }
    
    /**
     * Revisa el Estado del Table para saber si hay un ganador
     * @param tablero
     * @return 
     */
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
                    if(!tablero.getPos(fila, 2).equals("-")) 
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
                    if(!tablero.getPos(2, columna).equals("-")) 
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
                if(!tablero.getPos(2, 2).equals("-")) 
                    match =  true;
        
        if(tablero.getPos(0, 2).equals(tablero.getPos(1, 1)))
            if (tablero.getPos(1, 1).equals(tablero.getPos(2, 0)))
                if(!tablero.getPos(2, 0).equals("-")) 
                    match =  true;
        
        return match;
    } 
    
    /**
     * Lee el dato de teclado, retorna el valor como un entero.
     * @return 
     */
    public int leerDato(){
        ir = new InputStreamReader(System.in);
        in=new BufferedReader(ir);
        try{
            dato = in.readLine();
            int idato = Integer.parseInt(dato);
            return idato;
        }catch (Exception ex){
            return -1;
        }
    }
}
