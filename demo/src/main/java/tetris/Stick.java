package tetris;

public class Stick {

    
            char[][] Stick1 = {{'0', '1', '0', '0'},
           {'0', '1', '0', '0'},
           {'0', '1', '0', '0'},
           {'0', '1', '0', '0'}};
               char[][] Stick2 = {{'0', '0', '0', '0'},
           {'0', '0', '0', '0'},
           {'1', '1', '1', '1'},
           {'0', '0', '0', '0'}};
               char[][] Stick3 = {{'0', '1', '0', '0'},
           {'0', '1', '0', '0'},
           {'0', '1', '0', '0'},
           {'0', '1', '0', '0'}};
               char[][] Stick4 = {{'0', '0', '0', '0'},
           {'0', '0', '0', '0'},
           {'1', '1', '1', '1'},
           {'0', '0', '0', '0'}};
           

           char[][][] arrayDeVariables = {Stick1, Stick2, Stick3, Stick4};

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