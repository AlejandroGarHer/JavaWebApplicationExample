package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/Servlet1")
public class Servlet1 extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // send HTML page to client
        out.println("<html>");
        out.println("<head><title>Actividad 1. Servlets. Servlet 1</title></head>");
        out.println("<body>");
        out.println("<h1>Formulario</h1>");
        out.println("<form action=\"/Servlet2\">");
        out.println("<label for=\"fname\">Nombre:</label><br>");
        out.println("<input type=\"text\" id=\"fname\" name=\"fname\" value=\"\"><br>");
        out.println("<label for=\"lname\">Apellido 1:</label><br>");
        out.println("<input type=\"text\" id=\"lname\" name=\"lname\" value=\"\"><br>");
        out.println("<label for=\"lname2\">Apellido 2:</label><br>");
        out.println("<input type=\"text\" id=\"lname2\" name=\"lname2\" value=\"\"><br><br>");
        out.println("<input type=\"submit\" value=\"Enviar\">");
        out.println("</form>");
        out.println("<p></p>");
        out.println("<p>Al hacer click en el botón \"Enviar\", los datos del formulario se envían a la página \"/Servlet2\".</p>");
        out.println("</body></html>");
    }

}
