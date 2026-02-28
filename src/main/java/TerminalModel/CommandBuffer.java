package TerminalModel;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandBuffer {
    Deque<String> commandBuff;

    public CommandBuffer(){
        int MAX_COMMANDS = 50;
        commandBuff = new ArrayDeque<>(MAX_COMMANDS);
    }

    public void addLine(String line){
        commandBuff.add(line);
    }

    public String getLine(){
        return commandBuff.pop();
    }

}
