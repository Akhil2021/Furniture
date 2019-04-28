import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class NewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String n=(request.getParameter("fname"));
        String s=(request.getParameter("fpass"));       
        String u="akhil";
        String p="akhil";
        int flag=0;
        if(n.equals(u)&&n.equals(p))
        {
        request.setAttribute("name", n);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("NewServlet1");
        rd.forward(request,response);
        }
        else
        {
            out.print("Enter the details correctly");
        }
        }
        
}
