package account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
public String validateUser(Bank bank) {
	if(isValidateName(bank.getName()) ) {
		if( phonenumber(bank.getMobile())) {
			if(email(bank.getEmail())) 
	                return "ok";
			else
				return "check your mail id";
		}
			else 
				return "mobile number should be 10 numbers only";
	}
else
return "in name starting letter to be capital";
	
}

public boolean isValidateName(String name) {
	Pattern patter = Pattern.compile("[A-Z][a-z]{2,10}");
	Matcher matcher = patter.matcher(name);
	if(matcher.matches()) {
		return true;
	}
	else
	return false;
	
}
boolean phonenumber(long num) {
	String value=Long.toString(num);
	 Pattern patter = Pattern.compile("[6-9][0-9]{9}");
	 Matcher matcher = patter.matcher(value);
	if(matcher.matches()) {
		return true;
	}
	else 
		return false;
}
boolean email(String mail) {
	 Pattern patter = Pattern.compile("[a-zA-Z]{1}[a-zA-Z0-9]*@[a-zA-Z0-9]*.[a-zA-Z0-9]*");
	 Matcher matcher = patter.matcher(mail);
		if(matcher.matches()) {
			return true;
		}
		else
		return false;
}


}
