package TerminalModel;

public class CursorState {
    int col;
    int row;

    public CursorState(int col, int row) {
        this.col = col;
        this.row = row;

    }

    public int getCol() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }

    public void incrementCol(){
        this.col++;
    }
    public void incrementRow(){
        this.row++;
    }

}

