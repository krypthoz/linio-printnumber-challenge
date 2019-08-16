package mx.com.linio.printnumbers;

import java.io.PrintStream;

import mx.com.linio.printnumbers.imp.NumberPrinterDefault;
import mx.com.linio.printnumbers.imp.NumberReplacementStrategyMultipleOfFive;
import mx.com.linio.printnumbers.imp.NumberReplacementStrategyMultipleOfThree;
import mx.com.linio.printnumbers.imp.NumberReplacementStrategyMultipleOfThreeAndFive;
import mx.com.linio.printnumbers.imp.NumberSequencePositiveRange;

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
					//Using System.out only for demonstration purpose
					new PrintStream( System.out ),
					new NumberReplacementStrategyMultipleOfThreeAndFive( ), 
					new NumberReplacementStrategyMultipleOfFive( ), 
					new NumberReplacementStrategyMultipleOfThree( ) ); 
	}
	
}
