package symphony;

import java.util.Date;


/**
 * This class realizes FinancialTransaction representing a credit transaction
 * @author Team2
 *
 */
public class CreditTransaction implements FinancialTransaction {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	/**
	 * default constructor
	 */
	public CreditTransaction(){
		super();
	}
	
	/**
	 * Overloaded constructor
	 * @param cardType
	 * @param cardNum
	 * @param expireDate
	 */
	public CreditTransaction(String cardType, String cardNum, Date expireDate){
		this.cardType = cardType;
		this.cardNum = cardNum;
		this.expireDate = expireDate;
	}
	
	/* MODIFIER --------------------------------------------------------*/
	/**
	 * getter for cardType
	 * @return type of card ie. "Visa"
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * getter for cardNum
	 * @return credit card number
	 */
	public String getCardNum() {
		return cardNum;
	}

	/**
	 * getter for expireDate
	 * @return expire date of credit card
	 */
	public Date getExpireDate() {
		return expireDate;
	}

	/* ACCESSOR--------------------------------------------------------*/
	
	/**
	 * setter for cardType
	 * @param cardType
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	/**
	 * setter for cardNum
	 * @param cardNum
	 */
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	
	/**
	 * setter for expireDate
	 * @param expireDate
	 */
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * makes a credit transaction
	 */
	public boolean makeTransAction(Double amount){
		
		//****:TODO Ask Reg what behavior should involve here
		return true;
	};
	/**
	 * refunds a credit transaction
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
		return "CreditTransaction [cardType=" + cardType + ", cardNum="
				+ cardNum + ", expireDate=" + expireDate + "]";
	}
		
	/* ATTRIBUTES-------------------------------------------------------*/
	
	/**
	 * type of card ie. "Visa"
	 */
	private String cardType;
	/**
	 * credit card number
	 */
	private String cardNum;
	/**
	 * expire date of credit card
	 */
	private Date expireDate;
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
