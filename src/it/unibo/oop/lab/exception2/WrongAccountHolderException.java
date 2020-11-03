package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends IllegalStateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7190620326792084901L;

	public WrongAccountHolderException() {
		super();
		// TODO Auto-generated constructor stub
	}



	public WrongAccountHolderException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public WrongAccountHolderException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public WrongAccountHolderException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	/**
     * 
     * @return the string representation of instances of this class
     */
    @Override
    public String toString() {
        return "Wrong Account";
    }

    @Override
    public String getMessage() {
        return this.toString();
    }
	

}
