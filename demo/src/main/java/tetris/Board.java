package tetris;

public class Board extends PieceBase{
    char[][] Boardtetris = {
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
    int filaInicio = 0;       // Fila de inicio en la matriz grande
    int columnaInicio = 0;    // Columna de inicio en la matriz grande

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
        }
        
        return Boardtetris; // Retorna la matriz Board actualizada
    }
    public char[][] moverMatrizAbajoSiEsPosible(char[][] matrizPequena, int filaInicio, int columnaInicio) {
        
        int filas = matrizPequena.length;
        int columnas = matrizPequena[0].length;
    
        // Crea una copia de la matriz original para evitar modificarla directamente
        char[][] matrizActualizada = new char[Boardtetris.length][Boardtetris[0].length];
    
        // Copia los valores de la matriz original en la matriz actualizada
        for (int i = 0; i < Boardtetris.length; i++) {
            for (int j = 0; j < Boardtetris[0].length; j++) {
                matrizActualizada[i][j] = Boardtetris[i][j];
            }
        }
    
        // Verificar si la fila de abajo está llena de ceros
        if (filaInicio + filas < matrizActualizada.length) {
            boolean filaAbajoEsCero = true;
            for (int j = 0; j < columnas; j++) {
                if (matrizActualizada[filaInicio + filas][columnaInicio + j] != '0') {
                    filaAbajoEsCero = false;
                    break;
                }
            }
    
            // Si la fila de abajo está llena de ceros, mover la matriz pequeña hacia abajo
            if (filaAbajoEsCero) {
                filaInicio++;
                for (int i = filas - 1; i >= 0; i--) {
                    for (int j = 0; j < columnas; j++) {
                        matrizActualizada[filaInicio + i][columnaInicio + j] = matrizPequena[i][j];
                    }
                }
            }
        }
    
        // Devuelve la matriz actualizada
        return matrizActualizada;
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
