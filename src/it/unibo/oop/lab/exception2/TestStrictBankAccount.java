package it.unibo.oop.lab.exception2;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
    @Test
    public void testBankOperations() {
    	
    	BankAccount b1 = new StrictBankAccount(1, 10000, 10);
    	BankAccount b2 = new StrictBankAccount(2, 10000, 10);
    	
    	//Check wrong User
    	try {
    		b1.deposit(2, 100);
    		Assert.fail();
    	} catch (Exception e){
    		Assert.assertNotNull(e);
    	}
    	
    	
    	//Check transactions
    	for(int i = 0; i < 10; i++) {
    		try{
    			b1.depositFromATM(1, 10);
    		} catch (Exception e) {
    			Assert.fail();
    		}    		
    	}
    	
    	
    	try{
			b1.depositFromATM(1, 10);
			Assert.fail();
		} catch (Exception e) {
			Assert.assertNotNull(e);
		}   
		
        /*
         * 1) Creare due StrictBankAccountImpl assegnati a due AccountHolder a
         * scelta, con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
         * 
         * 2) Effetture un numero di operazioni a piacere per verificare che le
         * eccezioni create vengano lanciate soltanto quando opportuno, cioè in
         * presenza di un id utente errato, oppure al superamento del numero di
         * operazioni ATM gratuite.
         */
    }
}
