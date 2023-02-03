package org.iclass.community;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iclass.dao.CommunityDao;
import org.iclass.main.Controller;
import org.iclass.vo.Community;

public class UpdateController implements Controller{

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		CommunityDao dao=CommunityDao.getInstance();
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String temp=request.getParameter("idx");
		Long idx=Long.parseLong(temp);
		Community vo=Community.builder()
				.title(title)
				.content(content)
				.idx(idx)
				.ip(temp)
				.build();
				dao.update(vo);
			response.sendRedirect("read.jsp");
	}
}
