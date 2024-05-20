/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ghbvi
 */
public class InterfaceJava {
    public void inserir (){
 //1: Definir o comando SQL
 String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
 //2: Abrir uma conexão
 ConnectionFactory factory = new ConnectionFactory();
 try (Connection c = factory.obtemConexao()){
 //3: Pré compila o comando
 PreparedStatement ps = c.prepareStatement(sql);
 //4: Preenche os dados faltantes
 ps.setString(1, nome);
 ps.setString(2, fone);
 ps.setString(3, email);
 //5: Executa o comando
 ps.execute();
 }
 catch (Exception e){
 e.printStackTrace();
 }
 }
}
