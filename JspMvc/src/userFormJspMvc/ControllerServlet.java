package userFormJspMvc;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		LoginBean bean=new LoginBean();
		bean.setName(name);
		bean.setEmail(email);
		bean.setPassword(password);
		request.setAttribute("bean",bean);
		boolean status=bean.validate();
		if(status) {
			request.getRequestDispatcher("LiginSuccess.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("LoginError.jsp").forward(request, response);		
		}	
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}
