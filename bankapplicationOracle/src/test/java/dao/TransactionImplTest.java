package dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dto.Transactions;
import junit.framework.Assert;

class TransactionImplTest {
	TransactionImpl object=new TransactionImpl();
	Transactions obj1=new Transactions();
	
//	@Test
	void testDeposit() {
		Assert.assertEquals(2500,object.deposit(2500,100).getBalance());

	}

//	@Test
	void testWithdraw() {
		Assert.assertEquals(12000,object.withdraw(500,100).getBalance());
	}

	//@Test
	void testBalanceCheck() {
		Assert.assertEquals(12500,object.balanceCheck(100));
	}

	@Test
	void testTransfer() {
		obj1.setAmountTransfer(500);
		obj1.setFromAccountNumber(100);
		obj1.setToAccountNumber(101);
		Assert.assertEquals(102,object.transfer(obj1));

		
	}

}
