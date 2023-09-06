import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
    public void validformTT(){
    TT tt1 = new TT();
    assertEquals("00X00XXX00000000", tt1.existTT());
    }

    @Test
    public void leftmoveTT(){
    TT ttleft = new TT();
    assertEquals("00X00XX000X00000", ttleft.moveLeftTT(String strTT));
    }
}
      

