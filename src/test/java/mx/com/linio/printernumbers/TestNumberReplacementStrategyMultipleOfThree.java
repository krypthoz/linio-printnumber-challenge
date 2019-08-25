package mx.com.linio.printernumbers;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

import mx.com.linio.printnumbers.imp.NumberReplacementStrategyMultipleOfThree;

/**
 * Test case suit for {@link NumberReplacementStrategyMultipleOfThree}.
 *   
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 *
 */	
public class TestNumberReplacementStrategyMultipleOfThree 
{

	/**
	 * Holds expected token by testcases
	 */
	private static final Optional< String > expected_content = Optional.of( "Linio" );
	
	/**
	 * Should return Optional With Linio Word As String When ApplyStrategyMultipleOfThree To number Three
	 */
	@Test
	public void shouldReturnOptionalWithLinioWordAsStringWhenApplyStrategyMultipleOfThreeToNumberThree( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfThree( ).applyStrategy( 3 ) );
	}

	/**
	 * Should return Optional With Linio Word As String When ApplyStrategyMultipleOfThree To number six
	 */
	@Test
	public void shouldReturnOptionalWithLinioWordAsStringWhenApplyStrategyMultipleOfThreeToNumberSix( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfThree( ).applyStrategy( 6 ) );
	}
	
	/**
	 * Should return Optional With Linio Word As String When ApplyStrategyMultipleOfThree To number nine
	 */
	@Test
	public void shouldReturnOptionalWithLinioWordAsStringWhenApplyStrategyMultipleOfThreeToNumberNine( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfThree( ).applyStrategy( 9 ) );
	}
	
	/**
	 * Should return Optional With Linio Word As String When ApplyStrategyMultipleOfThree To number twelve
	 */
	@Test
	public void shouldReturnOptionalWithLinioWordAsStringWhenApplyStrategyMultipleOfThreeToNumberTwelve( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfThree( ).applyStrategy( 12 ) );
	}

	/**
	 * Should return Optional With Linio Word As String When ApplyStrategyMultipleOfThree To number Eighteen
	 */
	@Test
	public void shouldReturnOptionalWithLinioWordAsStringWhenApplyStrategyMultipleOfThreeToNumberEighteen( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfThree( ).applyStrategy( 18 ) );
	}

	/**
	 * Should return Optional.empty When ApplyStrategyMultipleOfThree to number ninety seven
	 */
	@Test
	public void shouldReturnOptionalEmptyWhenApplyStrategyMultipleOfThreeToNumberNinetySeven( ) 
	{
		Assert.assertNotEquals( expected_content, new NumberReplacementStrategyMultipleOfThree( ).applyStrategy( 97 ) );
	}
}
