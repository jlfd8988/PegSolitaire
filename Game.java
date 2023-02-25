public class Game {

    StateNode first;
    int maxMoves;
    StateList<StateNode>[] possibleStates;

    public Game(int rows, int holeR, int holeC){
        first = new StateNode(new StateArray(rows));
        first.getData().setValues(holeR, holeC);
        first.setMoveCount(0);
        this.maxMoves = -2;
        for(int i = 1; i <= rows; i++){
            this.maxMoves += i;
        }
        possibleStates = new StateList<>[this.maxMoves];
    }

    public void populate(){

        for(int i = 0; i < this.maxMoves; i++){

        }
    }
}
