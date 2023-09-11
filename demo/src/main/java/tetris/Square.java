package tetris;

public class Square extends PieceBase{

    // Declarar cuatro matrices de tipo char
    char[][] Square1 = {{'0', '1', '1', '0'},
{'0', '1', '1', '0'},
{'0', '0', '0', '0'},
{'0', '0', '0', '0'}};
    char[][] Square2 = {{'0', '1', '1', '0'},
{'0', '1', '1', '0'},
{'0', '0', '0', '0'},
{'0', '0', '0', '0'}};
    char[][] Square3 = {{'0', '1', '1', '0'},
{'0', '1', '1', '0'},
{'0', '0', '0', '0'},
{'0', '0', '0', '0'}};
    char[][] Square4 = {{'0', '1', '1', '0'},
{'0', '1', '1', '0'},
{'0', '0', '0', '0'},
{'0', '0', '0', '0'}};


  
  char[][][] arrayDeVariables = {Square1, Square2, Square3, Square4};

        

        public char[][] existSquare() {
            return Square1;
        }
        public char[][] rightSquare() {
            return Square2;
        }
        public char[][] investedSquare() {
            return Square3;
        }
        public char[][] leftSquare() {
            return Square4;
        }
    }


