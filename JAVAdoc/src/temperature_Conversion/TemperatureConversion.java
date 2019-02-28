package temperature_Conversion;
/**
 * The temperature Conversion Application prints a table converting Celsius to Farenheit degrees
 * 
 * @see<A href="../src/temperature_Conversion/TemperatureConversion.java">Java source code </A>
 * 
 * @author Leo Castillo <A href="mailto:Braulio.c.medina@gmail.com>Braulio.c.medina@gmail.com</A>" 
 * @version V1.0, 2/19/2019
 * 
*/
public class TemperatureConversion {
	/**
	 * 
	 * The main method print the celsius to Farenhiet conversion table
	 * 
	 * The bounds of the table range from -50 C to +50C in 1- increments
	 * @param args not usedn
	 */
	
	public static void main(String[] args) {
		final double TABLE_BEGIN = -50;
		final double TABLE_END = 50;
		final double TABLE_STEP = 10;
		double celsius;
		double farenheit;
		System.out.println("TEMPERATURE CONVERSION");
		System.out.println("-------------------------");
		System.out.println("CELSIUS       FARENHEIT");
		for(celsius = TABLE_BEGIN; celsius <= TABLE_END; celsius += TABLE_STEP) {
			farenheit = celsiusToFarenheit(celsius);
		
		}
	}	
	
	
	
/**
 * Convert a temperature to celsius to Fahrenheit
 * @param celsius: Temperature in Celsius degrees
 * @return the temperature to Farenheit
 * @throws java.lanf.illegalArgumentException indicates that celsius is less than smallest celsius temperature(-273.16);

 */

	public static double celsiusToFarenheit(double celsius) {
		final double MINIMUM_CELSIUS = -273.16;
		if(celsius < MINIMUM_CELSIUS) {
			throw new IllegalArgumentException("Argument " + celsius + " to low");
		}
		return (9.0 / 5.0) * celsius +32;
	}

}
