package javaapplication4;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  

/**
 *
 * @author PRATAP KUMAR
 */
public class JavaApplication4 {
    Connection c=null;
public static Connection ConnecrDb(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/java_dbmovies?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
        return conn;
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    
return null;
}

   
}
