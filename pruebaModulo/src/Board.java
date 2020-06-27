public class Board {
    private  final Integer DIMENSION = 14;
    private String [][] matrix;

    public Board (){
        matrix = new String[DIMENSION][DIMENSION];
        this.write();
    }

    private void write(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                  matrix[i][j] = "*";  
            }
        }
    }

    public Boolean isOccupied(Coordinates coordinates){
     return matrix[coordinates.getFile()][coordinates.getColumn()] == "*" ;
    }

    public void put(Coordinates coordinates,String simbols){
        matrix[coordinates.getFile()][coordinates.getColumn()] = simbols; 
    }

    public void print(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                   System.out.print(matrix[i][j] + " ");
                   
            }
            System.out.println();
        }
        System.out.println();
    }
    
}