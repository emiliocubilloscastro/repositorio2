package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.LoginDao;

@WebServlet(name = "ValidadorServlet", urlPatterns = {"/ValidadorServlet"})
public class ValidadorServlet extends HttpServlet {
/**
 * 
 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet ValidadorServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet ValidadorServlet at " + request.getContextPath() + "</h1>");
			out.println("</body>");
			out.println("</html>");			
		}								
	}			
	/**
	 * METODO DOGET Y DOPOST
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	processRequest(request, response);
}

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	
	String usuario, password, msg = null;
	
	//1.-Recibe parametros	
	usuario = request.getParameter("usuario");
	password = request.getParameter("password");
	
	//2.-Validar	
	try {
		if (LoginDao.validar(usuario, password)>0) {
			msg = "Usuario y Contraseña Correcto...Bienvenido Admin";
		}else {
			msg = "Revise su Usuario y Contraseña...y Vuelva a Intentarlo"+ usuario;
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	//3.-Ejecutar logica de Negocio
	msg = msg.toUpperCase();
	
	//4.- Seleccionar Proxima Vista
	RequestDispatcher despachador = request.getRequestDispatcher("/mensaje.jsp");
	
	//5.- Preparar Datos para Vista Seleccionada
			request.setAttribute("mensaje", msg);
				
	//6.- Despachador
			despachador.forward(request, response);
    }

@Override
public String getServletInfo() {
	return "Short description";
}
	
}




