/*
 * filename: 			Construct.java
 * @author 				GamesGamble
 * creation date: 		14.01.2019
 * alteration date:		12.02.2019
 */
package de.albbw.chiper.dbinterface.constructor;
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
	void setData(String to, Object dataRaw);
	/**
	 * This Method returns the Json.
	 * @return This Object contains the header and data Object.
	 */
	Object getData();
}
