package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends IllegalStateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7190620326792084901L;

	public WrongAccountHolderException() {
		super();
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
