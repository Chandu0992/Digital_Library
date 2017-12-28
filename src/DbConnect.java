import java.sql.*;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramanababu
 */
public class DbConnect {
    Connection conn = null;
     public static Connection ConnectDb(){
         
         try{
             Class.forName("java.sql.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dl","root","MySql@8922");
             //JOptionPane.showMessageDialog(null,"Connected to Database Sucessfully !");
             return conn;
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
             return null;
         }
     }

}