public class StartController extends GameController{

    public StartController(Game game) {
        super(game);
    }

    @Override
    public void controller() {
        this.game.getBoard().print();   
        this.game.setState(State.GAME);
    }
    
    
}