/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class connsql {
    Connection cin = null;
    
    public static Connection ConnecrDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:/Users/supark/Documents/GitHub//gsuunity/unity/book.sqlite");
            JOptionPane.showMessageDialog(null, "connection established");
            return con;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}