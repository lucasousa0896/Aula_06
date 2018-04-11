package Service;

import java.util.ArrayList;

import DAO.PaisDAO;
import Model.Pais;


public class PaisService 
{
	PaisDAO paisDao = new PaisDAO();
	
	public void Incluir(Pais pais)
	{
		paisDao.Incluir(pais);
	}
	
	public void Excluir(Pais pais)
	{
		paisDao.Excluir(pais);
	}
	
	public void Atualizar(Pais pais)
	{
		paisDao.Atualizar(pais);
	}
	
	public void Exibir(Pais pais)
	{
		paisDao.Exibir(pais, pais.getNomePais());
	}
}
