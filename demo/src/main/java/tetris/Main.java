package tetris;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
    // Declarar cuatro matrices de tipo char
    char[][] TT = {{'0', '1', '0', '0'},
{'1', '1', '1', '0'},
{'0', '0', '0', '0'},
{'0', '0', '0', '0'}};
    char[][] TT1 = {{'0', '1', '0', '0'},
{'0', '1', '1', '0'},
{'0', '1', '0', '0'},
{'0', '0', '0', '0'}};
    char[][] TT2 = {{'0', '1', '1', '1'},
{'0', '0', '1', '0'},
{'0', '0', '0', '0'},
{'0', '0', '0', '0'}};
    char[][] TT3 = {{'0', '1', '0', '0'},
{'1', '1', '0', '0'},
{'0', '1', '0', '0'},
{'0', '0', '0', '0'}};

    // Declarar un array de char que contenga estas matrices
    char[][][] arrayDeVariables = {TT,TT1, TT2, TT3};

    // Acceder a las matrices a través del array
    System.out.println("El valor de la primera matriz es: " + Arrays.deepToString(arrayDeVariables[0]));
    System.out.println("El valor de la segunda matriz es: " + Arrays.deepToString(arrayDeVariables[1]));
    System.out.println("El valor de la tercera matriz es: " + Arrays.deepToString(arrayDeVariables[2]));
    System.out.println("El valor de la cuarta matriz es: " + Arrays.deepToString(arrayDeVariables[3]));
}
}
            


