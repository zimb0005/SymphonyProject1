package symphony;

/**
 * this class realizes interface FinancialTransaction representing a cash transaction ie. buying a ticket for the symphony with cash
 * @author Team 2
 *
 */
public class CashTransaction implements FinancialTransaction {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	/**
	 * default constructor
	 */
	public CashTransaction(){
		super();
	}
	
	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * makes a cash transaction
	 */
	public boolean makeTransAction(Double amount){
		
		//****:TODO Ask Reg what behavior should involve here
		return true;
	};
	/**
	 * refunds a cash transaction
	 */
	public boolean refundTransAction(Double amount){
		
		//****:TODO Ask Reg what behavior should involve here
		return true;
	};
		
	/* ATTRIBUTES-------------------------------------------------------*/
	
		
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
