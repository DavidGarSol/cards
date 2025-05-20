package com.midominio.cards.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.midominio.cards.exception.UnauthorizedException;
import com.midominio.cards.model.ErrorResponse;
import com.midominio.cards.model.ErrorType;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ControllerAdvice {
	
	private static final Logger LOG = LoggerFactory.getLogger(ControllerAdvice.class);
	
	@ExceptionHandler(exception = UnauthorizedException.class)
	@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
	public ErrorResponse handlerUnauthorizedException(
			HttpServletRequest req, UnauthorizedException ex) {
		return buildErrorResponse(HttpStatus.UNAUTHORIZED.value(),req, ex, ErrorType.ERROR);
	}
	
	private ErrorResponse buildErrorResponse(int code, HttpServletRequest req, Exception ex, ErrorType errorType) {
		ErrorResponse response = new ErrorResponse();
		response.setCode(code);
		response.setLocation(req.getRequestURI());
		response.setDetails(ex.getMessage());
		response.setType(errorType);
		
		LOG.error(response.toString());
		
		return response;
	}

}