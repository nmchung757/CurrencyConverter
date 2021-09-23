/**
 * @author Noah Chung - nmchung
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EuroConverter;

/**
 * Servlet implementation class getEuroServlet
 */
@WebServlet("/getEuroServlet")
public class getEuroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getEuroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userEuro = request.getParameter("userEuro");
		
		EuroConverter euro = new EuroConverter(Double.parseDouble(userEuro));
		
		request.setAttribute("userEuroAmount", euro);
		
		getServletContext().getRequestDispatcher("/euro_result.jsp").forward(request, response);
	}

}
