import java.util.*;

public class Periodic {

	Periodic( ) {
		List< TestData > tests = new Tests( ).tests;
		int i = 1;
		for ( TestData test : tests) {
			Boolean b = symbolValication( test.name , test.symbol );
			System.out.printf( "Test %2d" , i++ );
			String s = " name: {" + test.name + "}";
			if ( test.valid != b ) {
						System.out.printf( "%s    symbol: {%s}  valid: {%b}  symbolValication: {%b}" , s , test.symbol , test.valid , b );
						s = "";
			}
			if ( !test.first.equals( ( String )symbolFirstAlpha( test.name ) ) ) {
						System.out.printf( "%s    first: {%s}  calculatedFisrt: {%s}" , s , test.first , symbolFirstAlpha( test.name ) );
						s = "";
			}
			if ( test.number != numberOfValidSymbols(  test.name ) ) {
						System.out.printf( "%s    number: {%d}  calculatedNumber: {%d}" , s , test.number , numberOfValidSymbols(  test.name ) );
						s = "";
			}
			if ( s != "") s = "  All results OK!";
			System.out.println( s );
		}
	}
	// Function to validate the symbol
	Boolean symbolValication( String nameCamel , String symbolCamel ) {	
		if ( symbolCamel.length( ) != 2 ) return false;				// invalid length of the symbol, avoids exception
		int l = nameCamel.length( );
		String name = nameCamel.toLowerCase( );						// all letters to lower case
		String symbol = symbolCamel.toLowerCase( );					// all letters to lower case
		int positionOfTheFirstEqual;
		// if the first character of the symbol is equal to one of the first (length-1) characters of the element name
		return ( positionOfTheFirstEqual = name.substring( 0 , l - 1 ).indexOf( symbol.charAt( 0 ) ) ) >= 0 &&
		// and the second character of the symbol is equal to one of remaining characters of the element name
				name.substring( positionOfTheFirstEqual + 1 , l ).contains( Character.toString( symbol.charAt( 1 ) ) );
	}
	String symbolFirstAlpha( String nameCamel ) {
		String name = nameCamel.toLowerCase( );						// all letters to lower case
		int l = name.length( );
		if ( l < 2 ) return "";										// no valid symbol possible
		char c0 = name.charAt( 0 );
		int i0 = 0;
		// finds the first character of the symbol being the alphabetically lowest among the first (length-1) characters of the element name
		for ( int i = 1 ; i < l - 1 ; i++ ) {
			if ( name.charAt( i ) < c0 ) {
				c0 = name.charAt( i );
				i0 = i;
			}
		}
		// finds the second character of the symbol being the alphabetically lowest among the remaining characters of the element name
		char c1 = name.charAt( i0 + 1 );
		for ( int i = i0 + 2 ; i < l ; i++ ) {
			if ( name.charAt( i ) < c1 ) { c1 = name.charAt( i ); }
		}
		// concatenates the two characters with the first set to upper case
		return String.valueOf( c0 ).toUpperCase() + String.valueOf( c1 );
	}
	int numberOfValidSymbols( String nameCamel ) {
		String name = nameCamel.toLowerCase( );						// all letters to lower case
		int l = name.length( );
		if ( l < 2 ) return 0;										// no valid symbol possible
		Set< String > symbols = new HashSet< String >( );
		// adds to the set all possible symbols avoiding duplicates (thanks to the Set functionality)
		for ( int i0 = 0 ; i0 < l - 1 ; i0++ ) {
			char c0 = name.charAt( i0 );
			for ( int i1 = i0 + 1 ; i1 < l ; i1++ ) symbols.add( String.valueOf( c0 ) + name.substring( i1 , i1 + 1 ) );
		}
		// returns the number of all distinct symbols
		return symbols.size( );
	}
	public static void main( String[ ] args ) { new Periodic( ); }
}