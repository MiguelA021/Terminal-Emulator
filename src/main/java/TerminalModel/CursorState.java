package TerminalModel;

public class CursorState {
    int col;
    int row;
    int MaxCol;
    int MaxRow;

    public CursorState(int col, int row) {
        this.MaxCol = col;        
        this.MaxRow = row;
        this.col = 0;
        this.row = 0;

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

    public void decreaseCol(){
        this.col--;
    }

    public void incrementRow(){
        this.row++;
    }

    public void decreaseRow(){
        this.row--;
    }

    public void setCol(int col){
        this.col = col;
    }

    public void setRow(int row){
        this.row = row;
    }

}

