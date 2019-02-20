/*
 * filename: 			Construct_JSON.java
 * @author 				GamesGamble
 * creation date: 		14.01.2019
 * alteration date:		12.02.2019
 */
package de.albbw.chiper.dbinterface.constructor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

/**
 * This Construct Class is for Construction JSON.
 */
public class Construct_JSON implements Construct
{
	/**
	 * Variable Declarations.
	 */
	private JsonElement dataRaw;
	private String to;
	private JsonObject main;

	/**
	 * @see Construct#setData
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
		// Creates new Gson Object.
		Gson gson = new Gson();
		// Creates ArrayList from the dataRaw JsonElement.
		ArrayList<JsonElement> data2 = gson.fromJson(this.dataRaw,
			new TypeToken<ArrayList<JsonElement>>() {}.getType());
		// For Each JsonElement in ArrayList data2 adds the JsonElement to the ArrayList main.
		for (JsonElement obj : data2)
		{
			// adds a JsonElement in a JsonObject.
			this.main.add("data", obj);
		}
		
	}


	/**
	 * @see Construct#getData
	 */
	@Override
	public Object getData()
	{
		// Just returns the JsonObject
		return this.main;
		
	}
	
}
