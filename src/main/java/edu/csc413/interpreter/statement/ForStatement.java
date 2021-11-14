package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.expression.Expression;
import java.util.*;

public class ForStatement extends BlockStatement{
    String loopVariable;
    Expression rangeStart;
    Expression rangeEnd;

    public ForStatement(String loopVariable, Expression rangeStart, Expression rangeEnd, List<Statement> body){
        super(body);
        this.loopVariable = loopVariable;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    @Override
    public void run(ProgramState programState) {
        int rangeS = rangeStart.evaluate(programState);
        int rangeE = rangeEnd.evaluate(programState);

        for(int i = rangeS; i < rangeE; i++){
            //run body statements
            //runBlock(programState); //TODO not working

            //increment the value of the loop variable
            programState.setVariable(loopVariable, i);
        }
    }
}
