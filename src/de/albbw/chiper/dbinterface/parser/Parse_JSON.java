/*
 * filename: 			Parse_JSON.java
 * @author 				GamesGamble
 * creation date: 		04.12.2018
 * alteration date:		12.02.2019
 */
package de.albbw.chiper.dbinterface.parser;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
/**
 * Parses the JSON to a mysql command, so that we can send it to the database.
 */
public class Parse_JSON implements Parse
{
	/**
	 * Variable Declarations and Initializations.
	 */
	private String data;
	private JsonElement jsonElement;
	
	/**
	 * @see Parse#setData
	 */
	@Override
	public void setData(String data)
	{
		// Sets the data.
		this.data = data;
		// Starts the Parser.
		Parser();
		
	}
	
	/**
	 * This method is parsing the Json String to a JsonElement.
	 */
	private void Parser ()
	{
		// Creates new Gson Object
		Gson gson = new Gson();
		//  A Json string is converted to a JsonElement
		this.jsonElement = gson.fromJson(this.data, JsonElement.class);
		
	}
	
	/**
	 * @see Parse#getData
	 */
	@Override
	public JsonElement getData()
	{
		// gets the data
		return this.jsonElement;
		
	}
	
}