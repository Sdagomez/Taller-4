package edu.unbosque.Workshop4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "Image", value = "/Image")
public class Image extends HttpServlet {
    private edu.unbosque.Workshop4.model.UserDao userDao;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String carga = "index2.html";


        PrintWriter out = response.getWriter();
        String description = request.getParameter("textarea2");
        String image = request.getParameter("image");

        Date date = new Date();


        try {
            response.addCookie(new Cookie("image", image));
            userDao.addInformatioImage(date, description, image);



        } catch (Exception r) {
            System.out.println(r);
        }
    }
}
