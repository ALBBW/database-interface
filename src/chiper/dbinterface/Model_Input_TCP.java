/**
 * filename: 					Model_Input_Telnet.java
 * @author 						GamesGamble
 * creation date: 		20.11.2018
 * alteration date:		26.11.2018
 */

/**
 * Using the dbinterface package of the chiper program.
 */
package chiper.dbinterface;

/**
 * This class is the Listener for 
 * 
 *
 */
public class Model_Input_TCP implements Model_Input
{
	//
	private String input;
	
	// This method is 
	@Override
	public String getData()
	{
		// Return the value of input.
		return input;
		
	}

}
