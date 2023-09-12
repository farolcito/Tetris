
package tetris;

import java.util.Arrays;



public class TT  extends PieceBase{
    char[][] TT1 = {
            {'0', '1', '0'},
            {'1', '1', '1'},
       
        };
        char[][] TT2 = {
            {'1', '0'},
            {'1', '1'},
            {'1', '0'},

        };
        char[][] TT3 = {
            {'1', '1', '1'},
            {'0', '1', '0'},

            
        };
        char[][] TT4 = {
            {'0', '1'},
            {'1', '1'},
            {'0', '1'},
        };   

        public char[][][] arrayDeVariables = {TT1, TT2, TT3, TT4};
 
        
            public TT(){
                 super.arrayDeVariables = new char[][][]{TT1, TT2, TT3, TT4};
            }
    
       


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



    }