package Task.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Admission
 */
@WebServlet("/Admission")
public class Admission extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admission() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String branch = request.getParameter("bname");

        if(branch != null && !branch.trim().isEmpty()) {
            response.sendRedirect("Home.html");
        } else {
            response.sendRedirect("Admission.html");
        }
    }

//    // Handle POST request
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String branch = request.getParameter("bname");
//
//        if(branch != null && !branch.trim().isEmpty()) {
//            response.sendRedirect("Home.html");
//        } else {
//            response.sendRedirect("Admission.html");
//        }
//    }

    }


