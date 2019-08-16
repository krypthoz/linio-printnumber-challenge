package mx.com.linio.logicaltest.printnumbers.imp;

import java.util.Optional;
import java.util.stream.IntStream;

import mx.com.linio.logicaltest.printnumbers.api.NumberSequence;

/**
 * Concrete implementation of {@link NumberSequence}
 *
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 *
 */
public class NumberSequencePositiveRange implements NumberSequence 
{


	/**
	 * holds end number in the range
	 */
	private int endNumberOfSequence;
	
	/**
	 * creates new instance of {@link NumberSequencePositiveRange}
	 * @param the end number of the range
	 * @throws IllegalArgumentException if endNumberOfSequence is not greater than 0
	 */
	public NumberSequencePositiveRange( int endNumberOfSequence ) 
	{
		setEndNumberOfSequence( endNumberOfSequence );
	}

	/**
	 * 
	 * {@inheritDoc}
	 * <br/>
	 * The sequence of numbers will be from 1 to endNumber passed by constructor or setter method.
	 * 
	 * @see {@link NumberSequence#getSequence()
	 * @see {@link IntStream}
	 *
	 */
	@Override
	public IntStream getSequence( ) 
	{
		return IntStream.rangeClosed( 1, this.endNumberOfSequence );
	}

	/**
	 * Set new value of endNumberOfSequence
	 * @param endNumberOfSequence
	 * @throws IllegalArgumentException if endNumnerOfSequence less than 0
	 *
	 */
	public void setEndNumberOfSequence( int endNumberOfSequence )
	{
		this.endNumberOfSequence = Optional.of( endNumberOfSequence )
				.filter( n -> n > 0 )
				.orElseThrow( ( ) -> new IllegalArgumentException( "Number must be greater than cero." ) );
	}
	
}
