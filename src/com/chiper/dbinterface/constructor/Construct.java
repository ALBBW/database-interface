/**
 * filename: 					Construct.java
 * @author 						GamesGamble
 * creation date: 		14.01.2019
 * alteration date:		04.02.2019
 */

/**
 * Using the chiper.dbinterface package of the database-interface program.
 */
package com.chiper.dbinterface.constructor;

/**
 * This Construct interface is for the modularity of the Construct Classes.
 */
public interface Construct
{
	// Here are some Method Declarations.
	/**
	 * This Method is for setting the Data that the Constructor needs.
	 * @param dataRaw This Object is for saving the data.
	 * @param to This String contains the destination module, that the date will be sent to.
	 */
	public void setData (String to, Object dataRaw);
	/**
	 * This Method returns the Json.
	 * @return This Object contains the header and data Object.
	 */
	public Object getData();
	
}
