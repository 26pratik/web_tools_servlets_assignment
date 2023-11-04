import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.util.Enumeration;

import java.io.IOException;
import java.io.PrintWriter;

public class JavaServletsForm extends HttpServlet{
     
     public void init(){
          System.out.println("Starting...............");
     }

     public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();

          out.println("<HTML>");
          out.println("<BODY>");

          out.println("</title></head>\n" + "<body bgcolor=\"#e6ffe6\">\n");
		out.println("<h1> HttpServletReqeust GetX() </h1>\n"
		        + "<table width=\"95%\" border=\"2\" >\n"
		        + "<tr>\n"
		        + "<th> getX() method</th><th> Response</th>\n" + "</tr>\n");

          // getX() Methods from HttpServletRequest class


         
          out.println("<tr><td> getHttpServletMapping </td> \n");
          out.println("<td>" + request.getHttpServletMapping() + "</td></tr>\n");

          out.println("<tr><td> getContextPath </td> \n");
          out.println("<td>" + request.getContextPath() + "</td></tr>\n");

          out.println("<tr><td> getCookies </td> \n");
          out.println("<td>" + request.getCookies() + "</td></tr>\n");

          out.println("<tr><td> getPathInfo </td> \n");
          out.println("<td>" + request.getPathInfo() + "</td></tr>\n");

          out.println("<tr><td> getMethod </td> \n");
          out.println("<td>" + request.getMethod() + "</td></tr>\n");

          out.println("<tr><td> getRemoteUser </td> \n");
          out.println("<td>" + request.getRemoteUser() + "</td></tr>\n");

          out.println("<tr><td> getRequestedSessionId </td> \n");
          out.println("<td>" + request.getRequestedSessionId() + "</td></tr>\n");

          out.println("<tr><td> getAuthType </td> \n");
          out.println("<td>" + request.getAuthType() + "</td></tr>\n");

          out.println("<tr><td> getPathTranslated </td> \n");
          out.println("<td>" + request.getPathTranslated() + "</td></tr>\n");

          out.println("<tr><td> getRequestURI </td> \n");
          out.println("<td>" + request.getRequestURI() + "</td></tr>\n");

          out.println("<tr><td> getRequestURL </td> \n");
          out.println("<td>" + request.getRequestURL() + "</td></tr>\n");

          out.println("<tr><td> getServletPath </td> \n");
          out.println("<td>" + request.getServletPath() + "</td></tr>\n");

          out.println("<tr><td> getSession </td> \n");
          out.println("<td>" + request.getSession() + "</td></tr>\n");

          out.println("<tr><td> getQueryString </td> \n");
          out.println("<td>" + request.getQueryString() + "</td></tr>\n");


          out.println("</table>\n");

          // getX() Methods from ServletRequest Interface

          out.println("<h1 > ServletRequest GetX() </h1>\n"
		        + "<table width=\"70%\" border=\"1\" >\n"
		        + "<tr bgcolor=\"#949494\">\n"
		        + "<th> getX() method</th><th> Response</th>\n" + "</tr>\n");

         

         
          out.println("<tr><td> getLocalAddress </td> \n");
          out.println("<td>" + request.getLocalAddr() + "</td></tr>\n");

          out.println("<tr><td> getServerName </td> \n");
          out.println("<td>" + request.getServerName() + "</td></tr>\n");

          out.println("<tr><td> getServerPort </td> \n");
          out.println("<td>" + request.getServerPort() + "</td></tr>\n");

          out.println("<tr><td> getLocalPort </td> \n");
          out.println("<td>" + request.getLocalPort() + "</td></tr>\n");

          out.println("<tr><td> getProtocol </td> \n");
          out.println("<td>" + request.getProtocol() + "</td></tr>\n");

          out.println("<tr><td> getRemoteAddr </td> \n");
          out.println("<td>" + request.getRemoteAddr() + "</td></tr>\n");

          out.println("<tr><td> getDateHeader </td> \n");
          out.println("<td>" + request.getDateHeader("If-Modified-Since") + "</td></tr>\n");

          out.println("<tr><td> getLastModified </td> \n");
          out.println("<td>" + getLastModified(request) + "</td></tr>\n");

          out.println("<tr><td> getContentType </td> \n");
          out.println("<td>" + request.getContentType() + "</td></tr>\n");

          out.println("<tr><td> getCharacterEncoding </td> \n");
          out.println("<td>" + request.getCharacterEncoding() + "</td></tr>\n");

          out.println("<tr><td> getContentLength </td> \n");
          out.println("<td>" + request.getContentLength() + "</td></tr>\n");

          out.println("<tr><td> getContentLengthLong </td> \n");
          out.println("<td>" + request.getContentLengthLong() + "</td></tr>\n");

          out.println("<tr><td> getRemoteHost </td> \n");
          out.println("<td>" + request.getRemoteHost() + "</td></tr>\n");

          out.println("<tr><td> getRemotePort </td> \n");
          out.println("<td>" + request.getRemotePort() + "</td></tr>\n");

          out.println("<tr><td> getScheme </td> \n");
          out.println("<td>" + request.getScheme() + "</td></tr>\n");

          out.println("<tr><td> getLocalName </td> \n");
          out.println("<td>" + request.getLocalName() + "</td></tr>\n");

        

         

          out.println("</table>\n");
          out.println("</BODY>");
          out.println("</HTML>"); 
     }
}