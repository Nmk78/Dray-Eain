package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		String email=request.getParameter("email");
		String password=request.getParameter("password");
		if(email.equals("aung@gmail.com") && password.equals("cumyeik")) {
			RequestDispatcher rd=request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
		
		out.println("<html><head><title>Para</title></head>");
		out.println("<body><center><h2>Thanks for registeration!!!</h2><br>");
		out.println("<li>");
		out.println(email);
		out.println("</li>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		}else {
			out.println("<html><head><title>Para</title></head>");
			out.println("<body><center><h2>Thanks for registeration!!!</h2><br>");
			out.println("User's information is incorrect!!!");
			out.println("</body>");
			out.println("</html>");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
