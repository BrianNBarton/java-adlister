
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

@WebServlet(name = "notEvenMyFinalFormServlet", urlPatterns = "/order-form")
public class OrderFormServlet extends HttpServlet {




//2. Create a servlet that returns a simple form if the user navigates
//    to ```/order-form```. In servering up HTML, you may need to
//    include ```response.setHeader("content-type", "text/html");```.
//    The form should include an input for the name of a product and an
//    input for how many of the product they want to order. The method of
//    the form should be ```POST``` and the action should be ```/order-
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");


//        String product = request.getParameter("product");
//        String quantity = request.getParameter("quantity");
//
//        System.out.println("product: " + product);
//        System.out.println("quantity: " + quantity);
//
//        PrintWriter writer = response.getWriter();
//
//        String htmlRespone = "<html>";
//        htmlRespone += "<h2>You ordered: " + quantity + " of product " + product + "</h2>";
//        htmlRespone += "</html>";
//
//        writer.println(htmlRespone);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "This isnt even my final form";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";

        out.println(docType +
                        "<html><form action=\"action_form_process.jsp\" method=\"GET\">\n" +
                        "<head><title>" + title + "</title></head>\n" +
                        "<body bgcolor = \"#f0f0f0\">\n" +
                        "<h1 align = \"center\">" + title + "</h1>\n" +
                        "<ul>\n" +
                        "  <li><b>Quantity: <input type=\"text\" name\"quantity\"</b>: "
                        + request.getParameter("quantity") + "\n" +
                        "  <li><b>product: <input type=\"text\" name\"product\"</b>: "
                        + request.getParameter("product") + "\n" +
                        "</ul>\n" +
                        "</body>" +
                "</html>"
        );
    }
    // Method to handle POST method request.
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }
}


