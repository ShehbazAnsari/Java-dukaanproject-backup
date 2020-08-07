package com.silver.dukaan;

import java.io.IOException;
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
 * Servlet implementation class ViewStockServlet
 */
@WebServlet("/ViewStockServlet")
public class ViewStockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "toor");
			
				//Sum of addChalandetail Table
			
			  CallableStatement sumOfChallan = (CallableStatement) con.prepareCall("{call sum_addchalandetail(?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?,?,?)}");
			  sumOfChallan.registerOutParameter(1, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(2, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(3, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(4, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(5, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(6, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(7, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(8, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(9, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(10, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(11, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(12, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(13, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(14, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(15, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(16, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(17, Types.VARCHAR);
			  sumOfChallan.registerOutParameter(18, Types.VARCHAR);
			  
			  int i =sumOfChallan.executeUpdate();
			  
			  String chalanChotaPaani =sumOfChallan.getString(1) == null?"0":sumOfChallan.getString(1);
			  String chalanBadaPaani = sumOfChallan.getString(2) == null?"0":sumOfChallan.getString(2);
			  String chalanBigcola = sumOfChallan.getString(3) == null?"0":sumOfChallan.getString(3);
			  String chalanNewBigcola = sumOfChallan.getString(4) == null?"0":sumOfChallan.getString(4);
			  String chalanTwoFiftyml = sumOfChallan.getString(5) == null?"0":sumOfChallan.getString(5);
			  String chalanSixHundredml = sumOfChallan.getString(6) == null?"0":sumOfChallan.getString(6);
			  String chalanOnePoint25litre = sumOfChallan.getString(7) == null?"0":sumOfChallan.getString(7);
			  String chalanTwoLitre =sumOfChallan.getString(8) == null?"0":sumOfChallan.getString(8);
			  String chalanTetra = sumOfChallan.getString(9) == null?"0":sumOfChallan.getString(9);
			  String chalanSoda = sumOfChallan.getString(10) == null?"0":sumOfChallan.getString(10);
			  String chalanTwoLitreBisleri = sumOfChallan.getString(11) == null?"0":sumOfChallan.getString(11);
			  String chalanChotaZeera = sumOfChallan.getString(12) == null?"0":sumOfChallan.getString(12);
			  String chalanBadaZeera = sumOfChallan.getString(13) == null?"0":sumOfChallan.getString(13);
			  String chalanGlass = sumOfChallan.getString(14) == null?"0":sumOfChallan.getString(14);
			  String chalanTwomlbadaPaani = sumOfChallan.getString(15) == null?"0":sumOfChallan.getString(15);
			  String chalanTwomlChotaPaani = sumOfChallan.getString(16) == null?"0":sumOfChallan.getString(16);
			  String chalanOther1 = sumOfChallan.getString(17) == null?"0":sumOfChallan.getString(17);
			  String chalanOther2 = sumOfChallan.getString(18) == null?"0":sumOfChallan.getString(18);
			
			//Sum of Stock Table
			CallableStatement sumOfStock = (CallableStatement) con.prepareCall("{call sum_addstockdetail(?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?,?,?)}");
			sumOfStock.registerOutParameter(1, Types.VARCHAR);
			sumOfStock.registerOutParameter(2, Types.VARCHAR);
			sumOfStock.registerOutParameter(3, Types.VARCHAR);
			sumOfStock.registerOutParameter(4, Types.VARCHAR);
			sumOfStock.registerOutParameter(5, Types.VARCHAR);
			sumOfStock.registerOutParameter(6, Types.VARCHAR);
			sumOfStock.registerOutParameter(7, Types.VARCHAR);
			sumOfStock.registerOutParameter(8, Types.VARCHAR);
			sumOfStock.registerOutParameter(9, Types.VARCHAR);
			sumOfStock.registerOutParameter(10, Types.VARCHAR);
			sumOfStock.registerOutParameter(11, Types.VARCHAR);
			sumOfStock.registerOutParameter(12, Types.VARCHAR);
			sumOfStock.registerOutParameter(13, Types.VARCHAR);
			sumOfStock.registerOutParameter(14, Types.VARCHAR);
			sumOfStock.registerOutParameter(15, Types.VARCHAR);
			sumOfStock.registerOutParameter(16, Types.VARCHAR);
			sumOfStock.registerOutParameter(17, Types.VARCHAR);
			sumOfStock.registerOutParameter(18, Types.VARCHAR);
			
			int z = sumOfStock.executeUpdate();
			
			String stockChotaPaani = sumOfStock.getString(1) == null?"0":sumOfStock.getString(1);
			String stockBadaPaani = sumOfStock.getString(2) == null?"0":sumOfStock.getString(2);
			String stockBigcola = sumOfStock.getString(3) == null?"0":sumOfStock.getString(3);
			String stockNewBigcola = sumOfStock.getString(4) == null?"0":sumOfStock.getString(4);
			String stockTwoFiftyml = sumOfStock.getString(5) == null?"0":sumOfStock.getString(5);
			String stockSixHundredml = sumOfStock.getString(6) == null?"0":sumOfStock.getString(6);
			String stockOnePoint25litre = sumOfStock.getString(7) == null?"0":sumOfStock.getString(7);
			String stockTwoLitre = sumOfStock.getString(8) == null?"0":sumOfStock.getString(8);
			String stockTetra = sumOfStock.getString(9) == null?"0":sumOfStock.getString(9);
			String stockSoda = sumOfStock.getString(10) == null?"0":sumOfStock.getString(10);
			String stockTwoLitreBisleri = sumOfStock.getString(11) == null?"0":sumOfStock.getString(11);
			String stockChotaZeera = sumOfStock.getString(12) == null?"0":sumOfStock.getString(12);
			String stockBadaZeera = sumOfStock.getString(13) == null?"0":sumOfStock.getString(13);
			String stockGlass = sumOfStock.getString(14) == null?"0":sumOfStock.getString(14);
			String stockTwomlbadaPaani = sumOfStock.getString(15) == null?"0":sumOfStock.getString(15);
			String stockTwomlChotaPaani = sumOfStock.getString(16) == null?"0":sumOfStock.getString(16);
			String stockOther1 = sumOfStock.getString(17) == null?"0":sumOfStock.getString(17);
			String stockOther2 = sumOfStock.getString(18) == null?"0":sumOfStock.getString(18);
			
			
			/*
			 * Total Value to show in viewStock page formula
			 *  Total = stock - chalan
			 */
			int finalChotaPaani = Integer.parseInt(stockChotaPaani) - Integer.parseInt(chalanChotaPaani);
			int finalBadaPaani = Integer.parseInt(stockBadaPaani) - Integer.parseInt(chalanBadaPaani);
			int finalBigcola = Integer.parseInt(stockBigcola) - Integer.parseInt(chalanBigcola);
			int finalNewBigcola = Integer.parseInt(stockNewBigcola) - Integer.parseInt(chalanNewBigcola);
			int finalTwoFiftyml = Integer.parseInt(stockTwoFiftyml) - Integer.parseInt(chalanTwoFiftyml);
			int finalSixHundredml = Integer.parseInt(stockSixHundredml) - Integer.parseInt(chalanSixHundredml);
			int finalOnePoint25litre = Integer.parseInt(stockOnePoint25litre) - Integer.parseInt(chalanOnePoint25litre);
			int finalTwoLitre = Integer.parseInt(stockTwoLitre) - Integer.parseInt(chalanTwoLitre);
			int finalTetra = Integer.parseInt(stockTetra) - Integer.parseInt(chalanTetra);
			int finalSoda = Integer.parseInt(stockSoda) - Integer.parseInt(chalanSoda);
			int finalTwoLitreBisleri = Integer.parseInt(stockTwoLitreBisleri) - Integer.parseInt(chalanTwoLitreBisleri);
			int finalChotaZeera = Integer.parseInt(stockChotaZeera) - Integer.parseInt(chalanChotaZeera);
			int finalBadaZeera = Integer.parseInt(stockBadaZeera) - Integer.parseInt(chalanBadaZeera);
			int finalGlass = Integer.parseInt(stockGlass) - Integer.parseInt(chalanGlass);
			int finalTwomlbadaPaani = Integer.parseInt(stockTwomlbadaPaani) - Integer.parseInt(chalanTwomlbadaPaani);
			int finalTwomlChotaPaani = Integer.parseInt(stockTwomlChotaPaani) - Integer.parseInt(chalanTwomlChotaPaani);
			int finalOther1 = Integer.parseInt(stockOther1) - Integer.parseInt(chalanOther1);
			int finalOther2 = Integer.parseInt(stockOther2) - Integer.parseInt(chalanOther2);
			
			
			//Here iam setting the value
			req.setAttribute("500ml", finalChotaPaani);
			req.setAttribute("1Litre", finalBadaPaani);
			req.setAttribute("Bigcola", finalBigcola);
			req.setAttribute("NewBigcola", finalNewBigcola);
			req.setAttribute("250ml", finalTwoFiftyml);
			req.setAttribute("600ml", finalSixHundredml);
			req.setAttribute("1.25litre", finalOnePoint25litre);
			req.setAttribute("2.5litre", finalTwoLitre);
			req.setAttribute("Tetra", finalTetra);
			req.setAttribute("Soda", finalSoda);
			req.setAttribute("2litreBisleri", finalTwoLitreBisleri);
			req.setAttribute("200mlZeera", finalChotaZeera);
			req.setAttribute("300mlZeera", finalBadaZeera);
			req.setAttribute("Glass", finalGlass);
			req.setAttribute("200mlBadaPaani", finalTwomlbadaPaani);
			req.setAttribute("200mlChotaPaani", finalTwomlChotaPaani);
			req.setAttribute("Others1", finalOther1);
			req.setAttribute("Others2", finalOther2);
			
			if(i>0 ||z>0) {
				RequestDispatcher rd = req.getRequestDispatcher("/ViewStock.jsp");
				rd.forward(req, res);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
