
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;



@WebServlet(name = "DaNameServlet", urlPatterns = "/nombre")
public class NameServlet extends HttpServlet {

    String firstName = "Brian";
    String lastName = "Barton";

    String fullName = firstName + " " + lastName;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, "+ fullName +"!</h1>");


    }
}
