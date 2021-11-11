package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;


public abstract class ArithmeticExpression implements Expression{
    private Expression lhs;
    private Expression rhs;

    public ArithmeticExpression(Expression lhs, Expression rhs){
        this.lhs = lhs;
        this.rhs = rhs;
    }

    protected int evaluateLhs(ProgramState programState){
        return lhs.evaluate(programState);
    }
    protected int evaluateRhs(ProgramState programState){
        return lhs.evaluate(programState);
    }
}

