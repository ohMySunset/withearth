<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/views/include/basicset.jsp"%>

</head>

<body class="subpage">
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<div class="row uniform">
		<h1>새로운 맛집 추가</h1>
		<hr>
		<form method="post" enctype="multipart/form-data">
			<div class="row uniform">
				<div class="6u 12u$(xsmall)">
					상호명<input type="text" name="mTitle" id="mTitle" value=""/>
				</div>
				<div class="6u 12u$(xsmall)">
					주소<input type="text" name="mAddr" id="mAddr" value=""/>
				</div>
				<div class="6u 12u$(xsmall)">
					시간<input type="text" name="mTime" id="mTime" value=""/>
				</div>
				<div class="6u 12u$(xsmall)">
					전화번호<input type="text" name="mNum" id="mNum" value=""/>
				</div>
				<div class="6u$ 12u$(xsmall)">
					소개글<input type="text" name="mCont" id="mCont" value="" />
				</div>
				
				
				<div class="6u$ 12u$(xsmall)">
					이미지첨부<input type="file" multiple="multiple" id="mImg" name="mfile" />
				</div>

				<div class="3u$ 12u$(small)">
					<input type="submit" value="등록하기">
					<input type="button" value="목록">
					<input type="button" value="글쓰기">
				</div>
			</div>
		</form>
	</div>

	<%@ include file="/WEB-INF/views/include/footer.jsp"%>


</body>
</html>