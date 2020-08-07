package com.silver.dukaan;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.CallableStatement;

/**
 * Servlet implementation class ViewChalanServlet
 */
@WebServlet("/ViewChalanServlet")
public class ViewChalanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String date_time = dateFormat.format(date);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "toor");
			CallableStatement callableSt = (CallableStatement) con.prepareCall("{call view_chalan_detail(?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?,?,?,?)}");
			callableSt.setString(1,date_time);
			callableSt.registerOutParameter(2, Types.VARCHAR);
			callableSt.registerOutParameter(3, Types.VARCHAR);
			callableSt.registerOutParameter(4, Types.VARCHAR);
			callableSt.registerOutParameter(5, Types.VARCHAR);
			callableSt.registerOutParameter(6, Types.VARCHAR);
			callableSt.registerOutParameter(7, Types.VARCHAR);
			callableSt.registerOutParameter(8, Types.VARCHAR);
			callableSt.registerOutParameter(9, Types.VARCHAR);
			callableSt.registerOutParameter(10, Types.VARCHAR);
			callableSt.registerOutParameter(11, Types.VARCHAR);
			callableSt.registerOutParameter(12, Types.VARCHAR);
			callableSt.registerOutParameter(13, Types.VARCHAR);
			callableSt.registerOutParameter(14, Types.VARCHAR);
			callableSt.registerOutParameter(15, Types.VARCHAR);
			callableSt.registerOutParameter(16, Types.VARCHAR);
			callableSt.registerOutParameter(17, Types.VARCHAR);
			callableSt.registerOutParameter(18, Types.VARCHAR);
			callableSt.registerOutParameter(19, Types.VARCHAR);
			int i = callableSt.executeUpdate();
			String totalChotaPaani = callableSt.getString(2);
			String totalBadaPaani = callableSt.getString(3);
			String totalBigcola = callableSt.getString(4);
			String totalNewBigcola = callableSt.getString(5);
			String totalTwoFiftyml = callableSt.getString(6);
			String totalSixHundredml = callableSt.getString(7);
			String totalOnePoint25litre = callableSt.getString(8);
			String totalTwoLitre = callableSt.getString(9);
			String totalTetra = callableSt.getString(10);
			String totalSoda = callableSt.getString(11);
			String totalTwoLitreBisleri = callableSt.getString(12);
			String totalChotaZeera = callableSt.getString(13);
			String totalBadaZeera = callableSt.getString(14);
			String totalGlass = callableSt.getString(15);;
			String totalTwomlbadaPaani = callableSt.getString(16);
			String totalTwomlChotaPaani = callableSt.getString(17);
			String totalOther1 = callableSt.getString(18);
			String totalOther2 = callableSt.getString(19);
			
			//Here iam setting the value
			req.setAttribute("500ml", totalChotaPaani);
			req.setAttribute("1Litre", totalBadaPaani);
			req.setAttribute("Bigcola", totalBigcola);
			req.setAttribute("NewBigcola", totalNewBigcola);
			req.setAttribute("250ml", totalTwoFiftyml);
			req.setAttribute("600ml", totalSixHundredml);
			req.setAttribute("1.25litre", totalOnePoint25litre);
			req.setAttribute("2.5litre", totalTwoLitre);
			req.setAttribute("Tetra", totalTetra);
			req.setAttribute("Soda", totalSoda);
			req.setAttribute("2litreBisleri", totalTwoLitreBisleri);
			req.setAttribute("200mlZeera", totalChotaZeera);
			req.setAttribute("300mlZeera", totalBadaZeera);
			req.setAttribute("Glass", totalGlass);
			req.setAttribute("200mlBadaPaani", totalTwomlbadaPaani);
			req.setAttribute("200mlChotaPaani", totalTwomlChotaPaani);
			req.setAttribute("Others1", totalOther1);
			req.setAttribute("Others2", totalOther2);
			
			if(i>0) {
				RequestDispatcher rd = req.getRequestDispatcher("/View.jsp");
				rd.forward(req, res);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
