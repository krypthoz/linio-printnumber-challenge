package mx.com.linio.printernumbers;

import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

import mx.com.linio.printnumbers.imp.NumberSequencePositiveRange;

/**
 * Test case suit for {@link NumberSequencePositiveRange}.
 *   
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 *
 */
public class TestNumberSequencePositiveRange 
{
	/**
	 * Should ThrowIllegalArgumentException When Create an Instance With Negative Number
	 */
	@Test( expected = IllegalArgumentException.class )
	public void shouldThrowIllegalArgumentExceptionWhenCreateInstanceWithNegativeNumber( )
	{
		new NumberSequencePositiveRange( -1 );
	}
	
	/**
	 * should return NumberSequence initialized with range from One To OneHundred When Creates an Instance With OneHundred As end Number Sequence
	 */
	@Test
	public void shouldReturnNumberSequenceFromOneToOneHundredWhenCreatesInstanceWithOneHundredAsEndNumberSequence( )
	{
		Assert.assertArrayEquals(
				IntStream.rangeClosed( 1, 100 ).toArray( ), 
					new NumberSequencePositiveRange( 100 ).getSequence( ).toArray( ) );
	}
}
