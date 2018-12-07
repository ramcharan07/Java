package com.cg.eis.bean;

public abstract class Account {
public long accNumber;
public double balance;
Person accHolder;


public long getAccNumber() {
	return accNumber;
}
public void setAccNumber(long accNumber) {
	this.accNumber = accNumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Person getAccHolder() {
	return accHolder;
}
public void setAccHolder(Person accHolder) {
	this.accHolder = accHolder;
}

void deposit(double value) {
	
}
abstract void withdraw(double val);
public double getBala() {
	return balance;
}


}
