/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Leticia
 */
public class LoginDAO {
    
     public void cadastrarUsuario(String nome, String sobrenome, String cpf, String senha, String email) throws SQLException{
       
        
        String sql = "INSERT INTO cadastro_pessoas (nome, sobrenome, cpf, senha, email) VALUES ('"+nome+"','"+sobrenome+"','"+cpf+"','"+senha+"',"+email+"')";
        System.out.println (sql);
        Connection conexao = new Conexao().getConnection();
        PreparedStatement statment = conexao.prepareStatement(sql); 
        statment.execute();
        conexao.close();
    
    }
     
     public boolean login(String email, String senha) throws SQLException{
        String sql = "SELECT email, senha FROM cadastro_pessoas WHERE email = '"+email+"' AND senha = '"+senha+"'";
        System.out.println (sql);
        Connection conn = Conexao.getConnection();
        PreparedStatement statment = conn.prepareStatement(sql); 
        ResultSet rs = statment.executeQuery();
        
//        if (rs.next()){
//            System.out.println("Possui algo no banco de dados");
//        }else {
//            System.out.println("Não Possui algo no banco de dados");
//        }
        conn.close();
        return rs.next();
     }
     
}

