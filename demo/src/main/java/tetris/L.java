package tetris;

public class L {
    
public static void LRotate(String[] args) {
    
 char[][] L1 = {{'0', '1', '0', '0'},
{'0', '1', '0', '0'},
{'0', '1', '1', '0'},
{'0', '0', '0', '0'}};
    char[][] L2 = {{'0', '0', '0', '0'},
{'0', '0', '0', '0'},
{'0', '1', '1', '1'},
{'0', '1', '0', '0'}};
    char[][] L3 = {{'1', '1', '0', '0'},
{'0', '1', '0', '0'},
{'0', '1', '0', '0'},
{'0', '0', '0', '0'}};
    char[][] L4 = {{'0', '0', '0', '0'},
{'0', '0', '1', '0'},
{'1', '1', '1', '0'},
{'0', '0', '0', '0'}};
}
char[][][] arrayDeVariables = {L1, L2, L3, L4}; 

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