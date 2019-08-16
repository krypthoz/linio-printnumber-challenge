package mx.com.linio.logicaltest.printnumbers.api;

import java.util.Comparator;
import java.util.Optional;

/**
 * Abstract class which implements a {@link NumberReplacementStrategy} contract.
 * This class holds commons methods for concrete implementations of {@linkplain NumberReplacementStrategy}. 
 *
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 * 
 * @see {@link NumberReplacementStrategy}
 */
public abstract class BaseNumberReplacementStrategy implements NumberReplacementStrategy
{
	/**
	 *  Return a token wrapped on Optional object when <tt>number</tt>%<tt>module</tt> is equals zero, otherwise return Optional.empty
	 *   
	 * @param number 
	 * @param module
	 * @return a token wrapped on Optional object when <tt>number</tt>%<tt>module</tt> is equals zero, otherwise return Optional.empty
	 */
	protected Optional< String > replaceWithToken( int number, int module )
	{
		//1 if Rule
		if( number%module == 0 ) 
		{
			return this.getToken( );
		}
		return Optional.empty( );
	}
	
	/**
	 * Concrete implementation of {@link Comparator} contract.
	 * The implemetations uses {@link BaseNumberReplacementStrategy#getMultiple() to sort descending.
	 * @author  vladimir fajardo ( krypthoz@gmail.com )
     * @version 1.0
     * @since   2019-08-15
	 *
	 */
	public static class ReplacementStrategyComparator implements Comparator<NumberReplacementStrategy> 
	{
		@Override
		public int compare( NumberReplacementStrategy strategy1, NumberReplacementStrategy strategy2 ) 
		{
			return ( ( BaseNumberReplacementStrategy ) strategy2 ).getMultiple( ).compareTo( 
				   ( ( BaseNumberReplacementStrategy ) strategy1).getMultiple()  );
		}
	}
	
	/**
	 * Should returns a token depending on the concrete implementation of {@link NumberReplacementStrategy}.
	 * 
	 * This token will be used on replacing number process.
	 * @return a token wrapped on Optional object
	 */
	protected abstract Optional< String > getToken( );
	
	/**
	 * Should returns the multiple value depending on the concrete implementation of {@link NumberReplacementStrategy}.
	 * @return the multiple that evaluates the strategy.
	 */
	protected abstract Integer getMultiple();
	
}
