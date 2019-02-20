/*
 * filename: 			Model.java
 * @author 				GamesGamble
 * creation date: 		29.01.2019
 * alteration date:		12.02.2019
 */
package de.albbw.chiper.dbinterface.model;

/**
 * This is the Model Interface, the Model_Input and Model_Output Interfaces are implementing all methods of this superinterface.
 */
public interface Model
{
	/**
	 * This is a method for setting the Data of the Model.
	 * @param data This is any Type of Object.
	 */
	void setData(Object data);
	
	/**
	 * This is a method for getting the Data out of the Model.
	 * @return Object of any Type.
	 */
	Object getData();
}