package controller;

import Model.Game;

public class Logic {
    private Game game;
    private StartController startController;
    private PutController putController;

    public Logic(){
        this.game = new Game();
        this.startController = new StartController(game);
        this.putController = new PutController(game);
    }


    public GameController getController(){
        switch (this.game.getState()) {
            case START:
                 return  this.startController;
            case GAME:
                 return this.putController;         
            default:
                break;
        }
        return null;

    }
}