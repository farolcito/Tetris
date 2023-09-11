package tetris;

public class PieceBase implements iRotator {
int opcion;
char[][][] arrayDeVariables;


    public char[][] rotateRight() {
        opcion = opcion +1;
      if(opcion ==1){
        return arrayDeVariables[opcion];
     }else if (opcion==2){
        return arrayDeVariables[opcion];
     }else if (opcion==3){
        return arrayDeVariables[opcion];
     }else if(opcion==4){
        return arrayDeVariables[0];
     }
    return null; 
    }
    public char[][] rotateLeft() {
        opcion = opcion -1;
      if(opcion ==-1){
        opcion = 3;
        return arrayDeVariables[3];
     }else if (opcion==0){
        return arrayDeVariables[0];
     }else if (opcion==1){
        return arrayDeVariables[1];
     }else if(opcion==2){
        return arrayDeVariables[2];
     }
    return null; 
    }

    
    



}
