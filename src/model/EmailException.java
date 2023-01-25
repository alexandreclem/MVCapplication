package model;

public class EmailException extends Exception{
	public EmailException()
	{
		super("Email Invalido.");
	}
	
	public EmailException(String message)
	{
		super(message);
	}
}
