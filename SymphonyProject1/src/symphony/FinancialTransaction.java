package symphony;

public interface FinancialTransaction {
		
	/* NORMAL BEHAVIOR -------------------------------------------------*/
		public boolean makeTransAction(Double amount);
		public boolean refundTransAction(Double amount);
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
