/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Leticia
 */
public class Conexao{

   
     public static Connection getConnection() throws SQLException{
   Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/login_pessoas","postgres","lelev");
         return conexao;
            
    }
}