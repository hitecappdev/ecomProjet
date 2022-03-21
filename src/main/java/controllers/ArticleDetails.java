package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdbc.CrudImp;
import model.Article;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Servlet implementation class ArticleDetails
 */
public class ArticleDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticleDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println(request.getParameter("Reference"));
		
		 CrudImp crudImpl = new CrudImp();
	        Article article = null;
	        
	        try {
	            article = crudImpl.getArticleByNum(Integer.parseInt(request.getParameter("Reference")));
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        request.setAttribute("article",article);
	        
	        request.getRequestDispatcher("article.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
