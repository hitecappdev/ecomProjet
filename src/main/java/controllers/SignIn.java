package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdbc.CrudImp;
import model.Client;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Servlet implementation class SignIn
 */
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		

		String nom=request.getParameter("nom");
		String password=request.getParameter("password");
		
		Client client = null;
		
		jakarta.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
		
		CrudImp login=new CrudImp();
		try {
			
			client = login.login(nom,password);
			
			System.out.println(client.getNom()+client.getPrenom());
			
			request.setAttribute("nom", client.getNom()+" "+client.getPrenom());
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		dispatcher.forward(request, response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
