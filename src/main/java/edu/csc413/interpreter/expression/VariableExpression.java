package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;

public class VariableExpression implements Expression{
    private String name;

    public VariableExpression(String name){
        this.name = name;
    }

    @Override
    public int evaluate(ProgramState programState){
        return programState.getVariable(name);
    }
}
