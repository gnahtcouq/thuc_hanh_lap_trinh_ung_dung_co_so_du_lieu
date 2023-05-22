package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;

/**
 * Servlet implementation class EditContact
 */
@WebServlet("/EditContact")
public class EditContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private final ContactService cs = new ContactService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditContact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		Contact c = cs.get(id);
		
		c.setName(request.getParameter("name"));
		c.setAddress(request.getParameter("address"));
		c.setPhone(request.getParameter("phone"));
		c.setEmail(request.getParameter("email"));
		cs.save(c);
		response.sendRedirect("Controller");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
