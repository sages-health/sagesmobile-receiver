
package org.rapidsms.java.core.parser.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Daniel Myung dmyung@dimagi.com
 * @created Jan 23, 2009
 * Summary:
 */
public class StringInterpreter implements IParseInterpreter {
	/* (non-Javadoc)
	 * @see org.rapidsms.java.core.parser.interpreter.IParseInterpreter#interpretValue(java.lang.String)
	 */
		
	public StringInterpreter () {		
	}
	
	public Object interpretValue(String token) {
		return token;
	}
}