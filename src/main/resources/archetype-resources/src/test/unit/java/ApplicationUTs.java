package $package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Simple Application unit tests
 */
class ApplicationUTs {
	@DisplayName("Should return the same value passed in constructor")
	@Test
	void shouldReturnTheSameValuePassedInConstructor() {
		String javaApp = "javaApp";
		Assertions.assertEquals(javaApp, new Application(javaApp).name());
	}
}
