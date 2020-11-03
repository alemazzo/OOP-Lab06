package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends IllegalStateException {

	@Override
	public String toString() {
		return "TransactionsOverQuotaException []";
	}

	public TransactionsOverQuotaException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionsOverQuotaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TransactionsOverQuotaException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	public TransactionsOverQuotaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5186015990336694793L;

}
