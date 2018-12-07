package com.cg.eis.bean;


public class Main {

	public static void main(String[] args) {
		Account acc=new Person();
		Person person=new Person("ram",21);
		
		acc.setAccHolder(person);
          person.setAccNumber(100);
          person.setBalance(2000);;
          person.withdraw(500);
          System.out.println(person);
	}

}
