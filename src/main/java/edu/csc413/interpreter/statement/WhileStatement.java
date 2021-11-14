package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.expression.Condition;
import java.util.*;


public class WhileStatement extends ConditionBlockStatement{
    public WhileStatement(Condition condition, List<Statement> body){
        super(body, condition);
    }


    @Override
    public void run(ProgramState programState){
        while(evaluateCondition(programState)){
            runBlock(programState);
        }
    }

}
