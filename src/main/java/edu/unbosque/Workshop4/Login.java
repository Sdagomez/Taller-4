package edu.unbosque.Workshop4;

import edu.unbosque.Workshop4.model.UserDao;
import edu.unbosque.Workshop4.model.user;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {

    private edu.unbosque.Workshop4.model.UserDao userDao;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String carga = "index2.html";

        String name = request.getParameter("userName");
        PrintWriter out = response.getWriter();
        System.out.println("holaaaaa");
        try {
            response.addCookie(new Cookie("userName", name));
            if (userDao.existUser(name).equals("pasa")) {
                userDao.agregarNombre(name);
            }
        } catch (Exception r) {
            System.out.println(r);
        }
        response.sendRedirect(carga);
    }

    public void destroy() {
    }
}