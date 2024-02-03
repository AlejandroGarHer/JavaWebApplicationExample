package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/Servlet2")
public class Servlet2 extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String nombre = request.getParameter("fname");
        String apellido1 = request.getParameter("lname");
        String apellido2 = request.getParameter("lname2");

        out.println("<html>");
        out.println("<head><title>Actividad 1. Servlets. Servlet 2</title></head>");
        out.println("<body>");
        out.println("<h1>¡Bienvenid@ "+nombre+" !</h1>");
        out.println("<h2>Datos introducidos</h2>");
        out.println("<p>Nombre: " + nombre + "</p>");
        out.println("<p>Apellido 1: " + apellido1 + "</p>");
        out.println("<p>Apellido 2: " + apellido2 + "</p>");

        out.println("</body></html>");
    }

}

