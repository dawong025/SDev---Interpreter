package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.expression.Expression;

public class AssignStatement implements Statement{
    private String name;
    private Expression expression;

    public AssignStatement (String name, Expression expression){
        this.name = name;
        this.expression = expression;
    }

    @Override
    public void run(ProgramState programState){
        //assign the variable with the evaluated value via the programState map
        programState.setVariable(name, expression.evaluate(programState));
    }
}

