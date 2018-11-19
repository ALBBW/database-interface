/**
 * filename: 			Model_Output.java
 * @author 				Joscha Alhelm
 * creation date: 		12.11.2018
 * alteration date:		12.11.2018
 */

/**
 * Using the dbinterface package of the chiper program.
 */
package chiper.dbinterface;

/**
 * This is the Model Output Interface, that is based on the MVC design pattern and is giving all Model Output Classes needed methods
 *  for communication with them.
 */
public interface Model_Output 
{
	
	/**
	 * This is the method that is sending sql commands to the database.
	 * @param data in this variable are the sql commands.
	 */	
	public void setData (String data);
	
}
