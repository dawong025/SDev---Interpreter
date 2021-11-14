package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.expression.Condition;
import java.util.*;

public class IfStatement extends ConditionBlockStatement{
    public IfStatement(Condition condition, List<Statement> body){
        super(body, condition);
    }

    @Override
    public void run(ProgramState programState){
        //run once
        if(evaluateCondition(programState)){
            runBlock(programState);
        }
    }
}
