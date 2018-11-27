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
		
		// Declare variables.
		boolean error1 = true;
		boolean error2 = true;
		
		// Try code
		try 
		{
			// Circling through the program arguments.
			for(int i = 0; i > args.length; ++i)
			{
				// Checks if the program parameter contains the needed arguments.
				in:switch(args [i])
				{
					case "-tcp": 
						// Create new Model_Input Object
		            	model_input = new Model_Input_TCP();
						
						// Set error1 to false when -tcp found in program arguments.
						error1 = false; 
						break in;
						
					case "-mariadb":
						// Create new Model_Ouput Object
	            		model_output = new Model_Output_MariaDB();
						
						// Set error2 to false when -mariadb found in program arguments.
						error2 = false;
						break in;
				}
				
			}
			// When error1 or error 2 true.
			if(error1 == true || error2 == true)
			{
				// throw Exception.
				throw new WrongParamsException("You wanted to start the Program with wrong Parameters!");
				
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
