package edu.csc413.interpreter;

import edu.csc413.interpreter.statement.Statement;

import java.util.*;

/**
 * ProgramState represents the Program's storage information at any point in time while the program is running. It
 * should keep track of all defined variables, as well as their assigned values, and allow the running program to read
 * or set those values.
 */
public class ProgramState {
    // TODO: Implement. Add any instance variables you need.
    //Map used to store map of variable names, define in ProgramState()
    //String Name = Key, ints = value
    private Map<String, Integer> variableNames;
    //private Stack<HashMap<String, Integer>> variableNames;


    private List <String> functions = new ArrayList<>();
    //Lecture 20 - HashMaps used for storing the function variables as well as the statements
    private Map<String, List<String>> functionParameters = new HashMap<>();
    private Map<String, List <Statement>> functionStatement = new HashMap<>();

    private boolean returnable = false;
    private int returnVal = -1;

    public ProgramState() {
        // TODO: Implement. Initialize any instance variables you added. - DONE
        this.variableNames = new HashMap<>();
        //this.variableNames = new Stack<>();
    }

    /** Returns the integer value associated with the specified variable name in the current call frame. */
    public int getVariable(String variable) {
        // TODO: Implement.
        //Returns the value of the variable, null if the key is not present in the map
        return variableNames.get(variable);
        //return variableNames.peek().get(variable);
    }

    /** Sets the value for the specified variable name to the specified value in the current call frame. */
    public void setVariable(String variable, int value) {
        // TODO: Implement.
        variableNames.put(variable, value);
        /* stack implementation
        if(!variableNames.isEmpty()) {
            variableNames.peek().put(variable, value);
        }
        else{
            HashMap<String, Integer> newMap = new HashMap<>();
            newMap.put(variable, value);
            variableNames.push(newMap);
        }
         */
    }

    /** Adds a new, empty call frame to the top of the call stack, making it the new current call frame. */
    public void addCallFrame() {
        // TODO: Implement.
        HashMap<String, Integer> callStack = new HashMap<>();
        //variableNames.push(callStack);
    }

    /**
     * Removes the topmost call frame from the call stack. The current call frame becomes the previous one in the stack.
     */
    public void removeCallFrame() {
        // TODO: Implement.
        //variableNames.pop();
    }

    /**
     * Registers a function's parameter names and function statements so that they can be looked up later on using just
     * the function name.
     */
    public void registerFunction(String functionName, List<String> parameterNames, List<Statement> functionStatements) {
        // TODO: Implement. - DONE
        functions.add(functionName);
        //update the map w/ the function name as the key and the list of parameters as the values
        functionParameters.put(functionName, parameterNames);
        //update the map w/ the function name as the key and the list of statements as the values
        functionStatement.put(functionName, functionStatements);
    }

    /** Returns the list of parameter names associated with the specified function name. */
    public List<String> getParameterNames(String functionName) {
        // TODO: Implement. - DONE
        return functionParameters.get(functionName);
    }

    /** Returns the list of function statements associated with the specified function name. */
    public List<Statement> getFunctionStatements(String functionName) {
        // TODO: Implement. - DONE
        return functionStatement.get(functionName);
    }

    /** Returns whether or not a return value has been recorded. */
    public boolean hasReturnValue() {
        // TODO: Implement. - DONE
        return returnable;
    }

    /** Returns the recorded return value, if it exists. */
    public int getReturnValue() {
        // TODO: Implement. - DONE
        return returnVal;
    }

    /** Records a return value. hasReturnValue should return true after this method is called. */
    public void setReturnValue(int returnValue) {
        // TODO: Implement. - DONE
        if(!returnable){
            //enable returnable and set returnVal to the param
            returnable = true;
            returnVal = returnValue;
        }
    }

    /** Clears the recorded return value. hasReturnValue should return false after this method is called. */
    public void clearReturnValue() {
        // TODO: Implement. - DONE
            returnable = false;
            returnVal = -1;
    }
}
