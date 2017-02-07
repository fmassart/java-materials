package org.javamat.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String profile = req.getParameter("profile");
        if (profile != null) {
            resp.getWriter().append("Param profile is : ").append(profile).append("\n");
        }
        resp.getWriter().append("Ok");
        resp.getWriter().flush();
        resp.getWriter().close();
    }

}
