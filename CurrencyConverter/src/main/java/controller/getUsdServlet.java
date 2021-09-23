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

import model.UsdConverter;

/**
 * Servlet implementation class getUsdServlet
 */
@WebServlet("/getUsdServlet")
public class getUsdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getUsdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userUsd = request.getParameter("userUsd");
		
		UsdConverter usd = new UsdConverter(Double.parseDouble(userUsd));
		
		request.setAttribute("userUsdAmount", usd);
		
		getServletContext().getRequestDispatcher("/usd_result.jsp").forward(request, response);
	}

}
