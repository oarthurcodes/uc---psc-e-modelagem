/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.dao.LoginDAO;
import com.mycompany.eventos.CadastroView;
import java.sql.Connection;
import java.sql.SQLException;
import com.mycompany.dao.conexao.java;
import com.mycompany.eventos.TeladeAcesso;

/**
 *
 * @author Leticia
 */
public class LoginController {
    
    public void cadastroUsuario (CadastroView view) throws SQLException{
    Connection conexao = new Conexao().getConnection();
    LoginDAO cadastro = new LoginDAO();
    cadastro.cadastrarUsuario(view.getjTextFieldNome().getText(), view.getjTextFieldSobrenome().getText(), view.getjTextFieldCpf().getText(),
            view.getjTextFieldEmail().getText(), view.getjPasswordFieldSenha().getText());
    }
    
     public void loginUsuario (TeladeAcesso view) throws SQLException{
    
    Connection conexao = new Conexao().getConnection();
    LoginDAO login = new LoginDAO();
    login.login(view.getloginTextField().getText(), view.getSenhaPasswordField().getText());
    
}
