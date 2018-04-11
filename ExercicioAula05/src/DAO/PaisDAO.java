package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Pais;

public class PaisDAO 
{	
	public void Incluir(Pais pais)
	{
		String sqlQuery = "INSERT INTO testeaulas.TB_Pais(NomePais, PopulacaoPais, AreaPais) VALUES(?, ?, ?);";
	
		try(Connection conn = ConnectionFactory.CriarConexao();
				PreparedStatement stm = conn.prepareStatement(sqlQuery);)
		{
			stm.setString(1, "NomePais");
			stm.setString(2, "PopulacaoPais");
			stm.setString(3, "AreaPais");
			
			stm.execute();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void Excluir(Pais pais)
	{
		String sqlQuery = "DELETE FROM testeaulas.TB_Pais WHERE IdPais = ?;";
											
		try(Connection conn = ConnectionFactory.CriarConexao();
				PreparedStatement stm = conn.prepareStatement(sqlQuery);)
			{
				stm.setString(1, "IdPais");
				
				stm.execute();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
	}
	
	public void Atualizar(Pais pais)
	{
		String sqlQuery = "UPDATE testeaulas.TB_Pais SET NomePais = ?, PopulacaoPais = ?, AreaPais = ? WHERE IdPais = ?;";
		
		try(Connection conn = ConnectionFactory.CriarConexao();
				PreparedStatement stm = conn.prepareStatement(sqlQuery);)
			{
				stm.setString(1, "NomePais");
				stm.setString(2, "PopulacaoPais");
				stm.setString(3, "AreaPais");
				stm.setString(4, "IdPais");
				
				stm.execute();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
	}
	
	public Pais Exibir(Pais pais, String nomePais)
	{
		String sqlQuery = "SELECT IdPais, NomePais, PopulacaoPais, AreaPais FROM testeaulas.TB_Pais WHERE NomePais = '?';";
		
		try
		{
			try(Connection conn = ConnectionFactory.CriarConexao();
					PreparedStatement stm = conn.prepareStatement(sqlQuery);)
				{
					stm.setString(1, pais.getNomePais());
				
					try(ResultSet rs = stm.executeQuery();)
					{
						if(rs.next())
						{
							pais.setIdPais(rs.getInt("IdPais"));
							pais.setNomePais(rs.getString("NomePais"));
							pais.setPopulacaoPais(rs.getString("PopulacaoPais"));
							pais.setAreaPais(rs.getString("AreaPais"));
						}
						else
						{
							pais.setIdPais(-1);
							pais.setNomePais(null);
							pais.setPopulacaoPais(null);
							pais.setAreaPais(null);
						}
					}
					catch(SQLException sqlEx)
					{
						sqlEx.printStackTrace();
					}
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return pais;
	}
}
