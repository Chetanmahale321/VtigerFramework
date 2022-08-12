package Practise1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class ReadDataFromMySqlNonSelectQuery {

  public static void main(String[] args)throws Throwable
	{
		// TODO Auto-generated method stub
		Driver driverRef=new Driver();
    DriverManager.registerDriver(driverRef);
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachers_info","root","root");
	
    Statement stat = conn.createStatement();
    String query = "insert into teachers(first_name,last_name,address)values('Chetan','Mahale','Pune')";
    
    int result = stat.executeUpdate(query);
    
    if(result==1)
    {
    	System.out.println("user is created");
    }
    else
    {
    	System.out.println("user is not created");
    }
	conn.close();
	}

}

