package com.example.contactApplication.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.example.contactApplication.connection.Connect;



public class Serviceimpl {
	Scanner sc = new Scanner(System.in);
	public void addContactDetails() {
		
		 Connection connection = null;
	        PreparedStatement ps = null;
	        try {
	            connection =  Connect.getConnection();
	            String sql = "insert into contact values (?,?,? ,?,?)";
	            ps = connection.prepareStatement(sql);
	            
	            System.out.println("Enter contact_id : ");
	            int contact_id = sc.nextInt();
	            ps.setInt(1, contact_id);
	            
	            System.out.println("Enter name; :");
	            String name = sc.next();
	            ps.setString(2, name);
	            
	            System.out.println("Enter email :");
	            String email = sc.next();
	            ps.setString(3, email);
	            
	            System.out.println("Enter Adress");
	           String Adress = sc.next();
	            ps.setString(4, Adress);
	            
	            System.out.println("Enter mobile_num :");
	            String mobile_num = sc.next();
	            ps.setString(5, mobile_num);
	            
	            ps.execute();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                connection.close();
	                ps.close();
	            } catch (Exception e2) {
	                e2.printStackTrace();
	            }
	        }
	        System.out.println("add Contact Successfully");
	    }
	
	
	public void GetContactDetails() {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = Connect.getConnection();
            String sql = "select * from contact";
            ps = connection.prepareStatement(sql);
            ResultSet r = ps.executeQuery();
            while (r.next()) {
                System.out.println("  " + r.getInt(1) + " \t " + r.getString(2) + " \t " + r.getString(3) + " \t "
                        + r.getString(4) + " \t   " + r.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                ps.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
}
	
	
	public void upddateContactDetails() {
		 Connection connection = null;
	        PreparedStatement ps = null;

	        try {

	            connection = Connect.getConnection();
	            String sql = "update contact set name = ? ,email = ? , Address = ? ,mobile_num = ? where contact_id = ?";
	            ps = connection.prepareStatement(sql);

	            System.out.println("Enter contact_id : ");
	            int contact_id = sc.nextInt();
	            ps.setInt(5, contact_id);
	            
	            System.out.println("Enter name; :");
	            String name = sc.next();
	            ps.setString(1, name);
	            
	            System.out.println("Enter email :");
	            String email = sc.next();
	            ps.setString(2, email);
	            
	            System.out.println("Enter Adress");
	           String Adress = sc.next();
	            ps.setString(3, Adress);
	            
	            System.out.println("Enter mobile_num :");
	            String mobile_num = sc.next();
	            ps.setString(4, mobile_num);
	       

	            ps.executeUpdate();
	        } catch (Exception e) {

	            e.printStackTrace();

	        }
	        System.out.println("contact updated...");

	    }
	
	public void DeleteContactDetails() {
		  Connection connection = null;
	        PreparedStatement ps = null;
	       try {
	        

			connection = Connect.getConnection();

			String sql1 = "delete from contact  where contact_id = ?";
			ps = connection.prepareStatement(sql1);

			System.out.println("Enter contact_id :");
			int contact_id = sc.nextInt();
			ps.setInt(1, contact_id);


			ps.executeUpdate();
	       }
	       catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                connection.close();
	                ps.close();
	            } catch (Exception e2) {
	                e2.printStackTrace();
	            }
	        }

	}
}
	        
