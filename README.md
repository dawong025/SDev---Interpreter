# CSC 413 Assignment 3 README

Name: Darren Wong

Email: dwong19@mail.sfsu.edu

[Feedback]
-Excellent implementation of the various block statements!
-Regarding TODO in FunctionCallExpression. The issue is that you do want to add a new call frame, but you need to access variables in the previous call frame to evaluate the parameters for the new one. The solution is to evaluate all the parameter expressions first, store the results in a List<Integer>, add the call frame, and then assign the integer values to the parameter variables.
-FunctionCallExpression needs to return as soon as the return value is present.
-Commented out call stack implementation in ProgramState isn't quite correct. Setting variables erases all other variables in the top call frame, which you don't want to do.
