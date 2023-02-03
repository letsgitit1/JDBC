package org.iclass.community;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iclass.dao.CommunityCommentsDao;
import org.iclass.dao.CommunityDao;
import org.iclass.main.Controller;
import org.iclass.vo.Community;
import org.iclass.vo.CommunityComments;

public class ReadController implements Controller{

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CommunityDao dao=CommunityDao.getInstance();
		CommunityCommentsDao dao2=CommunityCommentsDao.getInstance();
		String temp=request.getParameter("idx");
		int idx=Integer.parseInt(temp);
		request.setAttribute("vo", dao.selectByIdx(idx));
		List<CommunityComments> cmtlist=dao.comments(idx);
		request.setAttribute("cmtlist",cmtlist);
		RequestDispatcher dispatcher=request.getRequestDispatcher("read.jsp");
		dispatcher.forward(request, response);
		// 조회수 증가
		dao.setReadCount(idx);
	}
}
