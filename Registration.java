package Task.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String Fname = request.getParameter("Fname");
		String Lname = request.getParameter("Lname");
		String numberString = request.getParameter("number"); // Get the number as a string
		int number = 0; // Initialize the number

		// Check if the number is not null and not empty before parsing
//		if (numberString != null && !numberString.trim().isEmpty()) {
//		    try {
//		        number = Integer.parseInt(numberString);
//		    } catch (NumberFormatException e) {
//		        // Handle the exception if the number format is invalid
//		        response.sendRedirect("Main.html"); // Redirect to error page or handle error
//		        return;
//		    }
//		} else {
//		    // Handle case where number is null or empty
//		    response.sendRedirect("Registration.html");
//		    return;
//		}

		// Check if Fname and Lname are neither null nor empty
		if (Fname != null && !Fname.trim().isEmpty() && Lname != null && !Lname.trim().isEmpty()) {
		    HttpSession logsession = request.getSession();
		    logsession.setAttribute("Fname", Fname);
		    logsession.setAttribute("Lname", Lname);
		    logsession.setAttribute("number", number); // Save the number to the session if needed
		    response.sendRedirect("Admission.html");
		}
		else
		{
			response.sendRedirect("Registration.html");
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
