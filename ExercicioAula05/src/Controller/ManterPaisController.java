package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Pais;
import Service.PaisService;

/**
 * Servlet implementation class ManterPaisController
 */
@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ManterPaisController() 
	{  }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String nome = request.getParameter("nomePais");
		String populacao = request.getParameter("populacaoPais");
		String area = request.getParameter("areaPais");

		Pais pais = new Pais();
		pais.setNomePais(nome);
		pais.setPopulacaoPais(populacao);
		pais.setAreaPais(area);

		PaisService paisService = new PaisService();
		paisService.Incluir(pais);
		paisService.Exibir(pais);

		request.setAttribute("pais", pais);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Pais.jsp");
		requestDispatcher.forward(request, response);
	}

}
