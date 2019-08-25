package mx.com.linio.printnumbers.api;

import java.io.PrintStream;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mx.com.linio.printnumbers.imp.NumberReplacementStrategyMultipleOfNone;

/**
 * Abstract class which implements a {@link NumberPrinter} contract.
 * This class holds commons methods for concrete implementations of {@linkplain NumberPrinter}. 
 * Its strongly recommended extend this class for concrete implementations of {@link NumberPrinter}. 
 *
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 *
 */
public abstract class BaseNumberPrinter implements NumberPrinter 
{
	/**
	 * holds default printStream 
	 */
	protected  static final PrintStream default_print_stream = System.out; 

	/**
	 * holds default number sequence
	 */
	protected static final NumberReplacementStrategy default_number_replacement_strategy = new NumberReplacementStrategyMultipleOfNone( );

	/**
	 * Set default {@link PrintStream} if para is null.
	 * Default PrintStream is configured as {@link System.out}
	 * @param printStream
	 * @return the PrintStream by default if null, other return orginal
	 */
	protected PrintStream ifNullSetDefaultPrintStream( PrintStream printStream )
	{
		return Optional.ofNullable( printStream ).orElse( default_print_stream );
	}
	
	/**
	 * Concatenates the default {@link NumberReplacementStrategy} which does not replace the numbers.
	 * Default strategy will be used when other stretegies does not match or were not passes strategies as parameter.
	 * 
	 * @param strategies
	 * @return new list of {@link NumberReplacementStrategy} that includes default strategy.
	 * 
	 * @see {@link NumberReplacementStrategyMultipleOfNone}
	 * 
	 */
	protected List<NumberReplacementStrategy> ifNullSetDefaultNumberReplacementStrategy( NumberReplacementStrategy... strategies )
	{
		return Stream.concat( Stream.of( default_number_replacement_strategy ), Stream.of( strategies)  ).collect(Collectors.toList());  
	}
	
}