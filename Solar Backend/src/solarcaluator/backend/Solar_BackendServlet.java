package solarcaluator.backend;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@SuppressWarnings("serial")
public class Solar_BackendServlet extends HttpServlet {
	
	private int DAILY = 1;
	private int ANNUAL = 365;
	House house = new House();
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/json");
		
		JsonObject json = (JsonObject)new JsonParser().parse(req.getParameter("jsonParameter"));
		JsonObject jsonHouse = json.getAsJsonObject("house");
		
		house.setLocation(jsonHouse.get("city").toString(), jsonHouse.get("country").toString());
		
		double power = CalculatePower.calculate(75,CalculatePower.efficiency(45, "n", 0),7,DAILY);
		
		String JSONoutput = "{" +
				" \"Results\": {" +
					" \"Daily Power Generation\": \"" + power + "\"," +
					" \"Annual Power Generation\": \"" + power * ANNUAL + "\" }" +
				" }";
		
		PrintWriter out = resp.getWriter();
		out.println(JSONoutput);
		//out.println(house.getRoof(0).getName());
		System.out.println(house.getCity());
		//out.println(req.getParameter("jsonParameter"));
		System.out.println("Test");
		System.out.println(req.getParameter("jsonParameter"));
	}
}
