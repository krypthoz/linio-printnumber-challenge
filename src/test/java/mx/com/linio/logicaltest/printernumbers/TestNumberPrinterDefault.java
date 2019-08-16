package mx.com.linio.logicaltest.printernumbers;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

import mx.com.linio.logicaltest.printnumbers.imp.NumberPrinterDefault;
import mx.com.linio.logicaltest.printnumbers.imp.NumberReplacementStrategyMultipleOfFive;
import mx.com.linio.logicaltest.printnumbers.imp.NumberReplacementStrategyMultipleOfNone;
import mx.com.linio.logicaltest.printnumbers.imp.NumberReplacementStrategyMultipleOfThree;
import mx.com.linio.logicaltest.printnumbers.imp.NumberReplacementStrategyMultipleOfThreeAndFive;
import mx.com.linio.logicaltest.printnumbers.imp.NumberSequencePositiveRange;

/**
 * Test case suit for {@link NumberPrinterDefault}.
 *   
 * @author  vladimir fajardo ( krypthoz@gmail.com )
 * @version 1.0
 * @since   2019-08-15
 *
 */
public class TestNumberPrinterDefault 
{

	/**
	 * Holds exptected content by test cases.
	 */
	private static final String expected_content = 
			"1\r\n2\r\nLinio\r\n4\r\nIT\r\nLinio\r\n7\r\n8\r\nLinio\r\nIT\r\n" 				+
			"11\r\nLinio\r\n13\r\n14\r\nLinianos\r\n16\r\n17\r\nLinio\r\n19\r\nIT\r\n" 		+
			"Linio\r\n22\r\n23\r\nLinio\r\nIT\r\n26\r\nLinio\r\n28\r\n29\r\nLinianos\r\n" 	+
			"31\r\n32\r\nLinio\r\n34\r\nIT\r\nLinio\r\n37\r\n38\r\nLinio\r\nIT\r\n" 		+
			"41\r\nLinio\r\n43\r\n44\r\nLinianos\r\n46\r\n47\r\nLinio\r\n49\r\nIT\r\n" 		+
			"Linio\r\n52\r\n53\r\nLinio\r\nIT\r\n56\r\nLinio\r\n58\r\n59\r\nLinianos\r\n" 	+
			"61\r\n62\r\nLinio\r\n64\r\nIT\r\nLinio\r\n67\r\n68\r\nLinio\r\nIT\r\n" 		+
			"71\r\nLinio\r\n73\r\n74\r\nLinianos\r\n76\r\n77\r\nLinio\r\n79\r\nIT\r\n" 		+
			"Linio\r\n82\r\n83\r\nLinio\r\nIT\r\n86\r\nLinio\r\n88\r\n89\r\nLinianos\r\n" 	+
			"91\r\n92\r\nLinio\r\n94\r\nIT\r\nLinio\r\n97\r\n98\r\nLinio\r\nIT\r\n";
	
	/**
	 * Should ThrowsIllegalArgumentException When NumberSequence parameter Is Null.
	 */
	@Test( expected = IllegalArgumentException.class )
	public void shouldThrowsIllegalArgumentExceptionWhenNumberSequenceIsNull( )	
	
	{	
		final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
		new NumberPrinterDefault( ).print(
			null, 
			new PrintStream( outputContent ), 
			new NumberReplacementStrategyMultipleOfThreeAndFive( ),
			new NumberReplacementStrategyMultipleOfFive( ),
			new NumberReplacementStrategyMultipleOfThree( ),
			new NumberReplacementStrategyMultipleOfNone( ) );
	}
	
	/**
	 * Should print the expected content When all strtegies are set.
	 */
	@Test
	public void shouldPrintExpectedNumberReplacementWhenStrategiesAreSet( )	
	
	{	
		final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
		new NumberPrinterDefault( ).print( 
			new NumberSequencePositiveRange( 100 ), 
			new PrintStream(outputContent), 
			new NumberReplacementStrategyMultipleOfThreeAndFive( ), 
			new NumberReplacementStrategyMultipleOfFive( ), 
			new NumberReplacementStrategyMultipleOfThree( ) );
		String actualContent = outputContent.toString( );
		Assert.assertEquals( expected_content, actualContent );
	}
	
	/**
	 * Should Print expected content When Strategies Are Set UnOrdered.
	 */
	@Test
	public void shouldPrintExpectedNumberReplacementWhenStrategiesAreSetUnOrdered( )	
	
	{	
		final ByteArrayOutputStream outputContent = new ByteArrayOutputStream( );
		new NumberPrinterDefault( ).print( 
			new NumberSequencePositiveRange( 100 ), 
			new PrintStream( outputContent ),
			new NumberReplacementStrategyMultipleOfFive( ), 
			new NumberReplacementStrategyMultipleOfThreeAndFive( ), 
			new NumberReplacementStrategyMultipleOfThree( ) );
			
		String actualContent = outputContent.toString( );
		Assert.assertEquals( expected_content, actualContent );
	}
	
	/**
	 * Should Print Not Expected Content When Strategies Are Not Set
	 */
	@Test
	public void shouldPrintNotExpectedNumberReplacementWhenStrategiesAreNotSet( )	
	{
	final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
	new NumberPrinterDefault( ).print( 
			new NumberSequencePositiveRange( 100 ), 
			new PrintStream( outputContent ) );
		String actualContent = outputContent.toString( );
		Assert.assertNotEquals( expected_content, actualContent );
	}
	
	/**
	 * Should Print Not Expected Content When Strategy MultipleOfFiveAndThree Is Not Set
	 */
	@Test
	public void shouldPrintNotExpectedNumberReplacementWhenStrategyMultipleOfFiveAndThreeIsNotSet( ) 
	{
		final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
		new NumberPrinterDefault( ).print( 
				new NumberSequencePositiveRange( 100 ), 
			new PrintStream(outputContent), 
			new NumberReplacementStrategyMultipleOfFive( ), 
			new NumberReplacementStrategyMultipleOfThree( ) );
		
		String actualContent = outputContent.toString( );
		Assert.assertNotEquals( expected_content, actualContent );
	}
	
	/**
	 * Should Print Not Expected Content When Strategy MultipleOfFive Is Not Set
	 */
	@Test
	public void shouldPrintNotExpectedNumberReplacementWhenStrategyMultipleOfFiveIsNotSet( ) 
	{
		final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
		new NumberPrinterDefault( ).print( 
				new NumberSequencePositiveRange( 100 ), 
				new PrintStream(outputContent), 
				new NumberReplacementStrategyMultipleOfThreeAndFive( ), 
				new NumberReplacementStrategyMultipleOfThree( ) );
		String actualContent = outputContent.toString( );
		Assert.assertNotEquals( expected_content, actualContent );
	}
	
	/**
	 * Should Print Not Expected Content When Strategy MultipleOfThree Is Not Set
	 */
	@Test
	public void shouldPrintNotExpectedNumberReplacementWhenStrategyMultipleOfThreeIsNotSet( ) 
	{
		final ByteArrayOutputStream outputContent = new ByteArrayOutputStream( );
		new NumberPrinterDefault( ).print( 
				new NumberSequencePositiveRange( 100 ), 
				new PrintStream( outputContent ), 
				new NumberReplacementStrategyMultipleOfThreeAndFive( ), 
				new NumberReplacementStrategyMultipleOfFive( ) ); 
		String actualContent = outputContent.toString( );
		Assert.assertNotEquals( expected_content, actualContent );
	}
	
}