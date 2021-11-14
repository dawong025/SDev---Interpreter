package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;

import javax.swing.plaf.nimbus.State;
import java.util.*;

public class DefineFunctionStatement implements Statement{
    private String functName;
    private List<String> functParams;
    private List<Statement> functStatements;

    public DefineFunctionStatement(String functName, List<String> functParams, List<Statement> functStatements){
        this.functName = functName;
        this.functParams = functParams;
        this.functStatements = functStatements;
    }

    @Override
    public void run(ProgramState programState){
        //call programState to register the new function
        programState.registerFunction(functName, functParams, functStatements);
    }
}
