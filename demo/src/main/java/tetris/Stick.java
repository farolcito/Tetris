package tetris;

public class Stick extends PieceBase {

    
            char[][] Stick1 = {{ '1'},
           { '1'},
           { '1'},
           { '1'}};
               char[][] Stick2 = {
           {'1', '1', '1', '1'}
          };
               char[][] Stick3 = {{ '1'},
           { '1'},
           { '1'},
           { '1'}};            

               char[][] Stick4 = {
           {'1', '1', '1', '1'}
          };
           

           char[][][] arrayDeVariables = {Stick1, Stick2, Stick3, Stick4};

           public Stick(){
            super.arrayDeVariables = new char[][][]{Stick1, Stick2, Stick3, Stick4};
        }
           public char[][] existStick() {
            return Stick1;
        }
        public char[][] rightStick() {
            return Stick2;
        }
        public char[][] investedStick() {
            return Stick3;
        }
        public char[][] leftStick() {
            return Stick4;
        }
}