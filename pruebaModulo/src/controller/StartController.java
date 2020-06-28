package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import Model.Caguano;
import Model.Carro;
import Model.Coordinates;
import Model.CoordinatesWraper;
import Model.Game;
import utils.Direction;
import utils.State;

public class StartController extends GameController {


    public StartController(Game game) {
        super(game);
        
    }

    @Override
    public void controller() {

        this.game.getBoard().print();
        this.game.setState(State.GAME);
        System.out.println(this.game.getState());
    }

    private void createElements() {

        for (int i = 0; i < 10; i++) {
            Carro caguano = new Caguano();/*factory*/
            CoordinatesWraper cor = new CoordinatesWraper();
            /*cordinatesWraper*/
          
            
        }      
        
    }

  

    
    
}