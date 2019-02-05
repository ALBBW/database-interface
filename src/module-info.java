/**
 * filename: 					module-info.java
 * @author 						GamesGamble
 * creation date: 		04.02.2019
 * alteration date:		05.02.2019
 */

/**
 * 				Module Description
 * 
 * This Module has an Input in form of 4 Listeners, that waits for Json Strings. After receiving one Json String it does parse this
 *  Json String as ArrayList with Objects inside and after that it do parses them into an sql command and deliver them to the
 *   MariaDB Connector/J that send them to the MariaDB Service. The MariaDB Service then send an sql resultSet back to the
 *    MariaDB Connector/J that gives them back to the Construct Class that constructs a Json String out of the result and then
 *     send them back to the specific port, that was inside the Json String.
 */

/**
 * This is the Module declaration that set ups the allowed In- and Exports.
 */
module chiper.dbinterface 
{
	// This Module requires the Java Basic Module as any other Java Program.
	requires transitive java.base;
	// This Module requires the gson Module.
	requires transitive com.google.gson;
	// This Module requires the connector_Unit Module, that is made for the Unit Tests.
	requires transitive com.chiper.dbinterface.connector_unit;
	// This Module requires the Java SQL Module.
	requires transitive java.sql;
	
}