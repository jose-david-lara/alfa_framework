package com.wposs.alfa.framework.core.utils;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.istack.logging.Logger;

public class dataBase {
	
	
	private static final Logger LOGGER = Logger.getLogger("com.wposs.alfa.framework.core.utils.baseDatos".getClass());
	
	
	
    public static void register_insert (String sql) throws Exception, SQLException{
        LOGGER.info("Inicio de sentencia sql: " + sql);
        
        connectionBD.connection();

        Connection conn = connectionBD.getcnnection();
        Statement st;
        ResultSet rs;
        LOGGER.info("Conexion exitoso DB::");
        
        try {

            st = conn.createStatement();
            st.executeUpdate(sql);
            rs = st.getResultSet();

            st.close();
            

            LOGGER.info("Cierre exitoso DB::");
        } catch (SQLException e) {
            System.out.println("no es posible insertar::" + e.getMessage());
            connectionBD.closeConnection();
            LOGGER.info("Cierre inesperado a DB::");
        }
        connectionBD.closeConnection();

     
    }

}
