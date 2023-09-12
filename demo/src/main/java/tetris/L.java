package tetris;

public class L extends PieceBase{
    

    
 char[][] L1 = {{ '1', '0'},
{ '1', '0'},
{ '1', '1'}
};
    char[][] L2 = {
{ '1', '1', '1'},
{ '1', '0', '0'}};
    char[][] L3 = {{'1', '1'},
{'0', '1'},
{'0', '1'}
};
    char[][] L4 = {
{'0', '0', '1'},
{'1', '1', '1'},
};

char[][][] arrayDeVariables = {L1, L2, L3, L4}; 

public L(){
    super.arrayDeVariables = new char[][][]{L1, L2, L3, L4};
}

public char[][] existL() {
    return L1;
}
public char[][] rightL() {
    return L2;
}
public char[][] investedL() {
    return L3;
}
public char[][] leftL() {
    return L4;
}
}