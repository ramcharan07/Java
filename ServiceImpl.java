package account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.DBConnection;

public class ServiceImpl {
public static boolean insertValues(Bank bank) throws Exception {
	Connection con=getConnection();
	int id=0;
	PreparedStatement ps=con.prepareStatement("insert into bank values(id_seq.nextVal,?,?,?,?)");
	//ps.setInt(1, id);
	ps.setString(1, bank.getName());
	ps.setLong(2, bank.getMobile());
	ps.setString(3, bank.getEmail());
	ps.setInt(4, bank.getAmount());
	int i=ps.executeUpdate();
	ps.close();
	con.close();
	if(i!=0) {
		return true;
	}
	else
	    return false;
	
}
public static int getId(Bank bank) throws Exception {
	Connection con=getConnection();
	int id=0;
    //con.Statement st=con.createStatement();
	PreparedStatement ps=con.prepareStatement("select max(id) from emp");
	ResultSet rs=ps.executeQuery();
	rs.next();
	id=rs.getInt(1);
	rs.close();
	ps.close();
	con.close();
		return id;
}
public static void getDetails(int i) throws Exception {
	Connection con=getConnection();
	int id=0;
    //con.Statement st=con.createStatement();
	PreparedStatement ps=con.prepareStatement("select * from emp where id=?");
	ps.setInt(1, i);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		System.out.println("your id is :"+rs.getInt(1));
		System.out.println("user name :"+rs.getString(2));
		System.out.println("mobile number:"+rs.getLong(3));
		System.out.println("email id:"+rs.getString(4));
		System.out.println("amount:"+rs.getInt(5));
	}
	rs.close();
	ps.close();
	con.close();
}
public static void allDetails() throws Exception {
	Bank bank=new Bank();
	Connection con=getConnection();
	List<Bank> al=new ArrayList<Bank>();
	PreparedStatement ps=con.prepareStatement("select * from bank");
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		bank.setId(rs.getInt(1));
		bank.setName(rs.getString(2));
		bank.setMobile(rs.getLong(3));
		bank.setEmail(rs.getString(4));
		bank.setAmount(rs.getInt(5));
		System.out.println(bank);
	}
	rs.close();
	ps.close();
	con.close();
}
public static void displayByRange(int amount1,int amount2) throws Exception {
	Bank bank=new Bank();
	Connection con=getConnection();
	List<Bank> al=new ArrayList<Bank>();
	PreparedStatement ps=con.prepareStatement("select * from bank where amount BETWEEN 10000 AND 20000");
//	ps.setInt(1, amount1);
//	ps.setInt(2, amount2);
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		bank.setId(rs.getInt(1));
		bank.setName(rs.getString(2));
		bank.setMobile(rs.getLong(3));
		bank.setEmail(rs.getString(4));
		bank.setAmount(rs.getInt(5));
		System.out.println(bank);
	}
    

}
public static Connection getConnection() throws Exception {
	Connection con=DBConnection.getConnection();
	return con;
	
}
}
