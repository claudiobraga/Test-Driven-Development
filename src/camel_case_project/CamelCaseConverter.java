package camel_case_project;

import java.util.Locale;

public class CamelCaseConverter {

	public String convert(String name) {
		return name.substring(0, 1).toUpperCase(Locale.ROOT) + name.substring(1).toLowerCase();
		// the zero is inclusive, it gets the first character(L) but not the znd(i)
	}
}
