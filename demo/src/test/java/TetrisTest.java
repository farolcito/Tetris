import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;


import tetris.Square;
import tetris.TT;
import tetris.Tetris;
import tetris.Stick;
import tetris.L;
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
    public void validformTT() {
        TT tt1 = new TT();
        char[][] expected = {
            {'0', '1', '0', '0'},
            {'1', '1', '1', '0'},
            {'0', '0', '0', '0'},
            {'0', '0', '0', '0'}
        };
        
        Assert.assertArrayEquals(expected, tt1.existTT());
    }
    @Test
    public void rotateTT(){
        TT tt11 = new TT();

        Assert.assertArrayEquals(tt11.existTT(), tt11.obtenerVariable(0));
        Assert.assertArrayEquals(tt11.rightTT(), tt11.obtenerVariable(1));
        Assert.assertArrayEquals(tt11.investedTT(), tt11.obtenerVariable(2));
        Assert.assertArrayEquals(tt11.leftTT(), tt11.obtenerVariable(3));

    }


   
}
      

