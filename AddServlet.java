package demoapp.example;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int k = i + j;
        
        Cookie cookie = new Cookie("k", k + "");
        res.addCookie(cookie);
        
       res.sendRedirect("sq"); 
       

        //RequestDispatcher rd = req.getRequestDispatcher("sq");
        //rd.forward(req, res);
        
        
    }
}
