package com.evaluacion.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class evalucionsemana5
 */
@WebServlet("/evalucionsemana5")
public class evalucionsemana5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public evalucionsemana5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("index.jsp").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String sNum1;
		String sNum2;
		int iNum1;
		int iNum2;
		
		sNum1= request.getParameter("txtNumber1");
		sNum2= request.getParameter("txtNumber2");
		
		iNum1= Integer.parseInt(sNum1);
		iNum2= Integer.parseInt(sNum2);
		
		for(int i=iNum1; i<=iNum2;i++)
			{
			response.getWriter().append("\n"+i);
			}
		 for (int i=iNum1; i>=iNum2; i--)
		 	{
			 response.getWriter().append("\n"+i);
		 	}
		
		 /*int i =iNum1;
         while(i <=iNum2)
         	{
        	 		response.getWriter().append("\n"+i);i++;
         	}
         
        	 while(i >=iNum2)
        	 	{
        		 response.getWriter().append("\n"+i);i--;
        	 */	}
		
		
		
		
	

}
