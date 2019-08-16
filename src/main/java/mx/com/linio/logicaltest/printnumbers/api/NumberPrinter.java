package mx.com.linio.logicaltest.printnumbers.api;

import java.io.PrintStream;

/**
* 
* This interface define the contract for a component 
* that compute a {@link NumberSequence} and replace the
* numbers which has configured with a token based on  
* {@link NumberReplacementStrategy}. The output sequence
* is printed on the {@link PrintStream}.	
* 
* 
* 
* @author  vladimir fajardo ( krypthoz@gmail.com )
* @version 1.0
* @since   2019-08-15
*
* @see {@link NumberPrinter}
* @see {@link PrintStream}
* @see {@link NumberReplacementStrategy}
* @see {@link NumberSequence}
*/
public interface NumberPrinter 
{
	/**
	 * Replace sequence of numbers defined on {@link NumberSequence} based on the {@link NumberReplacementStrategy}. 
	 * The output sequence is printed on the {@link PrintStream}   
	 * 
	 * For example, sequence number from One to Six and strategy
	 * that replaces even numbers with the <tt>Even</tt> token, the output would be as follows:
	 * 1,Even,3,Even,5,Even
	 * 
	 * <ul>
	 * 	<li>If {@link NumberSequence} is null, IllegarArguentException will be throw.
	 * 	<li>If {@link PrintStream} is null, PrintStream( System.out ) will be set by default. 
	 * 	<li>If {@link NumberReplacementStrategy} is null, no replacement Strategy will be set by default.  
	 * </ul>
	 * @param numberSequence sequence of numbers to compute
	 * @param printStream output object where content is printed
	 * @param strategies the replacement strategies
	 * @throws IllegalArgumentException if NumberSequence para is null
	 */
	public void print( NumberSequence numberSequence, PrintStream printStream, NumberReplacementStrategy... strategies );
	
}
