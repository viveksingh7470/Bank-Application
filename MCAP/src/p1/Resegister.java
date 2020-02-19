package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Resegister
 */
public class Resegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void service(HttpServletRequest request , HttpServletResponse response) 
	{
		String custid =request.getParameter("custid");
		String name =request.getParameter("name");
		String pw =request.getParameter("pw");
		String email =request.getParameter("email");
		String balance =request.getParameter("balance");
		String accno =request.getParameter("accno");
		Model m=new Model();
		m.setCustid(custid);
		m.setName(name);
		m.setPw(pw);
		int x=m.register();
		if(x==1)
		{
			try
			{
				response.sendRedirect("/MCAP/seccuse.jsp");
			}
			catch (Exception e)
			{
				
			}
		}
		else
		{
			try
			{
				response.sendRedirect("/MCAP/failresgister.jsp");
			}
			catch (Exception e)
			{
				
			}
		}
		
		
	}
	
}
