--다른 기능들 SQL : dao메소드, mapper XML(community.xml)의 id이름을 동일하게
--참고 count(*)함수의 sql문 resultType은 int입니다.

--메인클 idx(3번의 )글
SELECT * FROM COMMUNITY f WHERE idx=3;

--*comments* 댓글 목록 조회
SELECT * FROM COMMUNITYCOMMENTS c WHERE mref=3;

--*setReadCount*
UPDATE COMMUNITY
SET READCOUNT = READCOUNT+1
WHERE idx=3;

--메인글 idx(3번)의 댓글 갯수 : *commentsCount* 
SELECT count(*) FROM COMMUNITYCOMMENTS c WHERE mref=3;

--댓글 개수 업데이트 (댓글 추가,삭제 할때 모두 필요) :*setCommentCount*
UPDATE COMMUNITY
SET COMMENTCOUNT=
	(SELECT count(*)FROM COMMENT c WHERE mref=3)
WHERE idx=3;

--댓글 idx의 삭제
DELETE FROM COMMUNITYCOMMENTS c WHERE idx=2;

--게시판 글몰록은 idx의 내림차순 그리고, rownum 10개씩 조회

