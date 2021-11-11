package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.expression.Condition;
import java.util.*;

public abstract class ConditionBlockStatement extends BlockStatement{
    private Condition condition;

    //ConditionBlockStatement constructor
    public ConditionBlockStatement(List<Statement> body, Condition condition){
        super(body);
        this.condition = condition;
    }

    public boolean evaluateCondition(ProgramState programState){
        return condition.evaluate(programState);
    }
}
