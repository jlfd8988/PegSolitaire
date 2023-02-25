import java.util.ArrayList;
import java.util.Set;

public class StateList<StateNode> extends ArrayList implements Set {

    private int size;
    private int maxParents;
    private int maxChildren;

    public int indexOf(boolean[][] comp){

        for(int i = 0; i < this.size(); i++){
            if(this.get(i).equals(comp)){
                return i;
            }


        }

        return -1;
    }

}