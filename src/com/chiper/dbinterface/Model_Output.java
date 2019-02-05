/**
 * filename: 					Model_Output.java
 * @author 						GamesGamble
 * creation date: 		29.01.2019
 * alteration date:		05.02.2019
 */

/**
 * Using the chiper.dbinterface package of the database-interface program.
 */
package com.chiper.dbinterface;

/**
 * This is the Model_Output Interface that communicates with the corresponding output class.
 */
public interface Model_Output extends Model
{
	
	/**
	 * This Method just gets the Modulename out of the Json Header Data.
	 * @return This is a String that contains the Modulename of the Receiving Data.
	 */
	public String getTo ();
	
}
