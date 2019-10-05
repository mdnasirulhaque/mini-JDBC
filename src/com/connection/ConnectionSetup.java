package com.connection;

import java.sql.*;

public class ConnectionSetup {
	//static final String JDBC_DRIVER = "com.oracle.jdbc.Driver";
	static final String DB_URL = "jdbc:sqlite:C:\\Users\\1434979\\MySQLiteDB";

	static final String USER = "";
	static final String PASS = "";
	
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		try
		{
		    Class.forName("org.sqlite.JDBC");
		    
		    System.out.println("Connecting to database...");
		    conn = DriverManager.getConnection(DB_URL,USER,PASS);
		    
		    System.out.println("Creating statement...");
		    stmt = conn.createStatement();
		    
		    String sql;
		    //sql = "CREATE TABLE Persons(PersonID int, LastName varchar2(255), FirstName varchar2(255), Address varchar2(255), City varchar2(255))";
		    //stmt.executeUpdate(sql);
		    //sql="insert into persons values(10,'shikre','jaikant','blah','blah')";
		    //stmt.executeUpdate(sql);
		    sql="select * from persons";
		    
		    ResultSet rs = stmt.executeQuery(sql);
		    
		    while(rs.next())
		        System.out.println(rs.getString(1));
		    rs.close();
		    stmt.close();
		    conn.close();
		}
		catch(SQLException se)
		{
		      se.printStackTrace();
		}
		catch(Exception e)
		{
		      e.printStackTrace();
		}
		finally
		{
			try
			{
				if(stmt!=null)
					stmt.close();
			}
			catch(SQLException se2)
			{
				
			}
		    try
		    {
		    	if(conn!=null)
		    		conn.close();
		    }
		    catch(SQLException se)
		    {
		         se.printStackTrace();
		    }
		}	
	}
}
