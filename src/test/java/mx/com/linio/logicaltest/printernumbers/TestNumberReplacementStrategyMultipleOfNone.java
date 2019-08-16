package mx.com.linio.logicaltest.printernumbers;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

import mx.com.linio.printnumbers.imp.NumberReplacementStrategyMultipleOfNone;

/**
 * Test case suit for {@link NumberReplacementStrategyMultipleOfNone}.
 *   
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 *
 */
public class TestNumberReplacementStrategyMultipleOfNone 
{

	/**
	 * Should return Optional object With number five as String When Apply StrategyMultipleOfNone
	 */
	@Test
	public void shouldReturnOptionalWithFiveNumberAsStringWhenApplyStrategyMultipleOfNone( ) 
	{
		final Optional< String > expectedContent = Optional.of( "5" );
		Assert.assertEquals( expectedContent, new NumberReplacementStrategyMultipleOfNone( ).applyStrategy( 5 ) );
	}

	/**
	 * Should return Optional object With number three as String When Apply StrategyMultipleOfNone
	 */
	@Test
	public void shouldReturnOptionalWithThreeNumberAsStringWhenApplyStrategyMultipleOfNone( ) 
	{
		final Optional< String > expectedContent = Optional.of( "3" );
		Assert.assertEquals( expectedContent, new NumberReplacementStrategyMultipleOfNone( ).applyStrategy( 3 ) );
	}

	/**
	 * Should return Optional object With number fifTeen as String When Apply StrategyMultipleOfNone
	 */
	@Test
	public void shouldReturnOptionalWithFifteenNumberAsStringWhenApplyStrategyMultipleOfNone( ) 
	{
		final Optional< String > expectedContent = Optional.of( "15" );
		Assert.assertEquals( expectedContent, new NumberReplacementStrategyMultipleOfNone( ).applyStrategy( 15 ) );
	}
	
}
