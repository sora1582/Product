package com.itheima.product.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.product.domain.Order;
import com.itheima.product.service.OrderService;

public class FindOrderItemsByOrderId extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String orderid = request.getParameter("orderid");
		
		OrderService os = new OrderService();
		Order order = os.findOrdersByOrderId(orderid);
		
		request.setAttribute("order", order);
		request.getRequestDispatcher("/orderInfo.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
