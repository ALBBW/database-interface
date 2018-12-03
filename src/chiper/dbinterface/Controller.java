/**
 * filename: 					Controller.java
 * @author 						GamesGamble
 * creation date: 		06.11.2018
 * alteration date:		26.11.2018
 */

/**
 * Using the dbinterface package of the chiper program.
 */
package chiper.dbinterface;

/**
 * This is the Controller class, that is based on the MVC design pattern and controls the data flow between the
 Model Input interfaces and the Model Output interfaces.
 */
public class Controller 
{
	
	/**
	 * Variable Declarations and Initializations.
	 */
	private static Model_Input model_input;
	private static Model_Output model_output;
	
	/**
	 * This is the main method, that is only used to start the start method of the module.
	 * @param args start parameters of the program
	 */
	public static void main(String[] args)  throws WrongParamsException
	{
		
		// Try code
		try 
		{
			// Circling through the program arguments.
			for(int i = 0; i > args.length; ++i)
			{
				// Checks if the program parameter contains the needed arguments.
				if (args[i].contains("-tcp"))
				{
					// Create new Model_Input Object
        	model_input = new Model_Input_TCP();
					
				}
				// If args -tcp not found
				else if (i > args.length)
				{
					// throw Exception.
					throw new WrongParamsException("You wanted to start the Program with wrong Parameters!");
					
				}
			}
			// Circling through the program arguments.
			for(int i = 0; i > args.length; ++i)
			{
				// Checks if the program parameter contains the needed arguments.
				if (args[i].contains("-mariadb"))
				{
					// Create new Model_Ouput Object
      		model_output = new Model_Output_MariaDB();
					
				}
				// If args -mariadb not found
				else if (i > args.length)
				{
					// throw Exception.
					throw new WrongParamsException("You wanted to start the Program with wrong Parameters!");
					
				}
				
			}
			
		}
		// catch WrongParamsException Exception.
		catch (WrongParamsException e)
		{
			// Print Error to Console.
			// INFO: Console Output may not be wise to use here.
			System.out.println(e.toString());
			
		}
        
		// Creates an Object of the Controller class.
		Controller controller = new Controller();
		
		// calls the method start of the instantiated Controller class.
		controller.start();

	}
	
	/**
	 * This is the start method that 
	 */
	private void start()
	{
		
		// Do something here...
		model_input.getData();
		model_output.setData("Test");
		
	}

}
