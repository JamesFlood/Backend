package solarcaluator.backend;
import java.io.IOException;
import javax.servlet.http.*;
import com.google.appengine.api.backends.BackendService;
import com.google.appengine.api.backends.BackendServiceFactory;

@SuppressWarnings("serial")
public class Solar_BackendServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		
		BackendService backendsApi = BackendServiceFactory.getBackendService();

		// Get the backend handling the current request.
		String currentBackendName = backendsApi.getCurrentBackend();
		
		
	}
}
