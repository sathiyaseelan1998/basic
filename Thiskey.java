package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SqlConnection {
	public static void main(String arg[]){
		SqlConnection ob=new SqlConnection();
		//ob.insert();
		ob.select();
	}

	private void select() {
		// TODO Auto-generated method stub
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","admin");
			Statement stm=con.createStatement();
			String s="select * from demo";
			ResultSet rs=stm.executeQuery(s);
			while(rs.next()){
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void insert() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","admin");
			Statement stm=con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			String s="insert into demo values("+id+",'"+name+"')";
			stm.execute(s);
			System.out.println("value inserted");
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
