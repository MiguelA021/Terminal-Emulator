package TerminalModel;


public class ScreenBuffer {
    char[][] screen;
    int rows;
    int columns;


    public ScreenBuffer(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.screen = new char[rows][columns];
        init();
    }

    public void init(){
        for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    screen[i][j] = ' ';
                }
            
        }
    }

    public char getCell(int row, int columns) {
        return screen[row][columns];
    }

    public void setCell(int rows, int columns, char c){
        screen[rows][columns] = c;
    }

    public void clear(){
        for (int i = 0; i< rows; i++){
            for (int j = 0; j< columns; j++){
                screen[i][j] = ' ';
            }
        }
    }
}
