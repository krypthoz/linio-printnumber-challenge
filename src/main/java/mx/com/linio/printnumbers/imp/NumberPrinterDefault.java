package mx.com.linio.printnumbers.imp;

import java.io.PrintStream;
import java.util.Optional;

import mx.com.linio.printnumbers.api.BaseNumberPrinter;
import mx.com.linio.printnumbers.api.BaseNumberReplacementStrategy;
import mx.com.linio.printnumbers.api.NumberPrinter;
import mx.com.linio.printnumbers.api.NumberReplacementStrategy;
import mx.com.linio.printnumbers.api.NumberSequence;

/**
 * 
 * Default implemetation of {@link NumberPrinter }
 *  
 *  
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 *
 */
public class NumberPrinterDefault extends BaseNumberPrinter
{

	/**
	 * {@inheritDoc}
	 * @see mx.com.linio.printnumbers.api.NumberPrinter#print(mx.com.linio.printnumbers.api.NumberSequence, java.io.PrintStream, mx.com.linio.printnumbers.api.NumberReplacementStrategy[])
	 */
	@Override
	public void print( NumberSequence numberSequence, PrintStream printStream, NumberReplacementStrategy... strategies ) 
	{
		Optional.ofNullable( numberSequence )
				.orElseThrow( ( ) -> new IllegalArgumentException( "NumberSequence must not be null." ) )
				.getSequence( )
					.sorted( )
						.forEach( i -> 
						{
							ifNullSetDefaultNumberReplacementStrategy( strategies )
								.stream( )
								.sorted( new BaseNumberReplacementStrategy.ReplacementStrategyComparator( ) )
						.filter( s -> 
							s.applyStrategy( i )
							.isPresent( ) )
							.findFirst( )
							.ifPresent( 
									s -> ifNullSetDefaultPrintStream( printStream )
									.append( s.applyStrategy(i).get( ) )
									.append( System.getProperty( "line.separator" ) ) );
						});

		printStream.flush( );
		printStream.close( );
	}
}