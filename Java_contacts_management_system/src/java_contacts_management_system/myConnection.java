/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_contacts_management_system;
import java.sql.DriverManager;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.*;

/**
 *
 * @author maldanna
 */
public class myConnection {
    
    public static Connection getconnection(){
    
    Connection con=null;
    
    try{
    
    
    Class.forName("com.mysql.jdbc.Driver");
    
    con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/javacontacts_app","root","");
    
    
    }
   catch(Exception e){
    System.out.println(e.getMessage());
    }
    
    
    
    return con;
    
}
}