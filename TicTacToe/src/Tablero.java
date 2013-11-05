/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo
 */
public class Tablero {
    //dimenciones del table
    private final String [][] _table = {{"-","-","-"}, {"-", "-", "-"}, {"-","-","-"}};
    
    //constructor
    public Tablero(){}
    
    /**
     * 
     * Metodo que devuelve el valor de una celda
     * @param a Fina
     * @param b Columna
     * @return 
     */
    public String getPos(int a, int b){
        String actPos = _table[a][b];
        return actPos;
    }
    
    /**
     * Cambia el valor de una celda
     * @param value Nuevo valor de Celda
     * @param a Fina
     * @param b Columna
     */
    public void setPos(String value, int a, int b){
        _table[a][b] = value;
    }
    
    /**
     * Imprime el todo el tablero Actual
     */
    public void printTable(){
        for(int k = 0; k < 3; k++){
            for(int i = 0; i < 3; i++){
                System.out.print(_table[k][i]);
            }
            System.out.println();
        }
    }
}
