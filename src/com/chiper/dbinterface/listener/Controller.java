/**
 * filename: 					Controller.java
 * @author 						GamesGamble
 * creation date: 		06.11.2018
 * alteration date:		05.02.2019
 */
// In this Package the Listener of the Chiper Database Interface is placed and is doing the Important Part of Listening over TCP for Json Packets.
package com.chiper.dbinterface.listener;
// Importing Gson Libraries.
import com.google.gson.JsonArray;
//Importing the Model Interface and Classes for getting and setting the Data between the Packages.
import com.chiper.dbinterface.Model_Output_MariaDB;
// Importing the Parser Interface and Classes for getting and setting the parsed and to be parsed Data.
import com.chiper.dbinterface.parser.Parse;
import com.chiper.dbinterface.parser.Parse_JSON;
// Importing the Construct Interface and Classes for getting the constructed Json and setting the data.
import com.chiper.dbinterface.constructor.Construct;
import com.chiper.dbinterface.constructor.Construct_JSON;
// Importing Model Classes of the connector_unit Module for Unit Testing this Program. TODO: Remove when Program finished!
import com.chiper.dbinterface.connector_unit.Model_Output;
import com.chiper.dbinterface.connector_unit.Model_Input;
/**
 * This is the Controller of the Database Interface of the Chiper Program and controls the Listener that calls the needed methods when receiving Json Strings. 
 *  INFO: This Controller actually doesn't contains the Listener calls and does just emulate the Behavior of the Listener calls, when the Listener receives Json Strings.
 *  TODO: When this Database Interface is finished edit this Controller and call the Listeners instead.
 */
public class Controller
{
	/**
	 * Variable Declarations.
	 */
	com.chiper.dbinterface.connector_unit.Model_Output con_model_output = new Model_Output();
	Model_Input con_model_input = new Model_Input();
	com.chiper.dbinterface.Model_Output model = new Model_Output_MariaDB();
	Construct construct = new Construct_JSON();
	Parse parse = new Parse_JSON();
	String dataRaw;
	JsonArray data;
	String to;
	/**
	 * This is the main method, that is only used to start the start method of the module.
	 * @param args start parameters of the program
	 */
	
	/**
	 * This starter method is just starting the methods that a Listener would call, when he received a Json String.
	 */
	public void starter ()
	{
		// Sets dataRaw to the return value of the getData method from the Connector_Unit Model_Output Class.
		this.dataRaw = con_model_output.getData();
		// Calls the setter of the parser method.
		parse.setData(this.dataRaw);
		// Gets the parsed Data from the parser.
		this.data = (JsonArray) parse.getData();
		// Sets the parsed Data to the Model_Output Class.
		model.setData(this.data);
		// Gets the Response Data from the Model_Output Class.
		this.data = (JsonArray) model.getData();
		// Gets the IP-Address from the Model_Output Class.
		this.to = model.getTo();
		// Sets the IP-Address of the Module and the Raw Response Data to the Constructor.
		construct.setData(to, this.data);
		// Gets the Finished Json Data from the Constructor.
		this.data = (JsonArray) construct.getData();
		// This sets the Finished Json Data to the Connector_Unit Input Model.
		con_model_input.setJson(this.data);
		// This shows the Finished Json Data as String in the Console.
		con_model_input.showJson();
	}
	
}