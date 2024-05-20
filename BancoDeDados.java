/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthu
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {

public class BancoDeDados {
 
 private String usuario = "root";
 private String senha = "admin123";
 private String host = "localhost";
 private String porta = "3306";
 private String bd = "db_pessoas";
 
 public Connection obtemConexao (){
 try{
 Connection c = DriverManager.getConnection(
 "jdbc:mysql://" + host + ":" + porta + "/" + bd,
 usuario,
 senha
 );
     return c;
 }
    catch (Exception e){
    e.printStackTrace();
    return null;
        }
    }
}
    
}
