import javax.servlet.http.HttpServlet;

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

@WebServlet(name="Bonus 3", urlPatterns = "/orderSummary")
public class BonusExercise3 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String product = request.getParameter("product");
        String numberOf = request.getParameter("Quantity");

       System.out.println("<h1> the customer ordered " + numberOf + "this product " + product + "<h1>");


    }
}
