package com.app.payroll.errorhandle;

public class NotFoundException extends RuntimeException {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException(Long id, Object obj) {
    super("Could not find "+ obj.getClass().toString() +" "+id);
  }
}