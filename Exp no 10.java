package com.journaldev.model;

public class Customer {

	private int Orderid;
	private String Customername;
	private int Orderdate;
	public Customer() {
	}
	public int getOrderId() {
		return Orderid;
	}
	public void setOrderId(int Orderid) {
		this.Orderid = id;
	}
	public String getCustomerName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOrderdate() {
		return Date;
	}
}

package com.journaldev.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.journaldev.model.Employee;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Customer> empList = new ArrayList<Customer>();
		Customer cus1 = new Customer();
		Cus1.setOrderId(001); cus1.setCustomerName("John Doe");cus1.setOrderdate(2022-10-03);
                Customer cus2 = new Customer();
		Cus2.setOrderId(002); cus2.setCustomerName("Jane Smith");cus2.setOrderdate(2022-12-03);
	        Customer cus3 = new Customer();
		Cus3.setOrderId(003); cus3.setCustomerName("Bob Johnson");cus3.setOrderdate(2022-15-03);
                cusList.add(cus1);cusList.add(cus2);cusList.add(cus3);
		request.setAttribute("cusList", cusList);
		
		request.setAttribute("htmlTagData", "<br/> creates a new line.");
		request.setAttribute("url", "https://www.journaldev.com");
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
		rd.forward(request, response);
	}

}
