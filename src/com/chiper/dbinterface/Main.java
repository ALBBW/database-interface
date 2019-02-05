package com.chiper.dbinterface;

import com.chiper.dbinterface.listener.Controller;

public class Main
{
	/**
	 * TODO: Create Comment for @param args.
	 * @param args 
	 */
	public static void main(String[] args)
	{
		// Instantiate Controller.
		Controller controller = new Controller();
		// Calls starter method of Controller.
		controller.starter();
		
	}
}
