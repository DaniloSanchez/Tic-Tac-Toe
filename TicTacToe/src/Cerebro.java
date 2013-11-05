
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
    private InputStreamReader _ir;
    private BufferedReader _in;
    private String _dato;    
    
    public Cerebro() {}
    
    
    /**
     * Movimiento Inteligente de la PC
     * @param Table Estado actual del tablero.
     * @param turno Turno Actual de Juego
     * @return 
     */
    public Tablero turnoPC(Tablero Table,int turno){
        if(turno==0)
            Table = PrimerMovimiento(Table);
        else
            Table =nMovimiento(Table);
        return Table;
        
    }
    
    
    /**
     * El primer Movimiento es random pero, debe de ser diferente al centro.
     * @param Table
     * @return Tablero despues del primer Movimiento
     */
    private Tablero PrimerMovimiento(Tablero Table){
        int pfila = ((int)(Math.random()*100)%3);
        int pColumna = ((int)(Math.random()*100)%3);
        
        while(pfila == 1 && pColumna ==1){
            pfila = ((int)(Math.random()*100)%3);
            pColumna = ((int)(Math.random()*100)%3);
        }
        
        Table.setPos("X", pfila, pColumna);
        
        
        System.out.println(pfila);
        System.out.println(pColumna);
                
        return  Table;
    }
    
    private Tablero nMovimiento(Tablero Table){
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
        _ir = new InputStreamReader(System.in);
        _in=new BufferedReader(_ir);
        try{
            _dato = _in.readLine();
            int idato = Integer.parseInt(_dato);
            return idato;
        }catch (Exception ex){
            return -1;
        }
    }
}
