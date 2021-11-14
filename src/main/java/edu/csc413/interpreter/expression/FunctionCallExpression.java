package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.statement.Statement;
import java.util.*;

public class FunctionCallExpression implements Expression{
    private String functName;
    private List<Expression> functParams;

    public FunctionCallExpression(String functName, List<Expression> functParams){
        this.functName = functName;
        this.functParams = functParams;
    }
    @Override
    public int evaluate(ProgramState programState){
        //Get the parameters and statements already associated with the pre-defined function
        List<String> functionParams = programState.getParameterNames(functName);
        List<Statement> functionStatements = programState.getFunctionStatements(functName);

        //match parameters passed in to the parameters stored from the function definition
        for(int i = 0; i < functParams.size(); i++){
            String parameter = functionParams.get(i); //take param name from pre-def function
            int paramValue = functParams.get(i).evaluate(programState); //get value of passed in param
            programState.setVariable(parameter, paramValue); //set parameter to passed in value
        }

        //iterate through each statement and run it
        for(Statement statement: functionStatements){
            statement.run(programState);
        }

        if(programState.hasReturnValue()) {
            //assign a variable w/ the return value, clear it within programState, and return the value
            int returnValue = programState.getReturnValue();
            programState.clearReturnValue();
            return returnValue;
        }
        else{
            return programState.getReturnValue();
        }
    }
}
