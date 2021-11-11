package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;
import java.util.*;

public abstract class BlockStatement implements Statement{
    List<Statement> body;

    //BlockStatement constructor
    public BlockStatement(List <Statement> body){
        this.body = body;
    }

    //run each statement within the body
    public void runBlock(ProgramState programState){
        for(Statement statement:body){
            statement.run(programState);
        }
    }
}
