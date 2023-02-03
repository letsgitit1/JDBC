package org.iclass;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.iclass.dao.CommunityDao;
import org.iclass.vo.Community;
import org.junit.jupiter.api.Test;

class BoardTest {
	CommunityDao dao=CommunityDao.getInstance();
	//CommunityCommentsDao dao2=CommunityCommentsDao.getInstance();
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//	@Test
//	@DisplayName("(Community)insert-test")
//	void insert() {
//		Community vo= null;
//		vo=Community.builder()
//				.writer("방가방가")
//				.title("가입글 써욧~")
//				.content("안녕하세요 오늘 가입해서 글 남깁니다.")
//				.build()
//				;
//		dao.insert(vo);
//		assertEquals(vo.getIdx(), 12);
//	}
//	@Test
//	@DisplayName("(Community)update-test")
//	void update() {
//		Community vo= Community.builder().idx(3L)
//				.title("먕먕")
//				.content("묭묭")
//				.ip("127.0.0.1231243")
//				.build();
//		dao.update(vo);
//		assertEquals(dao.update(vo), 1);
//	}
//	@Test
//	void delete() {
//		int result=dao.deleteComentesIdx(5);
//		assertEquals(result, 1);
//	}

}
