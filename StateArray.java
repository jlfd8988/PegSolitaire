import java.util.Arrays;

public class StateArray {

    private boolean[][] data;
    private int rows;


    public StateArray(int rows){
        this.rows = rows;
        data = new boolean[this.rows][];
        for(int i = 0; i < this.rows; i++){
            data[i] = new boolean[i+1];
        }
    }

    public void copier(StateArray original){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < i+1; j++){
                this.data[i][j] = original.getData()[i][j];
            }
        }
    }


    public void flipValue(int r, int c){
        this.data[r][c] = !this.data[r][c];
    }

    public boolean equals(StateArray other){
        return Arrays.deepEquals(this.data, other.getData());
    }

    public boolean[][] getData(){
        return data;
    }

    public int getRows(){
        return this.rows;
    }

    //returns value at index i, starting at 0,0, traverses left-right,top-bottom
    public boolean getAtIndex(int index){

        for(int i = 0; i < this.getRows(); i++){
            for(int j = 0; j < i + 1; j++){
                if(index == 0){return this.getData()[i][j];}
                    index--;
                }
            }
        return true;
    }

    public void setValues(int holeR, int holeC){
        for(int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < i + 1; j++) {
                this.data[i][j] = true;
            }
        }
        this.data[holeR][holeC] = false;
    }

}
