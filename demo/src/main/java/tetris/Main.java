package tetris;

public class Main {
    char[][] Board = {
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
    };

    public void agregarMatriz(int fila, int columna, char[][] nuevaMatriz) {
        for (int i = 0; i < nuevaMatriz.length; i++) {
            for (int j = 0; j < nuevaMatriz[i].length; j++) {
                if (fila + i < Board.length && columna + j < Board[0].length) {
                    Board[fila + i][columna + j] = nuevaMatriz[i][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main(); // Crear una instancia de la clase Main

        char[][] TT3 = {
            {'0', '1', '1', '1'},
            {'0', '0', '1', '0'},
            {'0', '0', '0', '0'},
            {'0', '0', '0', '0'}
        };

        // Agregar la matriz TT3 en la posición (2, 5) de la matriz Board
        main.agregarMatriz(2, 5, TT3);

        // Imprimir la matriz Board
        for (char[] fila : main.Board) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}


