/*
 * filename: 			Model_Output.java
 * @author 				GamesGamble
 * creation date: 		29.01.2019
 * alteration date:		12.02.2019
 */
package de.albbw.chiper.dbinterface.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

/**
 * This is the Model_Output Interface that communicates with the corresponding output class.
 */
public interface Model_Output extends Model
{
	ArrayList<Object> data = new ArrayList<> ();
	String to = "";
	/**
	 * This Method just gets the Modulename out of the Json Header Data.
	 * @return This is a String that contains the Modulename of the Receiving Data.
	 */
	String getTo ();

	private void sorter (String dataRaw)
	{

		Gson gson = new GsonBuilder().create();
		JsonElement jelement = gson.toJsonTree(dataRaw, Object.class);
		JsonArray Obj = jelement.getAsJsonArray();
		ArrayList<Object> data = gson.fromJson(Obj, new TypeToken<ArrayList<Object>>(){}.getType());
		int i = 0;

		for (Object Object : data)
		{
			// Checks if Object is the first Object.
			if (i > 0) // if Object is not first Object
			{


			}
			else // if Object is first Object
			{
				//
				Object header = data.get(0);
				Object head = header.getClass();

				// Counts up, when the Header has been processed.
				i++;
			}
		}
	}
}
