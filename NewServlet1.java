
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class NewServlet1 extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String l=(String)request.getAttribute("name");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("Welcome "+l);
    }

    

}
