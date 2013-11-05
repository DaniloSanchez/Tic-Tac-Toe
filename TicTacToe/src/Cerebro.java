import java.io.*;
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
            Table =nMovimiento(Table,turno);
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
        return  Table;
    }
    
    /**
     * Es el Enesimo movimiento de la PC
     * @param Table
     * @return El tablero despues del movimiento hecho por la PC
     */
    private Tablero nMovimiento(Tablero Table,int Turno){
        switch(Turno){
            case 1:
                /*juego en equina*/
                {
                    int i=0;
                    for(; i < 4 ; i++){
                        if(Table.getPos(0, 0).equals("X")){
                            if(Table.getPos(0, 1).equals("O")){
                                Table.setPos("X", 2, 0);
                                break;
                            }
                            if(Table.getPos(2, 1).equals("O")){
                                Table.setPos("X", 2, 0);
                                break;
                            }

                            if(Table.getPos(1, 0).equals("O")){
                                Table.setPos("X", 0, 2);
                                break;
                            }
                            if(Table.getPos(1, 2).equals("O")){
                                Table.setPos("X", 0, 2);
                                break;
                            }

                            if(Table.getPos(0, 2).equals("O")){
                                Table.setPos("X", 2, 0);
                                break;
                            }
                            if(Table.getPos(2, 0).equals("O")){
                                Table.setPos("X", 0, 2);
                                break;
                            }
                            if(Table.getPos(2, 2).equals("O")){
                                Table.setPos("X", 2, 0);
                                break;
                            }

                            if(Table.getPos(1, 1).equals("O")){
                                Table.setPos("X", 2, 2);
                                break;
                            }

                        }
                        Table.GirarDerecha();
                    }
                    if(i==1)
                        Table.GirarIzquierda();
                    else if(i==2){
                        Table.GirarIzquierda();
                        Table.GirarIzquierda();
                    }else if(i==3){
                        Table.GirarDerecha();
                    }
                }
                {
                    /*juego en lateral*/
                    int i=0;
                    for(; i < 4 ; i++){
                        if(Table.getPos(0, 1).equals("X")){
                            if(Table.getPos(2, 0).equals("O")){
                                Table.setPos("X", 0, 0);
                                break;
                            }
                            
                            if(Table.getPos(2, 2).equals("O")){
                                Table.setPos("X", 0, 2);
                                break;
                            }

                            if(Table.getPos(2, 1).equals("O")){
                                Table.setPos("X", 1, 1);
                                break;
                            }
                            if(Table.getPos(1, 0).equals("O")){
                                Table.setPos("X", 0, 0);
                                break;
                            }

                            if(Table.getPos(1, 2).equals("O")){
                                Table.setPos("X", 0, 2);
                                break;
                            }
                            
                            if(Table.getPos(0, 2).equals("O")){
                                Table.setPos("X", 2, 1);
                                break;
                            }
                            if(Table.getPos(0, 0).equals("O")){
                                Table.setPos("X", 2, 1);
                                break;
                            }

                            if(Table.getPos(1, 1).equals("O")){
                                Table.setPos("X", 2, 1);
                                break;
                            }

                        }
                        Table.GirarDerecha();
                    }
                    if(i==1)
                        Table.GirarIzquierda();
                    else if(i==2){
                        Table.GirarIzquierda();
                        Table.GirarIzquierda();
                    }else if(i==3){
                        Table.GirarDerecha();
                    }
                }   
                break;
            case 2:
                {
                    int i=0;
                    for(;i<3;i++){
                        

                        int nX =0;
                        if(Table.getPos(0, 0).equals("X")&&Table.getPos(0, 2).equals("X")){
                            if(Table.getPos(0, 1).equals("-")){
                                Table.setPos("X", 0, 1);
                                break;
                            }
                            else{
                                if(Table.getPos(0, 1).equals("-")){
                                    Table.setPos("X", 1, 1);
                                    break;
                                }
                            }
                        }
                        if(Table.getPos(0, 0).equals("X")&&Table.getPos(2, 0).equals("X")){
                            if(Table.getPos(1, 0).equals("-")){
                                Table.setPos("X", 1, 0);
                                break;
                            }else{
                                if(Table.getPos(1, 1).equals("-")){
                                    Table.setPos("X", 1, 1);
                                    break;
                                }
                            }
                            break;
                        }
                        if(Table.getPos(0, 0).equals("X")&&Table.getPos(2, 2).equals("X")){
                            if(Table.getPos(1, 0).equals("O")){
                                Table.setPos("X", 1, 2);
                                break;
                            }else{
                                if(Table.getPos(1, 2).equals("O")){
                                    Table.setPos("X", 1, 0);
                                    break;
                                }
                            }
                            if(Table.getPos(0, 1).equals("O")){
                                Table.setPos("X", 2, 1);
                                break;
                            }else{
                                if(Table.getPos(2, 1).equals("O")){
                                    Table.setPos("X", 0, 1);
                                    break;
                                }
                            }
                            
                        }
                        Table.GirarDerecha();
                    }
                    if(i==1)
                        Table.GirarIzquierda();
                    if(i==2){
                        Table.GirarIzquierda();
                        Table.GirarIzquierda();
                    }
                    if(i==3){
                        Table.GirarDerecha();
                    }
                    
                }
                break;
            case 3:
                {
                    
                    /*primera finla*/
                    for(int i = 0; i < 3; i++)
                        if(Table.getPos(i, 0).equals("-")){
                            if(Table.getPos(i,1).equals("X")&&Table.getPos(i,2).equals("X")){
                                Table.setPos("X", i, 0);
                                break;
                            }
                        }
                    /*segunda fila*/
                    for(int i = 0; i < 3; i++)
                        if(Table.getPos(i, 1).equals("-")){
                            if(Table.getPos(i,0).equals("X")&&Table.getPos(i,2).equals("X")){
                                Table.setPos("X", i, 1);
                                break;
                            }
                        }
                    /*tercera fila*/
                    for(int i = 0; i < 3; i++)
                        if(Table.getPos(i, 2).equals("-")){
                            if(Table.getPos(i,0).equals("X")&&Table.getPos(i,1).equals("X")){
                                Table.setPos("X", i, 2);
                                break;
                            }
                        }
                    
                    /*primera columa*/
                    for(int i = 0; i < 3; i++)
                        if(Table.getPos(0, i).equals("-")){
                            if(Table.getPos(1,i).equals("X")&&Table.getPos(2,i).equals("X")){
                                Table.setPos("X", 0, i);
                                break;
                            }
                        }
                    /*segunda columa*/
                    for(int i = 0; i < 3; i++)
                        if(Table.getPos(1, i).equals("-")){
                            if(Table.getPos(0,i).equals("X")&&Table.getPos(2,i).equals("X")){
                                Table.setPos("X", 1, i);
                                break;
                            }
                        }
                    /*tercera columa*/
                    for(int i = 0; i < 3; i++)
                        if(Table.getPos(2, i).equals("-")){
                            if(Table.getPos(0,i).equals("X")&&Table.getPos(1,i).equals("X")){
                                Table.setPos("X", 2, i);
                                break;
                            }
                        }
                    /*diagonal columa*/
                    if(Table.getPos(0, 0).equals("-")){
                        if(Table.getPos(1,1).equals("X")&&Table.getPos(2,2).equals("X")){
                            Table.setPos("X", 0, 0);
                            break;
                        }
                    }
                    if(Table.getPos(1, 1).equals("-")){
                        if(Table.getPos(0,0).equals("X")&&Table.getPos(2,2).equals("X")){
                            Table.setPos("X", 1, 1);
                            break;
                        }
                    }
                    if(Table.getPos(2, 2).equals("-")){
                        if(Table.getPos(0,0).equals("X")&&Table.getPos(1,1).equals("X")){
                            Table.setPos("X", 2, 2);
                            break;
                        }
                    }
                    /*diagonal inversa*/
                    if(Table.getPos(0, 2).equals("-")){
                        if(Table.getPos(1,1).equals("X")&&Table.getPos(2,0).equals("X")){
                            Table.setPos("X", 0, 2);
                            break;
                        }
                    }
                    if(Table.getPos(1, 1).equals("-")){
                        if(Table.getPos(0,2).equals("X")&&Table.getPos(2,0).equals("X")){
                            Table.setPos("X", 1, 1);
                            break;
                        }
                    }
                    if(Table.getPos(2, 0).equals("-")){
                        if(Table.getPos(1,1).equals("X")&&Table.getPos(0,2).equals("X")){
                            Table.setPos("X", 2, 0);
                            break;
                        }
                    }
                    /*En defensa*/
                    /*primera finla*/
                    for(int i = 0; i < 3; i++)
                        if(Table.getPos(i, 0).equals("-")){
                            if(Table.getPos(i,1).equals("O")&&Table.getPos(i,2).equals("O")){
                                Table.setPos("X", i, 0);
                                break;
                            }
                        }
                    /*segunda fila*/
                    for(int i = 0; i < 3; i++)
                        if(Table.getPos(i, 1).equals("-")){
                            if(Table.getPos(i,0).equals("O")&&Table.getPos(i,2).equals("O")){
                                Table.setPos("X", i, 1);
                                break;
                            }
                        }
                    /*tercera fila*/
                    for(int i = 0; i < 3; i++)
                        if(Table.getPos(i, 2).equals("-")){
                            if(Table.getPos(i,0).equals("O")&&Table.getPos(i,1).equals("O")){
                                Table.setPos("X", i, 2);
                                break;
                            }
                        }
                    
                    /*primera columa*/
                    for(int i = 0; i < 3; i++)
                        if(Table.getPos(0, i).equals("-")){
                            if(Table.getPos(1,i).equals("O")&&Table.getPos(2,i).equals("O")){
                                Table.setPos("X", 0, i);
                                break;
                            }
                        }
                    /*segunda columa*/
                    for(int i = 0; i < 3; i++)
                        if(Table.getPos(1, i).equals("-")){
                            if(Table.getPos(0,i).equals("O")&&Table.getPos(2,i).equals("O")){
                                Table.setPos("X", 1, i);
                                break;
                            }
                        }
                    /*tercera columa*/
                    for(int i = 0; i < 3; i++)
                        if(Table.getPos(2, i).equals("-")){
                            if(Table.getPos(0,i).equals("O")&&Table.getPos(1,i).equals("O")){
                                Table.setPos("X", 2, i);
                                break;
                            }
                        }
                    /*diagonal columa*/
                    if(Table.getPos(0, 0).equals("-")){
                        if(Table.getPos(1,1).equals("O")&&Table.getPos(2,2).equals("O")){
                            Table.setPos("X", 0, 0);
                            break;
                        }
                    }
                    if(Table.getPos(1, 1).equals("-")){
                        if(Table.getPos(0,0).equals("O")&&Table.getPos(2,2).equals("O")){
                            Table.setPos("X", 1, 1);
                            break;
                        }
                    }
                    if(Table.getPos(2, 2).equals("-")){
                        if(Table.getPos(0,0).equals("O")&&Table.getPos(1,1).equals("O")){
                            Table.setPos("X", 2, 2);
                            break;
                        }
                    }
                    /*diagonal inversa*/
                    if(Table.getPos(0, 2).equals("-")){
                        if(Table.getPos(1,1).equals("O")&&Table.getPos(2,0).equals("O")){
                            Table.setPos("X", 0, 2);
                            break;
                        }
                    }
                    if(Table.getPos(1, 1).equals("-")){
                        if(Table.getPos(0,2).equals("O")&&Table.getPos(2,0).equals("O")){
                            Table.setPos("X", 1, 1);
                            break;
                        }
                    }
                    if(Table.getPos(2, 0).equals("-")){
                        if(Table.getPos(1,1).equals("O")&&Table.getPos(0,2).equals("O")){
                            Table.setPos("X", 2, 0);
                            break;
                        }
                    }
                    
                    
                }
            default:
               for(int i = 0; i < 3 ; i++)
                   for(int k = 0; k < 3; k++)
                        if(Table.getPos(i, k).equals("-")){
                            Table.setPos("X", i, k);
                            break;
                        }  
        }
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
