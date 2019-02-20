/*
 * filename: 			starter.java
 *
 * @author GamesGamble
 * creation date: 		12.02.2019
 * alteration date:		13.02.2019
 */
package de.albbw.chiper.dbinterface;

import com.google.gson.JsonArray;
import de.albbw.chiper.dbinterface.constructor.Construct;
import de.albbw.chiper.dbinterface.constructor.Construct_JSON;
import de.albbw.chiper.dbinterface.model.Model_Output_MariaDB;
import de.albbw.chiper.dbinterface.parser.Parse;
import de.albbw.chiper.dbinterface.parser.Parse_JSON;
/**
 * This Class starts is the Controller of the Library and is called by the Listener.
 */
public class starter
{
	/**
	 * Variable Declarations.
	 */
	private de.albbw.chiper.dbinterface.model.Model_Output model = new Model_Output_MariaDB();
	private Construct construct = new Construct_JSON();
	private Parse parse = new Parse_JSON();

	/**
	 * This Method starts all necessary Steps to call the Model and get the result from the Model and sends them back
	 * to the Listener.
	 * @param dataRaw This String contains the Json Packet from the Listener.
	 * @return This contains the Json Array that has the returned data from the Model.
	 */
	public Object starter (String dataRaw)
	{
		// Calls the setter of the parser method.
		parse.setData(dataRaw);
		// Gets the parsed Data from the parser.
		JsonArray data = (JsonArray) parse.getData();
		// Sets the parsed Data to the Model_Output Class.
		model.setData(data);
		// Gets the Response Data from the Model_Output Class.
		data = (JsonArray) model.getData();
		// Gets the IP-Address from the Model_Output Class.
		String to = model.getTo();
		// Sets the IP-Address of the Module and the Raw Response Data to the Constructor.
		construct.setData(to, data);
		// Gets the Finished Json Data from the Constructor.
		data = (JsonArray) construct.getData();
		// This returns the Finished Json Data.
		return data;
	}

}