package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;

public class MultiplyExpression extends ArithmeticExpression{
    public MultiplyExpression(Expression lhs, Expression rhs){
        super(lhs, rhs);
    }

    //evaluate lhs and rhs separately, then evaluate based on subclass
    @Override
    public int evaluate(ProgramState programState){
        return evaluateLhs(programState) * evaluateRhs(programState);
    }
}

