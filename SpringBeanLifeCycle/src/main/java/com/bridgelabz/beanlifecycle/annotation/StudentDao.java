/******************************************************************************
 
 *  Purpose: Dao class to perfrom persistance logic 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDao {

	private String driver;

	private String url;
	private String uname;
	private String pass;
	private Connection connection;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	
	/**
	 * purpose : to init the jdbc connection
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {

		// getting connection
		getConnection();
	}

	
	/**
	 * purpose : to get jdbc connection
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void getConnection() throws ClassNotFoundException, SQLException {

		// establishing connection
		Class.forName(driver);
		connection = DriverManager.getConnection(url, uname, pass);

	}

	
	/**
	 * purpose : to print all the data from the databases
	 * 
	 * @throws SQLException
	 */
	public void getAllDetails() throws SQLException {

		Statement statement = connection.createStatement();

		ResultSet resultset = statement.executeQuery("select * from student");

		while (resultset.next()) {
			System.out.println("id: " + resultset.getInt(1));
			System.out.println("name: " + resultset.getString(2));
			System.out.println("Address: " + resultset.getString(3));

		}

	}
	
	/**
	 * purpose : to close the connection from database
	 * 
	 * @throws SQLException
	 */

	public void closeConnection() throws SQLException {
		// closing connection
		connection.close();
	}

	
	
	/**
	 * purpose : to destroy the connection
	 * 
	 * @throws SQLException
	 */
	@PreDestroy
	public void destroy() throws SQLException {

		System.out.println(" Destroy called ");
		closeConnection();
	}

}
