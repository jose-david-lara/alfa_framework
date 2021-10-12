package com.wposs.alfa.framework.core.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
@PropertySource("classpath:application.properties")
public class connectionBD {

	


    private static Connection conexion;
    
	@Autowired
	static Environment enviroment;
	
    private static String server = "jdbc:mysql://localhost:3306/bd_alfa";
    private static String user = "root";
    private static String pass = "";

    public static void connection() throws Exception,SQLException {
    	
    		    	
    		Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(server,user, pass);
            conexion = null;


    }

    public static Connection getcnnection() {
        return conexion;
    }

    public static void closeConnection() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(connectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
	
}
