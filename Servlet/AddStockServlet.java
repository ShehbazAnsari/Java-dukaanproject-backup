package com.silver.dukaan;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.CallableStatement;

/**
 * Servlet implementation class AddStockServlet
 */
@WebServlet("/AddStockServlet")
public class AddStockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("im here in adding stock");
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String date_time = dateFormat.format(date);
		
		String chotaPaani = req.getParameter("500ml");
		String badaPaani = req.getParameter("1Litre");
		String bigcola = req.getParameter("bigcola");
		String newBigcola = req.getParameter("newbigcola");
		String twoFiftyml = req.getParameter("250ml");
		String sixHundredml = req.getParameter("600ml");
		String onePoint25litre = req.getParameter("1.25litre");
		String twoLitre = req.getParameter("2.5litre");
		String tetra = req.getParameter("tetra");
		String soda = req.getParameter("Soda");
		String twoLitreBisleri = req.getParameter("2litrebisleri");
		String chotaZeera = req.getParameter("200mlzeera");
		String badaZeera = req.getParameter("300mlzeera");
		String glass = req.getParameter("glass");
		String twomlbadaPaani = req.getParameter("200mlbadapaani");
		String twomlChotaPaani = req.getParameter("200mlchothapaani");
		String other1 = req.getParameter("others1");
		String other2 = req.getParameter("other2");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "toor");
			CallableStatement callableSt = (CallableStatement) con.prepareCall("{call add_stock_detail(?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?,?,?,?)}");
			callableSt.setString(1,chotaPaani);
			callableSt.setString(2,badaPaani);
			callableSt.setString(3,bigcola);
			callableSt.setString(4,newBigcola);
			callableSt.setString(5,twoFiftyml);
			callableSt.setString(6,sixHundredml);
			callableSt.setString(7,onePoint25litre);
			callableSt.setString(8,twoLitre);
			callableSt.setString(9,tetra);
			callableSt.setString(10,soda);
			callableSt.setString(11,twoLitreBisleri);
			callableSt.setString(12,chotaZeera);
			callableSt.setString(13,badaZeera);
			callableSt.setString(14,glass);
			callableSt.setString(15,twomlbadaPaani);
			callableSt.setString(16,twomlChotaPaani);
			callableSt.setString(17,other1);
			callableSt.setString(18,other2);
			callableSt.setString(19,date_time);
			int i = callableSt.executeUpdate();
			if(i>0) {
				RequestDispatcher rd = req.getRequestDispatcher("/addStock.html");
				rd.forward(req, res);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}