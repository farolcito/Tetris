package tetris;

public class PieceBase implements iRotator {
int opcion;
char[][][] arrayDeVariables;
char[][] matrizActual; // Agregar una matriz actual

public char[][] rotateRight(char[][] inputMatrix) {
   opcion = (opcion + 1) % 4;
   matrizActual = arrayDeVariables[opcion]; // Actualizar la matriz actual después de la rotación

   int rows = matrizActual.length;
   int cols = matrizActual[0].length;

   // Verificar si la matriz de entrada es lo suficientemente grande para contener la matriz rotada
   if (inputMatrix.length != rows || inputMatrix[0].length != cols) {
       // Las dimensiones no coinciden, así que crea una nueva matriz con las dimensiones correctas
       inputMatrix = new char[rows][cols];
   }

   // Copiar la matriz rotada en la matriz de entrada
   for (int i = 0; i < rows; i++) {
       for (int j = 0; j < cols; j++) {
           inputMatrix[i][j] = matrizActual[i][j];
       }
   }

   return inputMatrix;
}

      public char[][] rotateLeft(char[][] inputMatrix) {
         opcion = (opcion - 1 + 4) % 4; // Asegura que opcion esté en el rango de 0 a 3
     
         // Actualiza la matriz actual después de calcular el valor de opcion
         matrizActual = arrayDeVariables[opcion];
        int rows = matrizActual.length;
        int cols = matrizActual[0].length;

   // Verificar si la matriz de entrada es lo suficientemente grande para contener la matriz rotada
   if (inputMatrix.length != rows || inputMatrix[0].length != cols) {
       // Las dimensiones no coinciden, así que crea una nueva matriz con las dimensiones correctas
       inputMatrix = new char[rows][cols];
   }

   // Copiar la matriz rotada en la matriz de entrada
   for (int i = 0; i < rows; i++) {
       for (int j = 0; j < cols; j++) {
           inputMatrix[i][j] = matrizActual[i][j];
       }
   }

         return inputMatrix;
   }


}
