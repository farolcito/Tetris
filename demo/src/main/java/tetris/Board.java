package tetris;

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
        public char[][] moverMatrizAbajoSiEsPosible() {
        
        int filas = matrizActual.length;
        int columnas = matrizActual[0].length;

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
                        Boardtetris[filaInicio + i + 1][columnaInicio + j] = matrizActual[i][j];
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
