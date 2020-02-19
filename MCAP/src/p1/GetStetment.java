package p1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetStetment
 */
public class GetStetment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		HttpSession session =request.getSession();
		String accno = (String) session.getAttribute("accno");
		Model m = new Model();
		m.setAccno(accno);
		ArrayList al1=m.getStatement();
		ArrayList al2=m.al2;
		session.setAttribute("al1",al1);
		session.setAttribute("al2", al2);
		try
		{
			response.sendRedirect("/MCAP/getStatementDisp.jsp");
		}
		catch(Exception e)
		{
			
		}
	}
}







