package com.silver.dukaan;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.CallableStatement;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String hashPassword;


		try {
			hashPassword = hashFunction(password);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","toor");
			CallableStatement cstmt = (CallableStatement) con.prepareCall("{call login(?, ?)}");	
			cstmt.setString(1, username);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			
			int i = cstmt.executeUpdate();
			String procedurePassword = cstmt.getString(2);
			
			if(hashPassword.equals(procedurePassword)) {
				RequestDispatcher rd = req.getRequestDispatcher("/main.html");
				rd.forward(req, res);
			}else {
				RequestDispatcher rd = req.getRequestDispatcher("/index.html");
				rd.forward(req, res);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public String hashFunction(String frontendPassword) throws NoSuchAlgorithmException {
		StringBuffer hexString = new StringBuffer();
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(frontendPassword.getBytes());
		byte[] digest =md.digest();  
	      for (int i = 0;i<digest.length;i++) {
	         hexString.append(Integer.toHexString(0xFF & digest[i]));
	      }
		return hexString.toString();
	}

}
