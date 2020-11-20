import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(name="cs",urlPatterns={"/affichage"})
public class affichage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int nbLig = Integer.parseInt(request.getParameter("nbLig"));
		int nbCol =Integer.parseInt( request.getParameter("nbCol"));
		PrintWriter out = response.getWriter();
		out.println("<html><head><style>");
		out.println( "table,th,td{ border:2px solid black;border-collapse:collapse;}");
		out.println("</style></head><body><table>");
		for(int i=0; i<nbLig; i++) {
			out.println("<tr>");
			for(int j=0; j<nbCol; j++) {
					out.println("<td>"+j+"</td>");
			}
			out.println("</tr>");
	
	}
		out.println("</table></body></html>");
}
}