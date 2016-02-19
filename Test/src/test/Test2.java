package test;


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
		
		//<html><head><title>Request Parameters</title></head><body>
		
		for (int k = 0; k < keys.length; k++) {
		/*
		 Т.О. массив pars будет содержать динамические параметры, передаваемые в
		http://localhost:8080/tests/req_params.jsp?a=b&c=d&a=zzz&empty=&empty=&1=22
		*/
		String[] pars = request.getParameterValues((String)keys[k]);
		
		test.setFlag1(pars[0]);
		test.setFlag2(pars[1]);
		test.setFlag3(pars[2]);
		test.setFlag4(pars[3]);
		
		System.out.println("Печать значение флагов "+test.getFlag1()+test.getFlag2()+test.getFlag3()+test.getFlag4());
		
		//System.out.println(pars);
		//out.print("<tr><td>" + k + "</td><td>'" + keys[k] + "'</td><td>");
		//for (int j = 0; j < pars.length; j++) {
		//if (j > 0) out.print(", ");
		//System.out.print("'" + pars[j] + "'");
		}
		//out.println("</td></tr>");
		}
		
		
		
		}

