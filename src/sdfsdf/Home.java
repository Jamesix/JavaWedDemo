package sdfsdf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Home",urlPatterns = {"/eee.do"})
public class Home extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      /*  PrintWriter out= response.getWriter();
        out.print("sdfsdfsdfd");
        out.close();*/
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
