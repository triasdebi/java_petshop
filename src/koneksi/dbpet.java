/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class dbpet {
    Statement stat;

    ResultSet rs;
    String sql;
    Connection c;
  private static Connection conn;
     public static Connection getKoneksi(){
        //isian untuk server
        String  host = "jdbc:mysql://localhost/penjualan",
                user = "root",
                pass = "";
        
        //ujilah koneksi dengan pernyataan try catch
        try{
            conn = (Connection) DriverManager.getConnection(host, user, pass);
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
        return conn;
    }   
}
    

