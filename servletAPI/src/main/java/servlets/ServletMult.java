package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/multi")
public class ServletMult extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int x = Integer.parseInt(req.getParameter("value"));
            resp.setStatus(200);
            resp.getWriter().print(x*2);
        }catch (NumberFormatException e){
            resp.setStatus(400);
            resp.getWriter().print(0);
        }

    }


}
