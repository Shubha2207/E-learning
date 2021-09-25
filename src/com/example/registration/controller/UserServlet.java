package com.example.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.registration.dao.UserDao;
import com.example.registration.model.User;


@WebServlet("/register")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UserDao userDao = new UserDao();
	
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/register.jsp");
		dispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int user_id = Integer.parseInt(request.getParameter("user_id"));
        String user_name = request.getParameter("user_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        int phone_no = Integer.parseInt(request.getParameter("phone_no"));
//        Long photo = Long.parseLong(request.getParameter("photo"));
        
        User user = new User();
        user.setUser_id(user_id);
        user.setUser_name(user_name);
        user.setEmail(email);
        user.setPassword(password);
        user.setAddress(address);
        user.setPhone_no(phone_no);
//        user.setPhoto(photo);
        

        try {
            userDao.registerUser(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//        response.sendRedirect("UserDetails.jsp");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/UserDetails.jsp");
		dispatcher.forward(request, response);
	}

}
