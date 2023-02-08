package org.iclass.community;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.iclass.dao.NewMemberDao;
import org.iclass.main.Controller;
import org.iclass.vo.NewMember;
public class LoginActionController implements Controller {
	@Override
	   public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	      String id = request.getParameter("id");
	      String password = request.getParameter("password");

	      HttpSession session = request.getSession();

	      NewMemberDao dao = NewMemberDao.getInstance();

	      Map<String, String> map = new HashMap<String, String>();

	      map.put("id", id);
	      map.put("password", password);
	      NewMember vo = dao.login(map);
	      String url=request.getContextPath();
	      String back=(String)session.getAttribute("back");
	         
	 		if(vo != null) {		
	 			//로그인 성공
	 			session.setAttribute("user",vo);  //핵심.
	 			if(back!=null) { 
	 				url=back;
	 				session.removeAttribute("back");	//back 이름의 애트리뷰트 삭제
	 			}	
	 		}else {			//로그인 실패
	 			url="login?incorrect=y";
	 		}
	      response.sendRedirect(url);
	   }
}
