package org.iclass.community;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iclass.dao.CommunityDao;
import org.iclass.main.Controller;

public class DeleteController implements Controller {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		CommunityDao dao=CommunityDao.getInstance();
		String temp=request.getParameter("idx");
		int idx=Integer.parseInt(temp);
		dao.delete(idx);
		response.sendRedirect("list");
	}

}
