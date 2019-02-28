package test_temperatureConversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import temperature_Conversion.TemperatureConversion;

class TestTemperatureConversion {

	@Test
	void testCelsiusToFarenheit() {
		assertThrows(IllegalArgumentException.class, ()-> {TemperatureConversion.celsiusToFarenheit(-274);});
		assertEquals(32.0, TemperatureConversion.celsiusToFarenheit(0));
	}

}
