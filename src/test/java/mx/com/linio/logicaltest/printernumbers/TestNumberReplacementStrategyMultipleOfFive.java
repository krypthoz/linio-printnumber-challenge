package mx.com.linio.logicaltest.printernumbers;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

import mx.com.linio.printnumbers.imp.NumberReplacementStrategyMultipleOfFive;

/**
 * Test case suit for {@link NumberReplacementStrategyMultipleOfFive}.
 *   
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 *
 */
public class TestNumberReplacementStrategyMultipleOfFive 
{

	/**
	 * holds expected token by test cases
	 */
	private static final Optional< String > expected_content = Optional.of( "IT" );
	
	/**
	 * should return Optional With IT Word as String When ApplyStrategyMultipleOfFive to number five
	 */
	@Test
	public void shouldReturnOptionalWithITWordAsStringWhenApplyStrategyMultipleOfFiveToNumberFive( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfFive( ).applyStrategy( 5 ) );
	}

	/**
	 * Should return Optional With IT Word as String When ApplyStrategyMultipleOfFive to number teen
	 */
	@Test
	public void shouldReturnOptionalWithITWordAsStringWhenApplyStrategyMultipleOfFiveToNumberTen( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfFive( ).applyStrategy( 10 ) );
	}
	
	/**
	 * Should return Optional With IT Word as String When ApplyStrategyMultipleOfFive to number twenty
	 */
	@Test
	public void shouldReturnOptionalWithITWordAsStringWhenApplyStrategyMultipleOfFiveToNumberTwenty( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfFive( ).applyStrategy( 20 ) );
	}
	
	/**
	 * Should return Optional With IT Word as String When ApplyStrategyMultipleOfFive to number twenty five
	 */
	@Test
	public void shouldReturnOptionalWithITWordAsStringWhenApplyStrategyMultipleOfFiveToNumberTwentyFive( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfFive( ).applyStrategy( 25 ) );
	}

	/**
	 * Should return Optional With IT Word as String When ApplyStrategyMultipleOfFive to number thirtyFive
	 */
	@Test
	public void shouldReturnOptionalWithITWordAsStringWhenApplyStrategyMultipleOfFiveToNumberThirtyFive( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfFive( ).applyStrategy( 35 ) );
	}

	/**
	 * Should return Optional.empty When ApplyStrategyMultipleOfFive to NinetyNine Numbe
	 */
	@Test
	public void shouldReturnOptionalEmptyWhenApplyStrategyAsNoValidMultipleOfFiveToNumberNinetyNine( ) 
	{
		Assert.assertNotEquals( expected_content, new NumberReplacementStrategyMultipleOfFive( ).applyStrategy( 99 ) );
	}
	
}
