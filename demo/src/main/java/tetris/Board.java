package tetris;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board extends PieceBase{



    public char[][] Boardtetris = {
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
    };
    
    // Especificar la posición de inicio en la matriz grande donde deseas agregar TT1
    int filaInicio;       // Fila de inicio en la matriz grande
    int columnaInicio;    // Columna de inicio en la matriz grande
    char[][] matrizActual; // Matriz pequeña actual
    int rowsDeleted = 0; // Contador de filas eliminadas
    Random random;
    char[][] inputMatrix;
    int lose = 0;
    int rows = 10;
    int cols = 20;

    public char[][] confirm(){
        return Boardtetris;
    }

    public void checkAndPrintGameWon() {
        if (lastFiveRowsAreFull()) {
            System.out.println("¡Has ganado el juego!");
        }
    }
    
    public char[][] fillLastFiveRowsWithOnes() {
        int numRows = Boardtetris.length;
        int numCols = Boardtetris[0].length;
    
        // Llena las últimas 5 filas con "1"
        for (int i = numRows - 5; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                Boardtetris[i][j] = '1';
            }
        }
    
        // Retorna la matriz actualizada
        return Boardtetris;
    }
    public boolean lastFiveRowsAreFull() {
        int numRows = Boardtetris.length;
        int numCols = Boardtetris[0].length;
    
        // Verifica si las últimas 5 filas están llenas de "1"
        for (int i = numRows - 5; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (Boardtetris[i][j] != '1') {
                    return false; // Al menos una celda no es "1", las filas no están llenas
                }
            }
        }
    
        return true; // Todas las celdas son "1", las filas están llenas
    }
    public char[][] fillFirstColumnWithOnes() {
        int numRows = Boardtetris.length;
    
        // Llena la primera columna con "1"
        for (int i = 0; i < numRows; i++) {
            Boardtetris[i][0] = '1';
        }
    
        // Retorna la matriz actualizada
        return Boardtetris;
    }
    
    public boolean checkIfGameLost() {
        int numRows = Boardtetris.length;
        int numCols = Boardtetris[0].length;
        // Recorre cada columna
        for (int j = 0; j < numCols; j++) {
            boolean columnaLlena = true; // Suponemos que la columna está llena de "1"
            for (int i = 0; i < numRows; i++) {
                if (Boardtetris[i][j] != '1') {
                    columnaLlena = false; // Si encontramos un elemento diferente de "1", la columna no está llena
                    break;
                }
            }
            if (columnaLlena) {
                return true; // Si encontramos una columna llena de "1", el juego se ha perdido
            }
        }
    
        return false; // El juego no se ha perdido
    }
    
    
    public void tick() {
        if (sePuedeMover() && lose == 0 && rowsDeleted != 5) {        //Funcion booleana que verifica si la pieza puede seguir bajando
            checkAndClearRows();

        } else {

            if (lose == 0 && rowsDeleted != 5){
                agregarMatriz(filaInicio, columnaInicio, inputMatrix);
            }

        
            // Verificar si el juego ha terminado (no se puede colocar una nueva pieza)
            if (!sePuedeMover()) {
                // final del juego,mensaje de game over.
                System.out.println("GAME OVER");
                lose = 1;
            } 
            }
         }

         public boolean sePuedeMover() {
            char[][] ola = agregarMatriz(filaInicio, columnaInicio, Boardtetris);
            char[][] chau = moverMatrizAbajoSiEsPosible(inputMatrix);
        
            // Verifica si las matrices son iguales
            if (areMatricesEqual(ola, chau)) {
                return false; // Si son iguales, retorna false
            } else {
                return true; // Si no son iguales, retorna true
            }
        }
        
        // Función para verificar si dos matrices son iguales
        private boolean areMatricesEqual(char[][] matriz1, char[][] matriz2) {
            if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
                return false; // Las dimensiones no son iguales, las matrices son diferentes
            }
        
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    if (matriz1[i][j] != matriz2[i][j]) {
                        return false; // Se encontró un elemento diferente, las matrices son diferentes
                    }
                }
            }
        
            return true; // Las matrices son iguales
        }


    public char[][] agregarMatriz(int filaInicio, int columnaInicio, char[][] matrizPequena) {
        int filas = matrizPequena.length;
        int columnas = matrizPequena[0].length;

        // Verificar si las coordenadas son válidas
        if (filaInicio >= 0 && filaInicio + filas <= Boardtetris.length &&
            columnaInicio >= 0 && columnaInicio + columnas <= Boardtetris[0].length) {
            // Copiar la matriz pequeña en la matriz Board
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    Boardtetris[filaInicio + i][columnaInicio + j] = matrizPequena[i][j];
                }
            }
            this.filaInicio = filaInicio;
            this.columnaInicio = columnaInicio;
            this.matrizActual = matrizPequena;
        }

        return Boardtetris; // Retorna la matriz Board actualizada
    }

    public char[][] moverMatrizAbajoSiEsPosible(char[][] matrizPequena) {
        
        int filas = matrizPequena.length;
        int columnas = matrizPequena[0].length;

        if (filaInicio + filas < Boardtetris.length) {
            boolean filaAbajoVacia = true;
            for (int j = 0; j < columnas; j++) {
                if (Boardtetris[filaInicio + filas][columnaInicio + j] != '0') {
                    filaAbajoVacia = false;
                    break;
                }
            }

            // Si la fila de abajo está llena de ceros, mover la matriz pequeña hacia abajo
            if (filaAbajoVacia) {
                for (int i = filas - 1; i >= 0; i--) {
                    for (int j = 0; j < columnas; j++) {
                        Boardtetris[filaInicio + i + 1][columnaInicio + j] = matrizPequena[i][j];
                        Boardtetris[filaInicio + i][columnaInicio + j] = '0';
                    }
                }

                filaInicio++; // Actualiza la fila de inicio
            }
        }

        return Boardtetris; // Retorna la matriz Board actualizada
    }
    public  char[][] eliminarFilasYColumnasDeCeros(char[][] matriz) {
        int numRows = matriz.length;
        int numCols = matriz[0].length;
        boolean[] filaNoCero = new boolean[numRows];
        boolean[] columnaNoCero = new boolean[numCols];
        int numFilasNoCero = 0;
        int numColumnasNoCero = 0;
    
        // Encuentra las filas que no consisten en ceros
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matriz[i][j] != '0') {
                    filaNoCero[i] = true;
                    columnaNoCero[j] = true;
                }
            }
        }
    
        // Cuenta las filas y columnas que no son completas de ceros
        for (int i = 0; i < numRows; i++) {
            if (filaNoCero[i]) {
                numFilasNoCero++;
            }
        }
        for (int j = 0; j < numCols; j++) {
            if (columnaNoCero[j]) {
                numColumnasNoCero++;
            }
        }
    
        // Crea una nueva matriz sin las filas y columnas completas de ceros
        char[][] nuevaMatriz = new char[numFilasNoCero][numColumnasNoCero];
        int nuevaFila = 0;
    
        for (int i = 0; i < numRows; i++) {
            if (filaNoCero[i]) {
                int nuevaColumna = 0;
                for (int j = 0; j < numCols; j++) {
                    if (columnaNoCero[j]) {
                        nuevaMatriz[nuevaFila][nuevaColumna] = matriz[i][j];
                        nuevaColumna++;
                    }
                }
                nuevaFila++;
            }
        }
    
        return nuevaMatriz;
    }
    public void checkAndClearRows() {
        for (int row = Boardtetris.length - 1; row >= 0; row--) {
            boolean isRowFull = true;
            
            // Verifica si la fila está llena de '1'
            for (int col = 0; col < Boardtetris[row].length; col++) {
                if (Boardtetris[row][col] != '1') {
                    isRowFull = false;
                    break;
                }
            }

            if (isRowFull) {
                // Borra la fila llena y desplaza todo lo de arriba hacia abajo
                for (int r = row; r > 0; r--) {
                    Boardtetris[r] = Boardtetris[r - 1].clone();
                }
                // Agrega una fila de '0' en la parte superior
                for (int col = 0; col < Boardtetris[0].length; col++) {
                    Boardtetris[0][col] = '0';
                }
                // Incrementa el contador de filas eliminadas
                rowsDeleted++;

                if (rowsDeleted >= 5) {
                    System.out.println("YOU WIN");
                    lose = 1;
                    return;
                }
    
            }

            
        }
    }
    
    public char[][] setRowToOnes(int rowIndex) {
        // Verifica si el índice de fila es válido
        if (rowIndex >= 0 && rowIndex < rows) {
            // Coloca "1" en cada columna de la fila seleccionada
            for (int j = 0; j < cols; j++) {
                Boardtetris[rowIndex][j] = '1';
            }
            // Retorna la matriz actualizada
            return Boardtetris;
        } else {
            System.out.println("Índice de fila fuera de rango.");
            // Si el índice de fila no es válido, retorna la matriz sin cambios
            return Boardtetris;
        }
    }
    public char[][] fillRowsWithOnes() {
        // Verifica si hay al menos 5 filas en la matriz
        if (Boardtetris.length >= 5) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < Boardtetris[i].length; j++) {
                    Boardtetris[i][j] = '1';
                }
            }
        } else {
            System.out.println("La matriz no tiene al menos 5 filas.");
        }
        
        // Retorna la matriz actualizada
        return Boardtetris;
    }    
    @Override
    public char[][][] getShapes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getShapes'");
    }
    
    

 
    
    /* 
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0'}
         */
    
}
