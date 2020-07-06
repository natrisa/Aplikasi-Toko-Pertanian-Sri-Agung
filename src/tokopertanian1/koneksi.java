/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokopertanian1;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Galaxy
 */
public class koneksi {
 
     public static java.sql.Connection conn;
    
    public static java.sql.Connection Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/tokopertanian", "root","");
        }catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
        return conn;
    }
public static void main(String args[]){
        System.out.println(koneksi.Conn());
    }


}
