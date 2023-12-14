package camel_case_project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CamelCaseConverterTest {
	
	private CamelCaseConverter camelCase;
	
	@Before
	public void setup() {
		camelCase = new CamelCaseConverter();
	}
	
	@Test
	public void shouldApplyCamelCaseInUniqueName()throws Exception {
		assertEquals("Lionel", camelCase.convert("lionel"));
	}
	
	@Test
	public void shouldApplyCamelCaseInUniqueNameMixedInUpperAndLower()throws Exception {
		assertEquals("Lionel", camelCase.convert("lIONel"));
	}
	

}
