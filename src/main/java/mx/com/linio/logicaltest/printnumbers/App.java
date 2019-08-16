package mx.com.linio.logicaltest.printnumbers;

import java.io.PrintStream;

import mx.com.linio.logicaltest.printnumbers.imp.NumberPrinterDefault;
import mx.com.linio.logicaltest.printnumbers.imp.NumberReplacementStrategyMultipleOfFive;
import mx.com.linio.logicaltest.printnumbers.imp.NumberReplacementStrategyMultipleOfThree;
import mx.com.linio.logicaltest.printnumbers.imp.NumberReplacementStrategyMultipleOfThreeAndFive;
import mx.com.linio.logicaltest.printnumbers.imp.NumberSequencePositiveRange;

/**
 * This class is the entry point to the program. 
 *
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 *
 */
public class App
{
	/**
	 * Entry point method
	 * @param args  
	 */
	public static void main(String[] args) {
		new NumberPrinterDefault( )
			.print( new NumberSequencePositiveRange( 100 ), 
					new PrintStream( System.out ),
					new NumberReplacementStrategyMultipleOfThreeAndFive( ), 
					new NumberReplacementStrategyMultipleOfFive( ), 
					new NumberReplacementStrategyMultipleOfThree( ) ); 
	}
	
}
