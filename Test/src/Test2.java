

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test2")
public class Test2 extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	
	private Test test;
    
    public Test2() {
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String[]> map = request.getParameterMap();
		Object[] keys = map.keySet().toArray();
		
		for (int k = 0; k < keys.length; k++) {
		
		String[] pars = request.getParameterValues((String)keys[k]);
		
		test.setFlag1(pars[0]); 
		test.setFlag2(pars[1]); 
		test.setFlag3(pars[2]); 
		test.setFlag4(pars[3]); 
		
		
		System.out.println("Печать значение флагов "+test.getFlag1()+test.getFlag2()+test.getFlag3()+test.getFlag4());
		
		
		}
	}

}
