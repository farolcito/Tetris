import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

import tetris.Square;
import tetris.TT;
import tetris.Tetris;
import tetris.Stick;
import tetris.L;
import tetris.PieceBase;
import tetris.Board;
import tetris.Dog;

public class TetrisTest {
    @Test
    public void testTetrisInicio() {
        Tetris t = new Tetris();
        assertNotNull(t);
    
    }
    @Test 
    public void testpieceTT(){
        TT piece = new TT();
        assertNotNull(piece);
    }
    @Test
    public void testpieceSquare(){
        Square a = new Square();
        assertNotNull(a);
    }
    @Test
    public void testpieceStick(){
        Stick b = new Stick();
        assertNotNull(b);
    }
     @Test
    public void testpieceL(){
        L c = new L();
        assertNotNull(c);
    }
     @Test
    public void testpieceDog(){
         Dog d = new Dog();
        assertNotNull(d);
    }
    @Test
    public void validformL() {
        L l1 = new L();
        char[][] expected = {
            { '1', '0'},
            { '1', '0'},
            { '1', '1'}
        };
        
        Assert.assertArrayEquals(expected, l1.existL());
    }
    @Test
    public void rotateRightL(){
        L l1 = new L();
        char[][] inputMatrix = l1.existL();

        Assert.assertArrayEquals(l1.rightL(), l1.rotateRight(inputMatrix));
        Assert.assertArrayEquals(l1.investedL(), l1.rotateRight(inputMatrix));
        Assert.assertArrayEquals(l1.leftL(), l1.rotateRight(inputMatrix));
        Assert.assertArrayEquals(l1.existL(), l1.rotateRight(inputMatrix));
    }
@Test
    public void rotateLeftL(){
        L l1 = new L();
        char[][] inputMatrix = l1.existL();

        Assert.assertArrayEquals(l1.leftL(), l1.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(l1.investedL(), l1.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(l1.rightL(), l1.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(l1.existL(), l1.rotateLeft(inputMatrix));
    }
     @Test
    public void validformDog() {
        Dog d1 = new Dog();
        char[][] expected = {
       {'0', '1', '1' },
       {'1', '1', '0' }
        };
        
        Assert.assertArrayEquals(expected, d1.existDog());
    }
    @Test
    public void rotateRightDog(){
        Dog d1 = new Dog();
        char[][] inputMatrix = d1.existDog();
        
        Assert.assertArrayEquals(d1.rightDog(), d1.rotateRight(inputMatrix));
        Assert.assertArrayEquals(d1.investedDog(), d1.rotateRight(inputMatrix));
        Assert.assertArrayEquals(d1.leftDog(), d1.rotateRight(inputMatrix));
        Assert.assertArrayEquals(d1.existDog(), d1.rotateRight(inputMatrix));
    }
@Test
    public void rotateLeftDog(){
        Dog d1 = new Dog();
        char[][] inputMatrix = d1.existDog();

        Assert.assertArrayEquals(d1.leftDog(), d1.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(d1.investedDog(), d1.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(d1.rightDog(), d1.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(d1.existDog(), d1.rotateLeft(inputMatrix));
    }
     @Test
    public void validformSquare() {
        Square s1 = new Square();
        char[][] expected = {
            { '1', '1' },
            { '1', '1' }
        };
        
        Assert.assertArrayEquals(expected, s1.existSquare());
    }
    @Test
    public void rotateRightSquare(){
        Square s1 = new Square();
        char[][] inputMatrix = s1.existSquare();

        Assert.assertArrayEquals(s1.rightSquare(), s1.rotateRight(inputMatrix));
        Assert.assertArrayEquals(s1.investedSquare(), s1.rotateRight(inputMatrix));
        Assert.assertArrayEquals(s1.leftSquare(), s1.rotateRight(inputMatrix));
        Assert.assertArrayEquals(s1.existSquare(), s1.rotateRight(inputMatrix));
    }
@Test
    public void rotateLeftSquare(){
        Square s1 = new Square();
        char[][] inputMatrix = s1.existSquare();

        Assert.assertArrayEquals(s1.leftSquare(), s1.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(s1.investedSquare(), s1.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(s1.rightSquare(), s1.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(s1.existSquare(), s1.rotateLeft(inputMatrix));
    }
  
     @Test
    public void validformStick() {
        Stick s11 = new Stick();
        char[][] expected = {
            { '1'},
            { '1'},
            { '1'},
            { '1'}
        };
        
        Assert.assertArrayEquals(expected, s11.existStick());
    }
    @Test
    public void rotateRightStick(){
        Stick s11 = new Stick();
        char [][] inputMatrix = s11.existStick();

        Assert.assertArrayEquals(s11.rightStick(), s11.rotateRight(inputMatrix));
        Assert.assertArrayEquals(s11.investedStick(), s11.rotateRight(inputMatrix));
        Assert.assertArrayEquals(s11.leftStick(), s11.rotateRight(inputMatrix));
        Assert.assertArrayEquals(s11.existStick(), s11.rotateRight(inputMatrix));
    }
@Test
    public void rotateLeftStick(){
        Stick s11 = new Stick();
char [][] inputMatrix = s11.existStick();

        Assert.assertArrayEquals(s11.leftStick(), s11.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(s11.investedStick(), s11.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(s11.rightStick(), s11.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(s11.existStick(), s11.rotateLeft(inputMatrix));
    }
    @Test
    public void validformTT() {
        TT tt1 = new TT();
        char[][] expected = {
            {'0', '1', '0'},
            {'1', '1', '1'},

        };
        
        Assert.assertArrayEquals(expected, tt1.existTT());
    }
    @Test
    public void rotateRightTT(){
        TT tt11 = new TT();
        char[][] inputMatrix = tt11.existTT(); 
        
        Assert.assertArrayEquals(tt11.rightTT(), tt11.rotateRight(inputMatrix));
        Assert.assertArrayEquals(tt11.investedTT(), tt11.rotateRight(inputMatrix));
        Assert.assertArrayEquals(tt11.leftTT(), tt11.rotateRight(inputMatrix));
        Assert.assertArrayEquals(tt11.existTT(), tt11.rotateRight(inputMatrix));
    }
    @Test
    public void rotateLeftTT(){
        TT tt11 = new TT();
        char[][] inputMatrix = tt11.existTT();

        
        Assert.assertArrayEquals(tt11.leftTT(), tt11.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(tt11.investedTT(), tt11.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(tt11.rightTT(), tt11.rotateLeft(inputMatrix));
        Assert.assertArrayEquals(tt11.existTT(), tt11.rotateLeft(inputMatrix));
    }
    
    @Test
    public void pieceAdd() {
        Board board = new Board();
       char[][] BoardExpected={
        {'0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0' ,'0' ,'0' ,'0', '0', '0', '0', '0' ,'0'},
        {'1', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0' ,'0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
       };
       // Matriz que deseas agregar
       char[][] TT1 = {
        {'0', '1', '0'},
        {'1', '1', '1'}

    };

    // Especificar la posición de inicio en la matriz grande donde deseas agregar TT1
    int filaInicio = 0;       // Fila de inicio en la matriz grande
    int columnaInicio = 0;    // Columna de inicio en la matriz grande

    // Agregar la matriz TT1 en la posición especificada
    

    Assert.assertArrayEquals(BoardExpected, board.agregarMatriz(filaInicio, columnaInicio, TT1));
    }
    @Test 
    public void boardConfirm(){
        Board board = new Board();
        char[][] BoardExpected = {
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
        Assert.assertArrayEquals(BoardExpected, board.confirm());

    }
    @Test
    public void pieceMotion() {
        Board board1 = new Board();
        TT tt1 = new  TT();
        char[][] BoardExpected={
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0' ,'0' ,'0' ,'0', '0', '0', '0', '0' ,'0'},
        {'0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0' ,'0'},
        {'1', '1', '1', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
       };
       char[][] BoardExpected1={
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0' ,'0' ,'0' ,'0', '0', '0', '0', '0' ,'0'},
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0' ,'0'},
        {'0', '1', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'1', '1', '1', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
       };
       char[][] BoardExpected2={
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0' ,'0' ,'0' ,'0', '0', '0', '0', '0' ,'0'},
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0' ,'0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '1', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'1', '1', '1', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
       };
       char[][] BoardExpected3={
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0' ,'0' ,'0' ,'0', '0', '0', '0', '0' ,'0'},
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0' ,'0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '1', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'1', '1', '1', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
       };

       // Matriz que deseas agregar
   
    // Especificar la posición de inicio en la matriz grande donde deseas agregar TT1
    int filaInicio = 0;       // Fila de inicio en la matriz grande
    int columnaInicio = 0;    // Columna de inicio en la matriz grande
    char[][] inputMatrix = tt1.existTT();
    board1.agregarMatriz(filaInicio, columnaInicio, inputMatrix);
    
    Assert.assertArrayEquals(BoardExpected, board1.moverMatrizAbajoSiEsPosible(inputMatrix));
    Assert.assertArrayEquals(BoardExpected, board1.Boardtetris);
    Assert.assertArrayEquals(BoardExpected1, board1.moverMatrizAbajoSiEsPosible(inputMatrix));
    Assert.assertArrayEquals(BoardExpected2, board1.moverMatrizAbajoSiEsPosible(inputMatrix));
    board1.moverMatrizAbajoSiEsPosible(inputMatrix);
    board1.moverMatrizAbajoSiEsPosible(inputMatrix);
    board1.moverMatrizAbajoSiEsPosible(inputMatrix);
    board1.moverMatrizAbajoSiEsPosible(inputMatrix);
    Assert.assertArrayEquals(BoardExpected3, board1.moverMatrizAbajoSiEsPosible(inputMatrix));
}

    @Test
    public void pieceRotateInBoard() {
        Board board1 = new Board();
        TT tt1 = new  TT();
        
        char[][] BoardExpected = {
        {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0' ,'0' ,'0' ,'0', '0', '0', '0', '0' ,'0'},
        {'0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0' ,'0'},
        {'0', '1', '1', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '1', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        {'0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0'},
        };
        
            // Especificar la posición de inicio en la matriz grande donde deseas agregar la matriz de la pieza TT
            int filaInicio = 0;
            int columnaInicio = 1;
            char[][] inputMatrix = tt1.rightTT();
 
            // Agregar la matriz de la pieza TT en Boardtetris
            board1.agregarMatriz(filaInicio, columnaInicio, inputMatrix);
            
            tt1.rotateRight(inputMatrix);
            
            for (int i = 0; i < board1.Boardtetris.length; i++) {
                for (int j = 0; j < board1.Boardtetris[i].length; j++) {
                    System.out.print(board1.Boardtetris[i][j] + " ");
                }
                System.out.println(); // Cambiar de línea después de cada fila
            }
            
            Assert.assertArrayEquals(BoardExpected, board1.moverMatrizAbajoSiEsPosible(inputMatrix));

        }
    @Test
    public void Rotacion(){
        TT tt11 = new TT();
        char[][] inputMatrix = tt11.existTT(); 
        
        Assert.assertArrayEquals(tt11.rightTT(), tt11.rotateRight(inputMatrix));
        Assert.assertArrayEquals(tt11.existTT(), tt11.rotateLeft(inputMatrix));
    }
    @Test
    public void genradorFormaRandom(){
        PieceBase ttPiece = new TT();
        

        char[][] randomShape = ttPiece.getRandomShape();
        
        // Imprime la forma aleatoria
        ttPiece.printMatrix(randomShape);

    }
    @Test
    public void Ganar(){
    Board board = new Board();
        board.fillLastFiveRowsWithOnes();
        
        board.checkAndPrintGameWon();
        
    }
    @Test
    public void Ganar1(){
    Board board = new Board();
    board.fillLastFiveRowsWithOnes();
        
    board.checkAndPrintGameWon();
        
    }
    @Test
    public void Perder(){
    Board board = new Board();
    
    board.fillFirstColumnWithOnes();
    board.checkIfGameLost();
    }

    }
      

