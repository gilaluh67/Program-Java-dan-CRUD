
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class koneksi {
    Connection con;
    Statement stm;
    public void config(){
        try{
             Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_formulir", "root", "");
            stm = con.createStatement();
        }catch(Exception e){
         JOptionPane.showMessageDialog(null,"koneksi gagal"+e.getMessage());    
        }
    }
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Koneksi Berhasil");
        }catch(ClassNotFoundException ex){
            System.out.println("Gagal Koneksi" + ex);
        }
        String url = "jdbc:mysql://localhost:3306/db_formulir";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi Database");
        }catch(SQLException ex){
            System.out.println("Gagal Koneksi Database"+ex);
        }
        return koneksi;
    }
    
}
