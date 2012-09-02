package solarcaluator.backend;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Solar_BackendServlet extends HttpServlet {
	
	private int DAILY = 1;
	private int ANNUAL = 365;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/json");

		double power = CalculatePower.calculate(75,CalculatePower.efficiency(45, "n", 0),7,DAILY);
		
		String JSONoutput = "{" +
				" \"Results\": {" +
					" \"Daily Power Generation\": \"" + power + "\"," +
					" \"Annual Power Generation\": \"" + power * ANNUAL + "\" }" +
				" }";
		
		PrintWriter out = resp.getWriter();
		out.println(JSONoutput);
	}
}
