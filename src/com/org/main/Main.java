package com.org.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static Logger LOGGER = LoggerFactory.getLogger( Main.class );
	public static void main(String[] args){
		LOGGER.info( "Error Received" );
		System.out.println("Hello World!");
	}
}
