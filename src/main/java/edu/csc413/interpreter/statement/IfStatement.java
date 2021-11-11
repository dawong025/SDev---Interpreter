package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.expression.Condition;
import java.util.*;

public class IfStatement extends ConditionBlockStatement{
    public IfStatement(List<Statement> body, Condition condition){
        super(body, condition);
    }

    @Override
    public void run(ProgramState programState){
        if(evaluateCondition(programState)){
            runBlock(programState);
        }
    }
}
