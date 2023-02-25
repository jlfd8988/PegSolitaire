/**


 *
 * intended flow with a BST:
 * Valid state node exists
 * Potential next position is evaluated
 * Potential next position is validated
 * Take valid next position and search BST
 * Don't find State Node in storage at search location -> create node
 * Find node -> pass reference of node
 * add the next node to current node's child list
 * add current node to next node's parent list
 *
 * I don't know if I need a separate arraylist for each movecount at this point
 */


public class StateNodeBST {
    private int moveCount;
    private int winners;
    private int losers;
    private Node root;
    private int size;
    class Node{
        public StateNode data;
        public Node left;
        public Node right;


    }

    public StateNodeBST(int moveCount){
        this.size = 0;
        this.moveCount = moveCount;
        root = new Node();
    }

    public StateNode add(StateArray nextPos) {
        Node cur = root;
        for(int i = 0; i < moveCount + 1; i++) {
            if(nextPos.getAtIndex(i)) {
                if(cur.left==null){cur.left = new Node();}
                cur = cur.left;
            }
            else{
                if(cur.right==null){cur.right = new Node();}
            }
        }
        if(cur.data == null){
            cur.data = new StateNode(nextPos);
        }
        return cur.data;

    }



}
