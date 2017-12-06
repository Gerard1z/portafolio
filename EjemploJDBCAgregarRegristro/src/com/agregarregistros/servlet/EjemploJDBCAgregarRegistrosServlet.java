package com.agregarregistros.servlet;

import java.io.IOException;
import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class EjemploJDBCAgregarRegistrosServlet
 */
@WebServlet("/EjemploJDBCAgregarRegistrosServlet")
public class EjemploJDBCAgregarRegistrosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemploJDBCAgregarRegistrosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String surl="jdbc:mysql://localhost:3306/prueba";
		String suser = "root";
		String spass = "charmin12";
		
		String txtidUsuario= request.getParameter("txtIdUser");
		String txtnombreUsuario= request.getParameter("txtUsername");
		String txtPassword= request.getParameter("txtpassword");
		
		
		Connection conn;
		Statement st;
		int iResultados = 0;
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn =(Connection) DriverManager.getConnection(surl, suser, spass);
			st= (Statement) conn.createStatement();
			iResultados = st.executeUpdate("INSERT INTO usuarios (idusuario,nombreUsuario,passwordUsuario) values ("+txtidUsuario+",'"+txtnombreUsuario+"','"+txtPassword+"')");
			
			
			if(iResultados==1)
			{
				response.getWriter().append("REGISTRO AÑADIDO");
			}
			conn.close();
			st.close();
		}
		
		catch(Exception e)
		{
			response.getWriter().append("el error es:  "+e);
		}
	
		
		
	}

}
