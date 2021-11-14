package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;

public class GreaterThanCondition extends Condition{
    public GreaterThanCondition(Expression lhs, Expression rhs){
        super(lhs,rhs);
    }

    //evaluate lhs and rhs separately, then evaluate based on subclass
    @Override
    public boolean evaluate(ProgramState programState){
        return getLhsValue(programState) > getRhsValue(programState);
    }
}

