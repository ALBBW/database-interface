/**
 * filename: 					parse.java
 * @author 						GamesGamble
 * creation date: 		04.12.2018
 * alteration date:		29.01.2019
 */

// Using the chiper.dbinterface package of the database-interface program.
package com.chiper.dbinterface.parser;

/**
 * This is the Parse class, that is based on the Bridge design pattern and is the Input Bridge that parses the Input from the External
 *  Model_Output in the Controller class.
 */
public interface Parse
{
	/**
	 * This is the setData method that gives the data to the parser, so that it can parse the data.
	 * @param data his String contains the data, that the parser parses.
	 */
	public void setData (String data);
	/**
	 * This is the getData method that gets the data from the parser, that has been given to the parser by the setData method.
	 * @return data This Object contains the data, that has been parsed.
	 */
	public Object getData ();
	
}
