public abstract class  GameController {
    protected Game game;

    public GameController(Game game) {
        this.game = game;
    
    }
    public abstract void controller();
}