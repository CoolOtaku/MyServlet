package servlet;

import helper.GetHTML;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Main")
public class Main extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        start(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        start(request,response);
    }

    private void start(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter window = response.getWriter();
        GetHTML html = new GetHTML();
        window.write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>My super project!</title>\n" +
                "</head>");
        window.write("<body style=\"padding: 0px; margin: 0px;\">");
        window.write(html.get("Head"));
        window.write(html.get("Content"));
        window.write("</body>");


    }
}
