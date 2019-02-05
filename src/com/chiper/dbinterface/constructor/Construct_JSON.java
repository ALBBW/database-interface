/**
 * filename: 					Construct_JSON.java
 * @author 						GamesGamble
 * creation date: 		14.01.2019
 * alteration date:		05.02.2019
 */

/**
 * Using the chiper.dbinterface package of the database-interface program.
 */
package com.chiper.dbinterface.constructor;

// Importing Gson Libraries
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**  
 * This Construct Class is for Construction JSON.
 */
public class Construct_JSON implements Construct
{
	//Variable Declarations.
	private JsonElement dataRaw;
	private String to;
	private JsonObject main;

	/**
	 * @see com.chiper.dbinterface.constructor.Construct#setData
	 */
	@Override
	public void setData(String to,Object dataRaw)
	{
		// Create new GsonBuilder.
		Gson gson = new GsonBuilder().create();
		
		
		
		// Convert Object to JsonElement.
		this.dataRaw = gson.toJsonTree(dataRaw, Object.class);
		// saves the String as global variable.
		this.to = to;
		// Just calls the construct method.
		construct();
	}
	
	/**
	 * This Class creates a JSONObject Header and converts the ArrayList data to JSON.
	 */
	private void construct()
	{
		// Creates new JsonObject.
		JsonObject header = new JsonObject();
		// adds a JsonObject in a JsonObject.
		this.main.add("header", header);
		// adds Property string.
		header.addProperty("to", this.to);
		// adds Property string.
		header.addProperty("from", "mariadb");
		// adds a JsonObject in a JsonObject.
		this.main.add("data", dataRaw);
		
	}


	/**
	 * @see com.chiper.dbinterface.constructor.Construct#getData
	 */
	@Override
	public Object getData()
	{
		// Just returns the JsonObject
		return this.main;
		
	}
	
}
