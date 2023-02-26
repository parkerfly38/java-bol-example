package com.nmfta.ebol;

public class BOLRequestNotFoundException extends RuntimeException {
	
	public BOLRequestNotFoundException(Long id)
	{
		super("Could not find BOLRequest " + id);
	}

}
