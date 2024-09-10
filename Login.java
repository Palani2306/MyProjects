package Task.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		PrintWriter pw=response.getWriter();
		pw.println(name);
		pw.println(pass);
		if(name.equals("Yashu") && pass.equals("Kumta"))
		{
			HttpSession logsession=request.getSession();
			logsession.setAttribute("username", name);
			response.sendRedirect("Registration.html");
		}
		else
		{
			response.sendRedirect("Login.html");
		}
		
	}

}
