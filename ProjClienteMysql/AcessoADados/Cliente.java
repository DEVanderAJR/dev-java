package AcessoADados;

import java.sql.Connection;
import java.sql.*;
import java.sql.Statement;

import com.mysql.jdbc.*;

public class Cliente {

	
	public static boolean cadastrar(String nome, String cpf, String logradouro, String bairro, String numero, String complemento,String cidade, String pais) throws Exception, IllegalAccessException, ClassNotFoundException
	{
		Class.forName ("com.mysql.jdbc.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stmt = con.createStatement();
		String cmd = "insert into cliente(nome,cpf,logradouro,bairro,numero,complemento,cidade,pais)values('"+nome+"','"+cpf+
		"','"+logradouro+"','"+bairro+"','"+numero+"','"+complemento+"','"+cidade+"','"+pais+"')";
		if(stmt.executeUpdate(cmd)==0)
			return false;
		else
			return true;
		
	}
	public static boolean alterar(String cpfantigo, String nome, String cpf, String logradouro, String bairro, String numero, String complemento,String cidade, String pais) throws Exception, IllegalAccessException, ClassNotFoundException
	{
		Class.forName ("com.mysql.jdbc.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stmt = con.createStatement();
		String cmd = "update cliente set nome='"+nome+"',cpf='"+cpf+
		"',logradouro='"+logradouro+"',bairro='"+bairro+"',numero='"+numero+"',complemento='"+complemento+"',cidade='"+cidade+"',pais='"+pais+"' where cpf='"+cpfantigo+"'";
		if(stmt.executeUpdate(cmd)==0)
			return false;
		else
			return true;
		
	}
	//Retorna uma coleção de linhas referentes à tabela em que for feito o select
	public static ResultSet consultar(String cpf) throws Exception, IllegalAccessException, ClassNotFoundException
	{
		Class.forName ("com.mysql.jdbc.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stmt = con.createStatement();
		String cmd = "select * from cliente where cpf='"+cpf+"'";
		ResultSet rs = stmt.executeQuery(cmd);
		return rs;
	}
	
	public static boolean excluir(String cpf)throws Exception
	{
		Class.forName ("com.mysql.jdbc.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stmt = con.createStatement();
		String cmd = "delete from cliente where cpf='"+cpf+"'";
		//Se retornar zero quer dizer que não foi possivel excluir
		if(stmt.executeUpdate(cmd)==0)
			return false;
		else
			return true;
		
	}
}
