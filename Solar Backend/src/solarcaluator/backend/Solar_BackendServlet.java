package solarcaluator.backend;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

import com.google.gson.Gson;

@SuppressWarnings("serial")
public class Solar_BackendServlet extends HttpServlet {
	
	private int DAILY = 1;
	private int ANNUAL = 365;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//resp.setContentType("application/json");
		resp.setContentType("text/html");

		House house = new Gson().fromJson(req.getParameter("jsonParameter"), House.class);
		
		//JSONObject json = (JSONObject)new JsonParser().parse(req.getParameter("jsonParameter"));
		
		double power = CalculatePower.calculate(75,CalculatePower.efficiency(45, "n", 0),7,DAILY);
		
		String JSONoutput = "{" +
				" \"Results\": {" +
					" \"Daily Power Generation\": \"" + power + "\"," +
					" \"Annual Power Generation\": \"" + power * ANNUAL + "\" }" +
				" }";
		
		PrintWriter out = resp.getWriter();
		out.println(JSONoutput);
		out.println(house.getRoof(0).getName());
		out.println(house.getCity());
	}
}
