package com.concessionaria.factory;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class Conexaofactory {

		private static Connection con;

		public static Connection getConnection() throws Exception {
			if (con == null) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/tabacaria", "tabaco", "tabaco");
				} catch (Exception ex) {
					System.err.print("Erro na conexão:" + ex.getLocalizedMessage());
					throw ex;
				}
			}
			return con;
		}

		public static void closeConnection() {
			if (con != null) {
				try {
					con.close();
				} catch (Exception ex) {
					System.err.print("Erro ao fechar a conexão:" + ex.getLocalizedMessage());
				}
				con = null;
			}
		}
		
		/* teste conexao
		public static void main(String[] args) throws Exception {
			try {
				Connection conexao = Conexaofactory.getConnection();
				System.out.println("Conexao realizada!!");
			}catch(SQLException ex){
				System.out.println("negada!");
			}
		}*/
		
	}

