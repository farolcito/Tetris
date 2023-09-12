package tetris;

public class Dog extends PieceBase{
    
        char[][] Dog1 = {
       {'0', '1', '1', '0'},
       {'1', '1', '0', '0'},
       {'0', '0', '0', '0'},
       {'0', '0', '0', '0'}};
           char[][] Dog2 = {
       {'0', '1', '0', '0'},
       {'0', '1', '1', '0'},
       {'0', '0', '1', '0'},
       {'0', '0', '0', '0'}};
           char[][] Dog3 = {
       {'0', '0', '0', '0'},
       {'1', '1', '0', '0'},
       {'0', '1', '1', '0'},
       {'0', '0', '0', '0'}};
           char[][] Dog4 = {
       {'0', '1', '0', '0'},
       {'0', '1', '0', '0'},
       {'1', '0', '0', '0'},
       {'1', '0', '0', '0'}};

char[][][] arrayDeVariables = {Dog1, Dog2, Dog3, Dog4};

public Dog(){
    super.arrayDeVariables = new char[][][]{Dog1, Dog2, Dog3, Dog4};
}


public char[][] existDog() {
    return Dog1;
}
public char[][] rightDog() {
    return Dog2;
}
public char[][] investedDog() {
    return Dog3;
}
public char[][] leftDog() {
    return Dog4;
}
}
