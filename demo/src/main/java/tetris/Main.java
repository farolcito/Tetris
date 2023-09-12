package tetris;

public class Main {
    public static char[][] eliminarFilasYColumnasDeCeros(char[][] matriz) {
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
    
    public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
    
    public static void main(String[] args) {
        // Matriz que deseas modificar
        char[][] TT1 = {
            {'0', '1', '0', '0'},
            {'1', '1', '1', '0'},
            {'0', '0', '0', '0'},
            {'0', '0', '0', '0'},
        };
    
        char[][] nuevaMatriz = eliminarFilasYColumnasDeCeros(TT1);
        imprimirMatriz(nuevaMatriz); // Imprimimos la matriz resultante
    }
    
}


