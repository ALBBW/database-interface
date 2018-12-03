/**
 * filename: 					Controller.java
 * @author 						GamesGamble
 * creation date: 		06.11.2018
 * alteration date:		28.11.2018
 */

/**
 * Using the dbinterface package of the chiper program.
 */
package chiper.dbinterface;

/**
 * Importing the External Library "Connector Unit" to simulate the Connector Module for Unit-Tests.
 */
import connector_unit.Model_Output;

/**
 * This is the Controller class, that is based on the Bridge design pattern and controls the data flow between the
 Model Input interfaces and the Model Output interfaces.
 */
public class Controller
{
	
	/**
	 * Variable Declarations and Initializations.
	 */
	Model_Output model_output = new Model_Output();
	String data = model_output.getData();
	
	/**
	 * This is the main method, that is only used to start the start method of the module.
	 * @param args start parameters of the program
	 */
	public static void main(String[] args)
	{
	
		Controller controller = new Controller();
		controller.start();
		
	}
	
	private void start()
	{
		
		
		
	}
	
}
