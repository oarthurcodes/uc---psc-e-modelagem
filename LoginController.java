/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.controller;

import br.com.login.dao.Conexao;
import br.com.login.dao.LoginDAO;
import com.mycompany.logineventos.CadastroEventos;
import com.mycompany.logineventos.LoginEventos;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ghbvi
 */
public class LoginController {
    
    public void cadastroUsuario(CadastroEventos view) throws SQLException{
    
    Connection conexao = new Conexao().getConnection();
    LoginDAO cadastro = new LoginDAO();
    cadastro.cadastrarUsuario(view.getjTextFieldNome().getText(), view.getjTextFieldEmail().getText() , view.getjPasswordFieldSenha().getText());
    
    
    
    }
 
    
    
    
    }
    

