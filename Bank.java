package account;

public class Bank {
int id;
String name;
long mobile;
String email;
int amount;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Bank [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", amount=" + amount + "]";
}
public void setName(String name) {
	this.name = name;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
}
