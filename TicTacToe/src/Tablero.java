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
    private final String [][] table;
    public Tablero(){
        
        
    }
    public String getPos(int a, int b){
        String actPos = table[a][b];
        return actPos;
    }
    public void setPos(String value, int a, int b){
        table[a][b] = value;
    }
    
    public void printTable(){
        for(int k = 0; k < 3; k++)
            for(int i = 0; i < 3; i++)
                System.out.println(table[k][i]);
    }
}
