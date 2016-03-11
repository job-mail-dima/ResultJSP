


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
	
	String[] pars;
	//String f1;
	String f2;
    String f3;
	String f4;
    
    public Test2() {
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*	Map<String, String[]> map = request.getParameterMap();
		Object[] keys = map.keySet().toArray();
		
		//String[] pars = request.getParameterValues((String)keys[k]);
		
		for (int k = 0; k < keys.length; k++) {
		
		String[] pars = request.getParameterValues((String)keys[k]);
		
		test.setFlag1(pars[0]); 
		test.setFlag2(pars[1]); 
		test.setFlag3(pars[2]); 
		test.setFlag4(pars[3]); 
		
		
		System.out.println("Печать значение флагов "+test.getFlag1()+test.getFlag2()+test.getFlag3()+test.getFlag4());
		
		
		}*/
		//String a1 = request.getContentType();
//System.out.println(a1);
	}
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.sendRedirect("req_params.jsp");
		
		Map map = request.getParameterMap();
		Object[] keys = map.keySet().toArray();
		
		
		
	/*	for (int k = 0; k < keys.length; k++) { */
		
		String[] pars = request.getParameterValues((String)keys[0]);
		String[] pars1 = request.getParameterValues((String)keys[1]);
		
		
		String f1 = pars[0];
		test.setFlag1(f1);
		String f2 = pars1[0];
		test.setFlag2(f2);
         //f3 = pars[2];
		 //f4 = pars[3];
		
		System.out.println("Печать значение флагов "+test.getFlag1()+test.getFlag2());
		//System.out.println(pars+" чуть 1 "+f1+" чуть 2 "+f2);
		 
	//	}
		//System.out.println(f1+pars+f2/*+f3+f4*/);
		
	/*	test.setFlag1(pars[0]);
		test.setFlag2(pars[1]);
		test.setFlag3(pars[2]);
		test.setFlag4(pars[3]);
		
		System.out.println("Печать значение флагов "+test.getFlag1()+test.getFlag2()+test.getFlag3()+test.getFlag4());
	*/	
		
		}
		
		}
		
		
		
		

