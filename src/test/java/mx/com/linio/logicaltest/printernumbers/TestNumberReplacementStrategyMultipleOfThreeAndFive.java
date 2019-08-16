package mx.com.linio.logicaltest.printernumbers;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

import mx.com.linio.logicaltest.printnumbers.imp.NumberReplacementStrategyMultipleOfThreeAndFive;

/**
 * Test case suit for {@link NumberReplacementStrategyMultipleOfThreeAndFive}.
 *   
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 *
 */	
public class TestNumberReplacementStrategyMultipleOfThreeAndFive 
{

	/**
	 * Holds expected token by test cases
	 */
	private static final Optional< String > expected_content = Optional.of( "Linianos" );
	
	/**
	 * Should return Optional With Linanios Word As String When ApplyStrategyMultipleOfThreeAndFive To Number Fifteen
	 */
	@Test
	public void shouldReturnOptionalWithLinaniosWordAsStringWhenApplyStrategyMultipleOfThreeAndFiveToNumberFifteen( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfThreeAndFive( ).applyStrategy( 15 ) );
	}

	/**
	 * Should return Optional With Linanios Word As String When ApplyStrategyMultipleOfThreeAndFive To Number Thirty
	 */
	@Test
	public void shouldReturnOptionalWithLinaniosWordAsStringWhenApplyStrategyMultipleOfThreeAndFiveToNumberThirty( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfThreeAndFive( ).applyStrategy( 30 ) );
	}
	
	/**
	 * Should return Optional With Linanios Word As String When ApplyStrategyMultipleOfThreeAndFive To Number Fourty Five
	 */
	@Test
	public void shouldReturnOptionalWithLinaniosWordAsStringWhenApplyStrategyMultipleOfThreeAndFiveToNumberFourtyFive( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfThreeAndFive( ).applyStrategy( 45 ) );
	}
	
	/**
	 * Should return Optional With Linanios Word As String When ApplyStrategyMultipleOfThreeAndFive To Number Sixty
	 */
	@Test
	public void shouldReturnOptionalWithLinaniosWordAsStringWhenApplyStrategyMultipleOfThreeAndFiveToNumberSixty( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfThreeAndFive( ).applyStrategy( 60 ) );
	}
	
	/**
	 * Should return Optional With Linanios Word As String When ApplyStrategyMultipleOfThreeAndFive To Number Seventy Five
	 */
	@Test
	public void shouldReturnOptionalWithLinaniosWordAsStringWhenApplyStrategyMultipleOfThreeAndFiveToNumberSeventyFive( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfThreeAndFive( ).applyStrategy( 75 ) );
	}

	/**
	 * Should return Optional With Linanios Word As String When ApplyStrategyMultipleOfThreeAndFive To Ninety
	 */
	@Test
	public void shouldReturnOptionalWithLinaniosWordAsStringWhenApplyStrategyMultipleOfThreeAndFiveToNumberNinety( ) 
	{
		Assert.assertEquals( expected_content, new NumberReplacementStrategyMultipleOfThreeAndFive( ).applyStrategy( 90 ) );
	}
	
	/**
	 * Should return Optional.empty When ApplyStrategyMultipleOfThreeAndFive to number ninety seven
	 */
	@Test
	public void shouldReturnOptionalEmptyWhenApplyStrategyNoValidMultipleOfThreeAndFiveToNumberNinetyNineNumber( ) 
	{
		Assert.assertNotEquals( expected_content, new NumberReplacementStrategyMultipleOfThreeAndFive( ).applyStrategy( 99 ) );
	}
	
}
