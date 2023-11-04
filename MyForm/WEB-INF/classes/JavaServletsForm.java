import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.*;

@WebServlet(name = "javaservletsform", value = "/javaservlet.htm")
public class JavaServletsForm extends HttpServlet {

    public void init() {
    }

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Setting Response Type as HTML
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        //Getting the parameters from the input
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String cpassword = request.getParameter("cpassword");
        String pictureLoc = request.getParameter("img");
        String country = request.getParameter("country");
        String gender = request.getParameter("gender");
        String hobby[] = request.getParameterValues("hobby");
        String address = request.getParameter("address");

        //Writing the parameters on the browser
        out.println("<!DOCTYPE HTML>");
        out.println("<HTML>");
        out.println("<head><link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>");
        out.println("<title>Form Details</title>");
        out.println("</head>");
        out.println("<body class='container-fluid'>");
        out.println("<h1 class='mt-1'>Form Details</h1>");
        out.println("<h3>Display using request.getParameter('name')</h3>");
        out.println("<b>Email: </b>" + email + "<br>");
        out.println("<b>Password: </b>" + password + "<br>");
        out.println("<b>Confirm Password: </b>" + cpassword + "<br>");
        out.println("<b> Picture: </b>" + pictureLoc + "<br>");
        out.println("<b>Country: </b>" + country + "<br>");
        out.println("<b>Gender: </b>" + gender + "<br>");
        out.println("<b>Hobbies: </b>");
        out.println("<ul>");
        for(String val : hobby){
            out.println("<li>" + val + "</li>");
        }
        out.println("</ul>");
        out.println("<b>Address: </b>" + address + "<br>");
        out.println("</body>");

        out.println("</HTML>");

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        handleRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        handleRequest(request, response);
    }

    public void destroy() {
    }

}