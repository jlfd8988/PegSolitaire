public class StateNode {
    //TODO make data a StateArray object/new class
    //i WANT A GET HELPER METHOD SO I CAN LOOk at indicies 0,14
    private StateArray data;
    private StateList<StateList> parents;
    private StateList<StateList> children;

    private int moveCount;
    boolean winner;

    StateNode(StateArray initial){
        this.data = initial;
        this.parents = new StateList<>();
        this.children = new StateList<>();
        this.winner = false;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }
    public int getMoveCount(){
        return this.moveCount;
    }

    public StateArray getData(){
        return data;
    }

    public void addParent(StateNode parent){
        this.parents.add(parent);
    }

    public void addChild(StateNode child){
        this.children.add(child);
    }


}
