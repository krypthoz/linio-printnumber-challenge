package mx.com.linio.logicaltest.printnumbers.imp;

import java.util.Optional;

import mx.com.linio.logicaltest.printnumbers.api.BaseNumberReplacementStrategy;
import mx.com.linio.logicaltest.printnumbers.api.NumberReplacementStrategy;

/**
 * 
 * Concrete implementation of {@link NumberReplacementStrategy }.
 * This class replace a number by IT string if number is multiple of Five.
 *  
 *  
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 *
 */
public class NumberReplacementStrategyMultipleOfFive extends BaseNumberReplacementStrategy 
{

	/**
	 * {@inheritDoc}
	 * @see {@link NumberReplacementStrategy#applyStrategy(int)}
	 */
	@Override
	public Optional< String > applyStrategy( int number ) 
	{
		return this.replaceWithToken( number, 5 );
	}

	/**
	 * {@inheritDoc}
	 * @see {@linkBaseNumberReplacementStrategy#getToken()}
	 */
	@Override
	protected Optional<String> getToken( ) 
	{
		return Optional.of( "IT" );
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see {@link BaseNumberReplacementStrategy#getMultiple()}
	 */
	protected Integer getMultiple( )
	{
		return 5;
	}
	
}
