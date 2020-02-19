package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ForgotPwd
 */
public class ForgotPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String pw = request.getParameter("pw");
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		
		Model m = new Model();
		m.setEmail(email);
		m.setPw(pw);
		
		int x  = m.fpwd();
		if(x==1)
		{
			response.sendRedirect("/MCAP//successResetPwd.jsp");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
