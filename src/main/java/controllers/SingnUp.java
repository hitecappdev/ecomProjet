package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdbc.CrudImp;
import model.Client;

import java.io.IOException;

import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SingnUp
 */
public class SingnUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SingnUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Client client = new Client(
				request.getParameter("nom"),
				request.getParameter("prenom"),
				request.getParameter("email"),
				request.getParameter("adresse"),
				request.getParameter("motDePasse")
		);
		CrudImp insertion=new CrudImp();
		
		insertion.insertClient(client);
		request.setAttribute("client",client);
			
		jakarta.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("sign-in.jsp");

		
		
	
		
		dispatcher.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}
