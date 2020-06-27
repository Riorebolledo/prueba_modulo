import javafx.scene.layout.Border;

public class App {
    private static Logic logic;
    private static GameController controller;

    private static void play(){
          logic = new Logic();  
          controller =  logic.getController();
           System.out.println(controller.game.getState()); 
    
    }

    public static void main(String[] args) throws Exception {
        Board board = new Board();
        board.print();
        Coordinates cor = new Coordinates(1,1);
        board.put(cor, "$");    
        Coordinates cor2 = new Coordinates(2,1);
        board.put(cor2, "$");  
        board.print();
   

    }
}
