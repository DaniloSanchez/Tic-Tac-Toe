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
        
        while( turno < 5 && !Finalizado){
            //=========================//
            System.out.println("Turno PC");
            pTablero = pCerebro.turnoPC(pTablero,turno);
            pTablero.printTable();
            //========================//
            if(turno == 4)
                break;
            Finalizado = pCerebro.estado(pTablero);
            if(Finalizado==true)
                break;
            System.out.println("Turno Humano");
            System.out.println("Digite la Fila: 0 o 1 o 2 ");
            int pfila = pCerebro.leerDato();
            System.out.println("Digite la Columna: 0 o 1 o 2 ");
            int pColumna = pCerebro.leerDato();
            pTablero.setPos("O", pfila, pColumna);    
            pTablero.printTable();
            //=======================================/
            /**
             * Actualiza el contador del turno 
             * Verifica si existe un ganado con el tablero actual
             */
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
