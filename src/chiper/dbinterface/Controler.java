/**
 * filename: 			Controler.java
 * @author 				Joscha Alhelm
 * creation date: 		06.11.2018
 * alteration date:		07.11.2018
 */

/**
 * Using the dbinterface package of the chiper program.
 */

package chiper.dbinterface;

/**
 * This is the Controler class, that is based on the MVC design pattern and controls the data flow between the
 connector interface and the database interface.
 */

public class Controler 
{
	
	/**
	 * Here are some variable declarations.
	 */
	private int todo;
	
	/**
	 * This is just an empty Constructor.
	 */
	private Controler ()
	{
		
	}
	
	/**
	 * This is the main method, that is only used to start the start method of the module.
	 * @param args start parameters of the program
	 */
	public static void main(String[] args) 
	{
		
		// Creates an Object of the Controler class.
		Controler controler = new Controler ();
		// calls the method start of the instantiated Controler class.
		controler.start ();

	}
	
	/**
	 * This is the start method that is starting the methods based on the todo flag.
	 */
	private void start ()
	{
		
		// Do something here...
		
	}

}
