package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/githubers")
public class GithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Githuber valou = new Githuber("Val", "val@valou.com", "valval", "valm", "urltime" );
        Githuber ben = new Githuber("Ben", "ben@valou.com", "benben", "benc", "urltime" );
        Githuber yannis = new Githuber("Yannis", "yannis@valou.com", "yanyan", "yanb", "urltime" );
        Githuber alex = new Githuber("Alex", "alex@valou.com", "aleale", "alexc", "urltime" );
        Githuber clem = new Githuber("Clement", "clem@valou.com", "clemclem", "cleml", "urltime" );

        List<Githuber> users = new ArrayList<Githuber>();
        users.add(valou);
        users.add(ben);
        users.add(alex);
        users.add(yannis);
        users.add(clem);
        request.setAttribute("users", users);
        request.getRequestDispatcher("/githubers.jsp").forward(request, response);
    }
}
