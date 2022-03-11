package com.hustlecrafts.foodcart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDBUtil {
	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException{
		
		String connectionUrl = "jdbc:mysql://127.0.0.1:3306/food";
		String username = "prashant";
		String password = "pass@123";
		
		ArrayList<Food> foodList = new ArrayList<Food>();
		
		//load the SQL driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get the connection
		Connection con = DriverManager.getConnection(connectionUrl, username, password);
		
		//create a statement
		Statement stmt = con.createStatement();
		
		//execute query
		ResultSet rs = stmt.executeQuery("SELECT * FROM food.foodcart");
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String item = rs.getString(2);
			double price = rs.getDouble(3);
			
			Food f = new Food(id, item, price);
			foodList.add(f);
		}
		
		return foodList;
	}
}
