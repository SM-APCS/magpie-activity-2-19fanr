/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Mr. T
 * @version December 2016
 */
import java.lang.String.*;
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
                if (statement.trim().equals(""))
                {
                        response = "Say something, please.";
                }
                else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
                else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0
				|| statement.indexOf("fish") >= 0
				|| statement.indexOf("hamster") >= 0)
		{
			response = "Tell me more about your pets.";
		}
                else if (statement.indexOf("Kurt") >= 0
				|| statement.indexOf("Tholking") >= 0
				|| statement.indexOf("Mr. Tholking") >= 0
				|| statement.indexOf("Mr. T") >= 0)
		{
			response = "He's the compsci teacher right?";
		}
                else if (statement.indexOf("Hey") >= 0)
		{
			response = "Howdy!";
		}
                else if (statement.indexOf("Bye") >= 0)
		{
			response = "Goodbye!";
		}
                else if (statement.indexOf("Test") >= 0)
                    
		{
			response = "Not a test.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
                else if (whichResponse == 4)
		{
			response = "Go on.";
		}
                else if (whichResponse == 5)
		{
			response = "That's neat.";
		}
                else if (whichResponse == 6)
		{
			response = "Woah!";
		}

		return response;
	}
}
