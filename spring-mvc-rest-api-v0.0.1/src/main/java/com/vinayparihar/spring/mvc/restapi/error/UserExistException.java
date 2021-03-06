/**
 * 
 */
package com.vinayparihar.spring.mvc.restapi.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author VinayParihar
 * @alphaX @date Jun 1, 2020 @time 10:40:41 PM
 */

@ResponseStatus( value = HttpStatus.UNPROCESSABLE_ENTITY)
public class UserExistException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1262183883670789714L;

	private static final Logger LOGGER = LoggerFactory.getLogger(UserExistException.class);

	public UserExistException(String string) {
		
		super(string);
		LOGGER.error("Throwing Error form UserExistException : " + string);
	}
}
