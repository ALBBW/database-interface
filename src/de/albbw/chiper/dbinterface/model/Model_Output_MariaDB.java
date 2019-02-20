/*
 * filename: 			Model_Output_MariaDB.java
 * @author 				GamesGamble
 * creation date: 		29.01.2019
 * alteration date:		13.02.2019
 */
package de.albbw.chiper.dbinterface.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
/**
 * This class is a Model_Output Model, that handles the data Output to the MariaDB
 */
public class Model_Output_MariaDB implements Model_Output
{
	/**
	 * Variable Declarations.
	 */
	private ArrayList<Object> data;
	private String to;
	
	/**
	 * @see Model#setData
	 */
	@Override
	public void setData(Object dataRaw)
	{
		Gson gson = new GsonBuilder().create();
		JsonElement jelement = gson.toJsonTree(dataRaw, Object.class);
		JsonArray dataObj = jelement.getAsJsonArray();
		ArrayList<Object> data = gson.fromJson(dataObj, new TypeToken<ArrayList<Object>>(){}.getType());
		this.data = data;
		
		// TODO: header shit
		
		Object header = this.data.get(0);
		for (Object firstobj : (ArrayList<Object>)header)
		{
			for (Object secondobj : (ArrayList<Object>)firstobj)
			{
				System.out.println(((ArrayList<Object>)secondobj).get(0) + " " + ((ArrayList<Object>)secondobj).get(1));
			}
		}
		
		
		int i = 0;
		String sql_cmd = null; //TODO: needs rework!
		Connection connection;
		System.out.println(sql_cmd);
		
		try
		{
			connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/chiper?user=connector&password=Odebihehi634");
			Statement stmt = connection.createStatement();
			boolean isResponse = stmt.execute(sql_cmd);
			if (isResponse)
			{
				
				ResultSet resultSet = stmt.getResultSet();
				if (resultSet == null)
				{
					throw new SQLException();
				}
				ArrayList <String> one = new ArrayList <String>();
				i = 0;
				while (resultSet.next())
				{
					
					one.set(i, resultSet.getArray(i).toString());
					i++;
				}
				boolean sendNeeded = false;
				if (data.contains("mode"))
				{
					JsonObject mode = (JsonObject) data.get(2);
					JsonArray send = null; //TODO: needs rework!
					sendNeeded = false; //TODO: needs rework!
					
				}
				
				if (sendNeeded)
				{
					
					//JsonObject header = (JsonObject) data.get(0);
					i = 0;
					JsonArray name = null; //TODO: needs rework!
					// TODO: new shit to add!
					
				}
				
			}
			
			stmt.close();
			connection.close();
		}
			
		catch (SQLException e)
			
		{
			// TODO: Create comments for Controller.
			e.printStackTrace();
			
		}
		
	}

	/**
	 * @see Model#getData().
	 */
	@Override
	public Object getData()
	{
		
		// Just returns the data Object.
		return data;
		
	}

	/**
	 * @see Model_Output#getTo
	 */
	@Override
	public String getTo()
	{
		
		// Just returns the needed String.
		return this.to;
		
	}
}
