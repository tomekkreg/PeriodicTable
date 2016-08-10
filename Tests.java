import java.util.*;

public class Tests {
	List< TestData > tests = new ArrayList< TestData >();
	Tests( ) {
		tests.add( new TestData( "Magnesium" , "Ma" , true , "Ae" , 36 ) );
		tests.add( new TestData( "Magnesium" , "Am" , true, "Ae" , 36 ) );
		tests.add( new TestData( "Magnesium" , "Am" , true, "Ae" , 36 ) );
		tests.add( new TestData( "Xenon" , "Nn" , true, "En" , 8 ) );
		tests.add( new TestData( "Xenon" , "Xx" , false, "En" , 8 ) );
		tests.add( new TestData( "Xenon" , "Oo" , false, "En" , 8 ) );
		tests.add( new TestData( "Spenglerium" , "Ee" , true, "Ee" , 49 ) );
		tests.add( new TestData( "Zeddemorium" , "Zr" , true, "Dd" , 36 ) );
		tests.add( new TestData( "Venkmine" , "Kn" , true, "Ee" , 24 ) );
		tests.add( new TestData( "Stantzon" , "Zt" , false, "An" , 21 ) );
		tests.add( new TestData( "Melintzum" , "Zt" , false, "Ei" , 36 ) );
		tests.add( new TestData( "Tullium" , "Ty" , false, "Im" , 14 ) );
		tests.add( new TestData( "Gozerium" , "Ei" , true, "Ei" , 28 ) );
		tests.add( new TestData( "Slimyrine" , "Ie" , true, "Ie" , 32 ) );
		tests.add( new TestData( "Zuulon" , "Uu" , true, "Ln" , 11 ) );
		tests.add( new TestData( "Zuulon" , "U" , false, "Ln" , 11 ) );
		tests.add( new TestData( "Z" , "Zz" , false, "" , 0 ) );
	}
}
