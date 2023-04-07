package com.example.contactApplication.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	 public static final String URl = "jdbc:mysql://localhost:13306/movie_db?useSSL=false";
	    public static final String UserName = "root";
	    public static final String Password = "bittu";

	    public static Connection  connection = null;

	    private Connect() {

	    }

	    public static Connection getConnection() {

	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            connection = DriverManager.getConnection(URl, UserName, Password);

	        } catch (Exception e) {

	            e.printStackTrace();
	        }

	        return  connection;

	    }
	}



