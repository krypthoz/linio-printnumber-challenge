package mx.com.linio.printnumbers.imp;

import java.util.Optional;

import mx.com.linio.printnumbers.api.BaseNumberReplacementStrategy;
import mx.com.linio.printnumbers.api.NumberReplacementStrategy;

/**
 * 
 * Concrete implementation of {@link NumberReplacementStrategy }.
 * This class replace a number by Linio string if number is multiple of Three.
 *  
 *  
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 *
 */
public class NumberReplacementStrategyMultipleOfThree extends BaseNumberReplacementStrategy
{

	/**
	 * {@inheritDoc}
	 * @see {@link NumberReplacementStrategy#applyStrategy(int)}
	 */
	@Override
	public Optional< String > applyStrategy( int number ) 
	{
		return super.replaceWithToken( number, getMultiple( ) );
	}

	/**
	 * {@inheritDoc}
	 * @see {@link BaseNumberReplacementStrategy#getToken()}
	 */
	@Override
	protected Optional< String > getToken(  ) 
	{
		return Optional.of( "Linio" );
	}

	/**
	 * {@inheritDoc}
	 * @see {@link BaseNumberReplacementStrategy#getMultiple()}
	 */
	protected Integer getMultiple( )
	{
		return 3;
	}
	
}
