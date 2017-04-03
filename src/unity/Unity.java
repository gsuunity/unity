/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author supark
 */
public class Unity {
    //database URL
    
      
    public static void main(String[] args) {
        
            
            String sql1 = "CREATE TABLE log2 (gsuemail VARCHAR PRIMARY KEY NOT NULL UNIQUE, pw VARCHAR NOT NULL, "
                    + "nickname VARCHAR NOT NULL);  ";
            
            String sql2 = "CREATE TABLE inventory (isbn INTEGER PRIMARY KEY NOT NULL, title CHAR NOT NULL, author CHAR "
                    + "NOT NULL, edition VARCHAR DEFAULT (null), date DATETIME)";
            
            String sql3 = "CREATE TABLE openInventory4 (price DOUBLE NOT NULL, isbn INTEGER NOT NULL, seller VARCHAR "
                    + "NOT NULL, condition VARCHAR NOT NULL, desc TEXT, PRIMARY KEY (price, isbn, seller))";
            
            String sql4 = "CREATE TABLE cart3 (isbn INTEGER NOT NULL, seller VARCHAR NOT NULL, price DOUBLE NOT NULL, "
                    + "buyer VARCHAR NOT NULL, title VARCHAR NOT NULL, edition VARCHAR, author VARCHAR NOT NULL, "
                    + "condition VARCHAR NOT NULL, description TEXT, date DATETIME NOT NULL, PRIMARY KEY (isbn, seller, "
                    + "price))";
            
            String sql5 = "CREATE TABLE address (buyer VARCHAR NOT NULL  DEFAULT (null) ,shipping TEXT NOT NULL, date "
                    + "DATETIME NOT NULL)";
            
            String sql6 = "CREATE TABLE cardInfo1 (cardNumber INTEGER PRIMARY KEY  NOT NULL , buyer VARCHAR NOT NULL , "
                    + "billing TEXT NOT NULL , cardName VARCHAR NOT NULL , cardType VARCHAR NOT NULL , expDate VARCHAR "
                    + "NOT NULL , securityNumber INTEGER NOT NULL , phone VARCHAR NOT NULL )";
            
            
            try {
                Class.forName("org.sqlite.JDBC");
                Connection con = DriverManager.getConnection("jdbc:sqlite:/Users/tangher/Desktop/GitHubUnity/unity/book1.sqlite");
                Statement stmt = con.createStatement();
                stmt.execute(sql1);
                stmt.execute(sql2);
                stmt.execute(sql3);
                stmt.execute(sql4);
                stmt.execute(sql5);
                stmt.execute(sql6);
                
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        
        
        new firstPage().setVisible(true);
    }
 
}
