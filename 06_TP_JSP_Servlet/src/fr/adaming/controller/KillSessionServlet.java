package fr.adaming.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class KillSessionServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession maSession = req.getSession(false);
		if (maSession != null) {
			maSession.invalidate();
		}

		RequestDispatcher rd = req.getRequestDispatcher("succes.jsp");
		rd.forward(req, resp);
	}
}
