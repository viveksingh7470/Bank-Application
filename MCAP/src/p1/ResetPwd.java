package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ResetPwd
 */
public class ResetPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		String accno=(String) session.getAttribute("accno");
		String oldpwd=request.getParameter("oldpwd");
		String newpwd=request.getParameter("newpwd");
		Model m=new Model();
		m.setAccno(accno);
		m.setPw(oldpwd);
		m.setNewpwd(newpwd);
		boolean status=m.resetPassword();
		if(status==true)
		{
			response.sendRedirect("/MCAP/successResetPwd.jsp");
		}
		else
		{
			response.sendRedirect("/MCAP/failResetpwd.jsp");
		}
		
		
		
	}

}
