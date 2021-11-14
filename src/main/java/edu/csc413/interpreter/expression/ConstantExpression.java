package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.statement.Statement;


public class ConstantExpression implements Expression{
    private int value;

    public ConstantExpression(int value){
        this.value = value;
    }

    @Override
    public int evaluate(ProgramState programState){
        //programState is not needed in this case
        return value;
    }
}
