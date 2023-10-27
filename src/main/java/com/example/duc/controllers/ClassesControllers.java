package com.example.duc.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.duc.entity.Classes;
import com.example.duc.service.ClassesService;

@WebServlet(name = "ClassesControllers", value = "/ClassesControllers")
public class ClassesControllers extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		ClassesService classesService = new ClassesService();
		HttpSession session = req.getSession(true);
		switch (action){
			case "add_class_view":
				 resp.sendRedirect("add-class-view.jsp");
				 break;
			case "home":
				 resp.sendRedirect("index.jsp");
				 break;
			case "add_class":
	              String msLop = req.getParameter("msLop");
	              String tenLop = req.getParameter("tenLop");
	              String giaovienCN = req.getParameter("giaovienCN");
	              Classes classes = new Classes(msLop, tenLop, giaovienCN);
	              classesService.save(classes);
	              resp.sendRedirect("index.jsp");
	              break;
		}
	}
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
