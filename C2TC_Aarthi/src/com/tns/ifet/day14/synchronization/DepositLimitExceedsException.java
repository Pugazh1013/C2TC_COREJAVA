package com.tns.ifet.day14.synchronization;

public class DepositLimitExceedsException extends exception {
	public DepositLimitExceedsException()
	{
		super("Daily limit of Deposit is exceeded..");
	}
	public DepositLimitExceedsException(String message)
	{
		super(message);
	}

}
