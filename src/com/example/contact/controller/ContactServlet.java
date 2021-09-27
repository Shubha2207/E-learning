package com.example.contact.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.contact.dao.ContactDao;
import com.example.contact.model.Contact;
import com.example.registration.dao.UserDao;
import com.example.registration.model.User;


@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ContactDao contactDao = new ContactDao();
    
    public ContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/contact.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		int contact_id = Integer.parseInt(request.getParameter("contact_id"));
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        Date dob = null;
		try {
			dob = (Date) sdf.parse(request.getParameter("dob"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        
        Contact contact = new Contact();
        contact.setContact_id(contact_id);
        contact.setUser_id(user_id);
        contact.setFirst_name(first_name);
        contact.setLast_name(last_name);
        contact.setDob(dob);
        

        try {
            contactDao.addContact(contact);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//        response.sendRedirect("UserDetails.jsp");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/contact.jsp");
		dispatcher.forward(request, response);
	}

}
