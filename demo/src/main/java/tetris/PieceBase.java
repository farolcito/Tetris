package tetris;

public class PieceBase implements iRotator {
int indice = 0;
char [][][] arrayDeVariables = null;


    public char[][] rotateLeft(int indice) {
       
        if (indice >= 0 && indice < arrayDeVariables.length) {
                return arrayDeVariables[indice-1];
            } else {
                return null;
            }
        
    }


    public char[][] rotateRight(int indice) {
        if (indice >= 0 && indice < arrayDeVariables.length) {
                return arrayDeVariables[indice+1];
            } else {
                return null;
            }
    }

    
    



}
