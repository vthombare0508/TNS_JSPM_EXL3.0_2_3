package com.tnsif.daysixteen.jdbcoperatonsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTable {

	public static void main(String[] args) {

		
		try {
			//Step:1 Load or Rgister the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is load successfully");
			
			// Step 2: Create a connection between java and sql
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JSPMuser","root","root");
		    System.out.println("Connection created successfully");
		    
		    // Step 3: create a statement object
		    Statement st = con.createStatement();
		    System.out.println("Statement create successfully");
		    
		    // Step 4: create a querry
		    
		    // Create table comment
		   // String q = "create table User(stdid int, name varchar(20), subject varchar(20), duration double)";
		   // st.execute(q);
		    
		    // insert data comment
		   String i = "insert into student values(102, 'Pranav', 'Java','60')";
		  //  st.execute(i);
		    
		    // alter table
		    String a = "Alter table student add primary key(stdid)";
		   // st.executeUpdate(a);
		  
		    // show data in java application
		    
		    ResultSet rs = st.executeQuery("select * from student");
		    System.out.println("Stdid \t Name \t Subjects \t Duration");
		    
		    while(rs.next())
		    {
		    	System.out.println(rs.getInt(1)+"\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4));
		    }
		    	
		    //step 5: close connection
		    con.close();
		    
		    System.out.println("Connection closed");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
