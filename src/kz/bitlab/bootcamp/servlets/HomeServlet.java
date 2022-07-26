package kz.bitlab.bootcamp.servlets;

import kz.bitlab.bootcamp.db.Computer;
import kz.bitlab.bootcamp.db.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/indexpage")
public class HomeServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ArrayList<Computer> computers = DBManager.getComputers();
        request.setAttribute("kompukterler", computers);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
