package com.agregarregistro.servlet;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class EjemploJDBCAgregarRegistroServlet
 */
@WebServlet("/EjemploJDBCAgregarRegistroServlet")
public class EjemploJDBCAgregarRegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemploJDBCAgregarRegistroServlet() {
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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String surl="jdbc:mysql://localhost:3306/prueba";
		String suser = "root";
		String spass = "charmin12";
		String sSql = "SELECT * FROM Usuarios";
		
		Connection conn;
		Statement st;
		ResultSet rsDatos;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn =(Connection) DriverManager.getConnection(surl, suser, spass);
			st= (Statement) conn.createStatement();
			rsDatos=st.executeQuery(sSql);
			
			while(rsDatos.next())
				{
				response.getWriter().append(rsDatos.getInt("idUsuario") + "\n");
				response.getWriter().append(rsDatos.getString("nombreUsuario") + "\n");
				response.getWriter().append(rsDatos.getString("passwordUsuario") + "\n");
			
				}
			
			conn.close();
			st.close();
			rsDatos.close();
		}
		
		
			
			catch(Exception e)
			{
				response.getWriter().append("el error es:  "+e);
			}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
