import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Model.Coordinates;
import controller.GameController;
import controller.Logic;
import utils.Direction;

public class App {
    private static Logic logic;
    private static GameController controller;


    private static void play(){
        logic = new Logic();  
        logic.getController().controller();;
            
    }

    public static void main(String[] args) throws Exception {
        // Board board = new Board();
        // board.print();
        // Coordinates cor = new Coordinates(1,1);
        // board.put(cor, "$");    
        // Coordinates cor2 = new Coordinates(2,1);
        // board.put(cor2, "$");  
        // board.print();
        List<Coordinates> cor = new ArrayList<>();
    
        for (Direction carro : Direction.values()) {
            System.out.println(carro);       
        }
        Coordinates cors = new Coordinates(1,1);
        Coordinates cor2 = new Coordinates(1,1);
        cor.add(cors);
        int[] random = new Random().ints(2, 0, 13).toArray();
        System.out.println(cor.contains(random));
        play();

    }
}
