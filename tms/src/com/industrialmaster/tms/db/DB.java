/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.industrialmaster.tms.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author malit
 */
public class DB {
    
  
        public static  Connection con=null;
        
        public static Connection getCon() throws Exception{
            if(con==null){
               //3.Database connection Initialize
               String url="jdbc:mysql://localhost:3306/dbtms";
               String un="root";
               String pw="root";
               Class.forName("com.mysql.cj.jdbc.Driver");
               con=DriverManager.getConnection(url,un,pw);
            }
            return con;
        }
}
