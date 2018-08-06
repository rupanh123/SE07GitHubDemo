/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import business.Student;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Phap
 */
@WebServlet("/list")
public class StudentController extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException{
        Student st= new Student(1, "Huynh Phuoc Phap");
        request.setAttribute("student", st);
        String url = "/thanks.jsp";
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
     @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException{
         doPost(request, response);
    }
}
