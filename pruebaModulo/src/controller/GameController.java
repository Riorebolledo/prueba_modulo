package controller;

import java.util.ArrayList;
import java.util.List;
import Model.Carro;
import Model.Coordinates;
import Model.Game;
public abstract class GameController {
    protected Game game;
    protected List<Carro> carros;
 
    public GameController(Game game) {
        this.game = game;
        this.carros = new ArrayList<>();

    }

    public abstract void controller();

    private Boolean isValidCoordinates(Coordinates coordinates){
        return this.game.getBoard().isValid(coordinates.getFile()
                ,coordinates.getFile());
    } 

    protected Coordinates firstCoordinateValid(){
        Coordinates coordinateRef = new Coordinates();
        while(this.isValidCoordinates(coordinateRef)){
             coordinateRef = new Coordinates();
        } 
        return coordinateRef;
    }

    protected List<Coordinates> rangeCoordinatesValid(int range){
        List<Coordinates> coordinatesList = new ArrayList<Coordinates>();
        Coordinates coordinatesRef = this.firstCoordinateValid();
            

                                                            
        return null;
    }

}