package mx.com.linio.logicaltest.printnumbers.api;

import java.util.stream.IntStream;

/**
 * This interface define the contract for a component which implements a concrete sequence of numbers.  
 * 
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 * 
 * @see {@link IntStream}
 */
public interface NumberSequence 
{
	
	/**
	 * Return a sequence of numbers.
	 *
	 * @return the sequence of numbers
	 */
	public IntStream getSequence( );
}
