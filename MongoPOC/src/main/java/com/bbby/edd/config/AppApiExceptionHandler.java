package com.bbby.edd.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bbby.edd.dto.ExceptionResModel;
import com.bbby.edd.exception.ManagerIdNotFoundException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class AppApiExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ManagerIdNotFoundException.class)
	public ResponseEntity<ExceptionResModel> handleException(final Exception exception) {

		final ExceptionResModel exceptionResModel = new ExceptionResModel();
		exceptionResModel.setMessage(exception.getMessage());
		log.debug(exception.getMessage());

		return new ResponseEntity<>(exceptionResModel, HttpStatus.UNPROCESSABLE_ENTITY);
	}

	
	
}
