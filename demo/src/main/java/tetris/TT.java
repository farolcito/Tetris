package tetris;

import java.util.Arrays;



public class TT {
    char[][] TT1 = {
            {'0', '1', '0', '0'},
            {'1', '1', '1', '0'},
            {'0', '0', '0', '0'},
            {'0', '0', '0', '0'}
        };
        char[][] TT2 = {
            {'0', '1', '0', '0'},
            {'0', '1', '1', '0'},
            {'0', '1', '0', '0'},
            {'0', '0', '0', '0'}
        };
        char[][] TT3 = {
            {'0', '1', '1', '1'},
            {'0', '0', '1', '0'},
            {'0', '0', '0', '0'},
            {'0', '0', '0', '0'}
        };
        char[][] TT4 = {
            {'0', '1', '0', '0'},
            {'1', '1', '0', '0'},
            {'0', '1', '0', '0'},
            {'0', '0', '0', '0'}
        };   

        char[][][] arrayDeVariables = {TT1, TT2, TT3, TT4};
 
        
       
    int i = 0;  

    public char[][] existTT() {
        return TT1;
    }
    public char[][] rightTT() {
        return TT2;
    }
    public char[][] investedTT() {
        return TT3;
    }
    public char[][] leftTT() {
        return TT4;
    }

public char[][] obtenerVariable(int indice) {
    if (indice >= 0 && indice < arrayDeVariables.length) {
        return arrayDeVariables[indice];
    } else {
        return null;
    }
}

    }