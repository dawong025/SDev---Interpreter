package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;

public class VariableExpression implements Expression{
    private String name;
    private int value;

    public VariableExpression(String name, int value){
        this.name = name;
        this.value = value;
    }

    @Override
    //TODO
    public int evaluate(ProgramState programState){ //program state is not needed in this case
        return 1;
    }
}
