package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String act = request.getParameter("act");
		if (act == null)
			act = "view";
		switch (act) {
		case "view":
			request.getRequestDispatcher("/ShowContacts").forward(request, response);
			break;
		case "addform":
			request.getRequestDispatcher("/WEB-INF/view/AddContactForm.jsp").forward(request, response);
			break;
		case "add":
			request.getRequestDispatcher("/AddContact").forward(request, response);
			break;
		case "delete":
			request.getRequestDispatcher("/DeleteContact").forward(request, response);
			break;
		case "editform":
			request.getRequestDispatcher("/LoadEditContact").forward(request, response);
			break;
		case "edit":
			request.getRequestDispatcher("/EditContact").forward(request, response);
			break;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
