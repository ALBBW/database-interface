/**
 * filename: 					Model_Input.java
 * @author 						GamesGamble
 * creation date: 		19.11.2018
 * alteration date:		26.11.2018
 */

/**
 * Using the dbinterface package of the chiper program.
 */
package chiper.dbinterface;

/**
 * This is the Model Input Interface, that is based on the MVC design pattern and and is giving all Model Input Classes needed methods
 *  for communication with them.
 */
public interface Model_Input 
{

	/**
	 * This is the method that is receiving commands from program modules.
	 * @return data in this variable are the commands.
	 * @throws Exception 
	 */	
	public String getData();

}
