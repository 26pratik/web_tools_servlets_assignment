import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

import java.io.IOException;
import java.io.PrintWriter;

public class JavaServlets extends HttpServlet{
     
     public void init(){
          System.out.println("Running init................................................................");
     }

     public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();

          out.println("<HTML>");
          out.println("<BODY>");
          out.println("</title></head>\n" + "<body bgcolor=\"#ccffcc\">\n <h1> </h1>\n <table width=\"80%\" border=\"2\">\n <tr bgcolor=\"#1aff1a\">\n <th>Header Name</th><th>Header Value</th>\n" + "</tr>\n");

          Enumeration<String> e = request.getHeaderNames();
          while(e.hasMoreElements()) {
               String headerName = (String)e.nextElement();
               String headerValue = (String)request.getHeader(headerName);
               out.println("<tr><td>" + headerName + "</td> \n");
               out.println("<td>" + headerValue + "</td></tr>\n");
               
          }

          out.println("</table>\n");
          out.println("</BODY>");
          out.println("</HTML>"); 
     }
}