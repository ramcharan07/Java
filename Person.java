package com.cg.eis.bean;

public class Person extends Account {
private String name;
private float age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getAge() {
	return age;
}
public void setAge(float age) {
	this.age = age;
}
public Person(String name, float age) {
	super();
	this.name = name;
	this.age = age;
}
public Person() {
	// TODO Auto-generated constructor stub
}
@Override
void withdraw(double val) {
	if(balance >=500) {
		balance -=val;
		System.out.println(getBala());
	}
	else {
		System.out.println("insufficient bal");
	}
	
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", accNumber=" + accNumber + ", balance=" + balance + "]";
}

}
