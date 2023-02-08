package org.iclass;

import org.iclass.dao.CommunityDao;
import org.iclass.vo.Community;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class PageListTest {

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void insertMany() {
		CommunityDao dao= CommunityDao.getInstance();
		for(int i=1;i<300;i++) {
			dao.insert(Community.builder()
					.title("오늘의 주제는"+i)
					.content("주말은 어떻게 잘 보낼 것인가"+i)
					.writer("김자바"+i)
					.ip("192.268.1.200")
					.build()
					);
		}
	}

}
