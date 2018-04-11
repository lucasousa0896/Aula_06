package Model;

public class Pais 
{
	String nomePais;
	String populacaoPais;
	int idPais;
	String areaPais;
	
	public Pais()
	{}
	
	public Pais(int idPais, String nomePais, String populacaoPais, String areaPais)
	{
		this.idPais = idPais;
		this.nomePais = nomePais;
		this.populacaoPais = populacaoPais;
		this.areaPais = areaPais;
	}
	

	public int getIdPais() 
	{
		return idPais;
	}

	public void setIdPais(int idPais) 
	{
		this.idPais = idPais;
	}

	public String getNomePais() 
	{
		return nomePais;
	}

	public void setNomePais(String nomePais) 
	{
		this.nomePais = nomePais;
	}

	public String getPopulacaoPais() 
	{
		return populacaoPais;
	}

	public void setPopulacaoPais(String populacaoPais) 
	{
		this.populacaoPais = populacaoPais;
	}
	
	public String getAreaPais()
	{
		return this.areaPais;
	}
	
	public void setAreaPais(String areaPais)
	{
		this.areaPais = areaPais;
	}
	
	
	public String Exibir()
	{
		return "Nome do País: " + nomePais + "\n" +
				"Populacao do País: " + populacaoPais;
	}
}
