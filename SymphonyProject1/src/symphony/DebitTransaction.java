package symphony;

/**
 * This class realizes FinancialTransaction representing a debit transaction
 * @author Team2
 *
 */
public class DebitTransaction implements FinancialTransaction {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public DebitTransaction(){
		super();
	}
	
	/**
	 * Overloaded constructor
	 * @param accountNum
	 * @param accountType
	 * @param accountPin
	 */
	public DebitTransaction(int accountNum, String accountType, int accountPin){
		super();
		this.accountNum = accountNum;
		this.accountPin = accountPin;
		this.accountType = accountType;
	}

	/* ACCESSORS	-----------------------------------------------------*/
	
	/**
	 * getter for accountNum
	 * @return account number
	 */
	public int getAccountNum() {
		return accountNum;
	}

	/**
	 * getter for accountType
	 * @return account type ie. "Chequing"
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * getter for accountPin
	 * @return account pin
	 */
	public int getAccountPin() {
		return accountPin;
	}

	/* MODIFIERS	-----------------------------------------------------*/
	
	/**
	 * setter for accountNum
	 * @param accountNum
	 */
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	
	/**
	 * setter for accountType
	 * @param accountType
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	/**
	 * setter for accountPin
	 * @param accountPin
	 */
	public void setAccountPin(int accountPin) {
		this.accountPin = accountPin;
	}

	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * makes a debit transaction
	 */
	public boolean makeTransAction(Double amount){
		
		//****:TODO Ask Reg what behavior should involve here
		return true;
	};
	
	/**
	 * refunds a debit transaction
	 */
	public boolean refundTransAction(Double amount){
		
		//****:TODO Ask Reg what behavior should involve here
		return true;
	};
	
	/**
	 * Override method for toString()
	 */
	@Override
	public String toString() {
		return "DebitTransaction [accountNum=" + accountNum + ", accountType="
				+ accountType + ", accountPin=" + accountPin + "]";
	}
		
		
	/* ATTRIBUTES--------------------------------------------------------*/
	
	/**
	 * account number
	 */
	private int accountNum;
	
	/**
	 * account type ie. "Savings"
	 */
	private String accountType;
	
	
	/**
	 * account pin 
	 */
	private int accountPin;
		
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
