/**
 * filename: 					NoORWrongParameters.java
 * @author 						GamesGamble
 * creation date: 		20.11.2018
 * alteration date:		26.11.2018
 * INFO: This File contains method calls of YAJSW methods and therefore you need to include wrapperApp.jar from YAJSW version 12.13a!
 */

/**
 * Using the dbinterface package of the chiper program.
 */
package chiper.dbinterface;

/**
 * This is a Exception class that is made for, when the program will be started with no or wrong parameters.
 */
public class WrongParamsException extends Exception
{
	/**
	 * Variable Declarations and Initializations.
	 */
	private static final long serialVersionUID = -2430966063072156451L;

	/**
	 * This is the Constructor of the Class and it will be triggered when the Class will be instantiated without any variables.
	 * It outputs a simply Error-Message.
	 */
	public WrongParamsException()
	{
		// Returns the Error-Message to the Exception Class Constructor.
		super("You wanted to start the Program with wrong Parameters!");
		
		// Stops the Wrapper for this Program.
		org.rzo.yajsw.app.WrapperJVMMain.WRAPPER_MANAGER.stop();
		
	}
	
	/**
	 * This is the Constructor of the Class and it will be triggered when the Class will be instantiated with any variables.
	 * It outputs the variable as Error-Message.
	 */
	public WrongParamsException(String errorcode)
	{
		// Returns the Error-Message to the Exception Class Constructor.
		super(errorcode);
		
		// Stops the Wrapper for this Program.
		org.rzo.yajsw.app.WrapperJVMMain.WRAPPER_MANAGER.stop();
		
	}
	
}
