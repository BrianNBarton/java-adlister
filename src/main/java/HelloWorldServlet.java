import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {

    private int count;



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String firstName = request.getParameter("firstName");
    boolean resetCount = request.getParameter("reset") != null;
    if (resetCount)
    {
        count = 0;
    }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, " + firstName + "!</h1>");
        out.println("hit counter" + (count++ * count++ * count++));


        if (firstName == null) {
            firstName = "World";
        }

    }
}