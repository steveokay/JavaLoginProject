/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stevo
 */
import java.sql.*;
import javax.swing.*;

public class javaconnect {
    
    Connection conn = null;
    
    public static Connection connectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection(     //<---connection using sqlite db
                    "jdbc:sqlite:C:\\Users\\Stevo\\Documents\\NetBeansProjects\\Project123\\project123.sqlite");
            
            //unComment if using mysql
            //Class.forName("com.mysql.jdbc.Driver");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/project123","root","");
            //JOptionPane.showMessageDialog(null, "CONNECTION TO THE DATABASE ESTABLISHED");
            return conn;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "CONNECTION TO THE DATABse COULD NOT BE ESTABLISHED");
            return null;
        }
    }
    
}
