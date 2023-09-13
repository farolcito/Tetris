package tetris;

public class Square extends PieceBase{

    char[][] Square1 = {
{ '1', '1' },
{ '1', '1' }
};
    char[][] Square2 = {
{ '1', '1' },
{ '1', '1' }
};
    char[][] Square3 = {
{ '1', '1' },
{ '1', '1' }
};
    char[][] Square4 = {
{ '1', '1' },
{ '1', '1' }
};


  
  char[][][] arrayDeVariables = {Square1, Square2, Square3, Square4};

  public Square(){
    super.arrayDeVariables = new char[][][]{Square1, Square2, Square3, Square4};
}

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

        @Override
        public char[][][] getShapes() {
            return new char[][][]{
                Square1,
                Square2,
                Square3,
                Square4
            };
        }
    }


