package com.agenda.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */

public class FazerConexao {
    
    public static Connection conexao;

public static Connection getConexao() {
    
    try {
Class.forName("com.mysql.jdbc.Driver");
conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"fate","root","1234");
        //System.out.println("Banco Conectado!");
        JOptionPane.showMessageDialog(null,"Banco Conectado!");      
}
catch (Exception e) {
        //System.out.println("Erro na Conexão com o Banco!"+e);
        JOptionPane.showMessageDialog(null,"Erro na Conexão com o Banco! \n" +e);      
    }
return conexao;
}
    public static void main(String[] args) {
    FazerConexao faz = new FazerConexao();
    getConexao();
    }	}
