package mx.com.linio.logicaltest.printnumbers.api;

import java.util.Optional;

/**
 * This interface define the contract for a component wich implements a replacement strategy.
 * A number will be replaced by a token if it meets the multiple of <tt>n</tt>, 
 * depending on the implementation of the strategy, otherwise Optional.empty() will be return. 
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 */
public interface NumberReplacementStrategy 
{

	/**
	 * A number will be replaced by a token if it meets the multiple of <tt>n</tt> 
	 * depending on the implementation of the strategy, otherwise Optional.empty() will be return. 
	 *
	 * @param candidate number to be replaced
	 * @return a token if number meets with the multiple of n, otherwise Optional.empty() will be return.
	 */
	public Optional< String > applyStrategy( int number );
}
