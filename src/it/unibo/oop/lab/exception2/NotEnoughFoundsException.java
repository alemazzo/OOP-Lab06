package it.unibo.oop.lab.exception2;



public class NotEnoughFoundsException extends IllegalStateException {

	@Override
	public String toString() {
		return "NotEnoughFoundsException []";
	}

	public NotEnoughFoundsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NotEnoughFoundsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughFoundsException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughFoundsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1159808475879283028L;

}
