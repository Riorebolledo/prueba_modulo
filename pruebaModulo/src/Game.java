import javafx.scene.layout.Border;

public class Game {
    private State state;
    private Board board;

    public  Game(){
        this.state = State.START;
        this.board = new Board();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    
    
}