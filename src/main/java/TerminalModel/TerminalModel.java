package TerminalModel;


public class TerminalModel {
    ScreenBuffer screenBuffer;
    CommandBuffer commandBuffer;
    CursorState cursorState;

    public TerminalModel(){
        this.screenBuffer = new ScreenBuffer(50, 180);
        this.commandBuffer = new CommandBuffer();
        this.cursorState = new CursorState(50, 180);
    }


    public void writeChar(char c){
        switch (c) {
            case '\n':
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < screenBuffer.columns; i++) {
                    boolean done = false;
                    if(!done){
                        if(screenBuffer.getCell(cursorState.getRow(), i) == '\n'){
                            done = true;
                        }
                        sb.append(screenBuffer.getCell(cursorState.getRow(), i));
                    }
                    commandBuffer.addLine(sb.toString());
                newLine();
                }
                break;
            case '\b':
                backsPace();
                break;
            default:
                writeCharActual(c);
                break;
        }
    }

    private void writeCharActual(char c){
                    if (cursorState.getCol() >= screenBuffer.columns) {
                newLine();

            }else{
                screenBuffer.setCell(cursorState.getRow(),cursorState.getCol(), c);
                cursorState.incrementCol();
            }
    }

    public void backsPace(){
        if (cursorState.getCol() > 0) {
            cursorState.decreaseCol();
            screenBuffer.setCell(cursorState.getRow(), cursorState.getCol(), ' ');
        }
    }

    public void printCell(int row, int col){
        char c = screenBuffer.getCell(row, col);  
        System.out.print(c);

    }

    public void newLine(){
        cursorState.incrementRow();
        cursorState.setCol(0);
    }

    public void cleanScreen(){
        screenBuffer.clear();
        cursorState.setCol(0);
        cursorState.setRow(0);
    }

    public void scroll(){

    }

}
