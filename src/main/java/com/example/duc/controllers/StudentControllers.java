package com.example.duc.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.duc.entity.Student;
import com.example.duc.service.StudentService;

@WebServlet(name = "StudentControllers", value = "/StudentControllers")
public class StudentControllers extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		StudentService studentService = new StudentService();
		HttpSession session = req.getSession(true);
		switch (action){
		case "list_student_view":
            List<Student> ls = studentService.getAll();
            session.setAttribute("students",ls);
            resp.sendRedirect("list_student_view.jsp");
            break;
		case "home":
			 resp.sendRedirect("index.jsp");
			 break;
		}
	}
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
