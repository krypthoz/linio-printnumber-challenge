package mx.com.linio.printnumbers.imp;

import java.util.Optional;

import mx.com.linio.printnumbers.api.BaseNumberReplacementStrategy;
import mx.com.linio.printnumbers.api.NumberReplacementStrategy;

/**
 * 
 * Concrete implementation of {@link NumberReplacementStrategy }.
 * This class replace a number by its string representation. Does not verify if it is multiple of any number.
 *  
 *  
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 *
 */
public class NumberReplacementStrategyMultipleOfNone extends BaseNumberReplacementStrategy 
{

	/**
	 * {@inheritDoc}
	 * @see {@link NumberReplacementStrategy#applyStrategy(int)}
	 */
	@Override
	public Optional< String > applyStrategy( int number )
	{
		return this.replaceWithToken( number, -1 );
	}
	
	/**
	 * 
	 * Replace a number by its string representation. Does not verify if it is multiple of any number
	 * @see {@link BaseNumberReplacementStrategy#replaceWithToken(int, int)}
	 * 
	 */
	@Override
	protected Optional< String > replaceWithToken( int number, int module ) 
	{
		return Optional.of( ( String.valueOf( number ) ) );
	}
	
	/**
	 * {@inheritDoc}
	 * @see {@linkBaseNumberReplacementStrategy#getToken()}
	 */
	@Override
	public Optional< String > getToken( ) 
	{
		return Optional.empty( );
	}
	
	/**
	 * {@inheritDoc}
	 * @see {@link BaseNumberReplacementStrategy#getMultiple()}
	 */
	protected Integer getMultiple( )
	{
		return -1;
	}
	
}
