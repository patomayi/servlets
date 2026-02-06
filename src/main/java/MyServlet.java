import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MyServlet", value = "/MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Ejemplos:
        //String paramStart = request.getParameter("start");
        //request.getHeader("la cabecera");
        //request.getSession().setAttribute("answer", "You failed!");

        //response.setContentType("text/html");
        //response.getWriter().println("<h1>Hola DAW1</h1>");
        //para que salte a otra pagina:
        //response.sendRedirect("index.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}