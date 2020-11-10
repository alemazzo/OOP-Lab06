package it.unibo.oop.lab.exception2;



public class NotEnoughFoundsException extends IllegalStateException {



	/**
	 * 
	 */
	private static final long serialVersionUID = -1159808475879283028L;
	
	@Override
	public String toString() {
		return "NotEnoughFoundsException []";
	}

	public NotEnoughFoundsException() {
		super();
	}

}
