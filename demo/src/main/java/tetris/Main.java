package tetris;

public class Main {
    public static void main(String[] args) {
        // Crear una matriz 10x20 llena de ceros
        char[][] Board = {
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

        // Ingresar una matriz 4x4 en la matriz grande
        char[][] matrizPequena = {
            {'1', '2', '3', '4'},
            {'5', '6', '7', '8'},
            {'9', '1', '1', '2'},
            {'0', '0', '0', '0'}
        };

        // Especificar la posición de inicio en la matriz grande donde deseas ingresar la matriz pequeña
        int filaInicio = 0;    // Fila de inicio en la matriz grande
        int columnaInicio = 5; // Columna de inicio en la matriz grande

        // Función para mover la matriz pequeña hacia abajo si la fila de abajo está llena de ceros
        moverMatrizAbajoSiEsPosible(matrizPequena, Board, filaInicio, columnaInicio);

        // Imprimir la matriz grande resultante
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Función para mover la matriz pequeña hacia abajo si la fila de abajo está llena de ceros
    public static void moverMatrizAbajoSiEsPosible(char[][] matrizPequena, char[][] matrizGrande, int filaInicio, int columnaInicio) {
        int filas = matrizPequena.length;
        int columnas = matrizPequena[0].length;

        // Verificar si la fila de abajo está llena de ceros
        if (filaInicio + filas < matrizGrande.length) {
            boolean filaAbajoEsCero = true;
            for (int j = 0; j < columnas; j++) {
                if (matrizGrande[filaInicio + filas][columnaInicio + j] != '0') {
                    filaAbajoEsCero = false;
                    break;
                }
            }

            // Si la fila de abajo está llena de ceros, mover la matriz pequeña hacia abajo
            if (filaAbajoEsCero) {
                filaInicio++;
                for (int i = filas - 1; i >= 0; i--) {
                    for (int j = 0; j < columnas; j++) {
                        matrizGrande[filaInicio + i][columnaInicio + j] = matrizPequena[i][j];
                    }
                }
            }
        }
    }
}



