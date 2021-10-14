<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>조건문 (choose, when, otherwise)</h2>
	<!--  70이하면 치킨 80 이하면 샐러드 그게아니면 굶어! -->
	<c:set var="weight" value="86" />
	
	<c:choose>
		<c:when test="${weight <= 70 }">
			<h4>치킨먹자</h4> 
		</c:when>
		<c:when test="${weight <= 80 }">
			<h4>샐러드 먹자</h4>
		</c:when>
		<c:otherwise>
			<h4>굶어!</h4>
		</c:otherwise>
	
	</c:choose>
	
	<h2>반복문 (forEach)</h2>
	<%-- 0 ~ 4  
	for(int i = 0; i < 4; i+++)
	--%>
	<c:forEach var="i" begin="0" end="4" step="1">
		${i } 
	</c:forEach>
	<br>
	<%-- 16~ 20 --%>
	<c:forEach var="i" begin="16" end="20" step="1" varStatus="status">
		${i } ${status.current } ${status.first } ${status.last } ${status.count } ${status.index } <br>
	</c:forEach>
	
	<br>
	
	<%-- for(String fruit : fruits) --%>
	<c:forEach var="fruit" items="${fruits }" varStatus="status">
		<h4>${fruit } :::: ${status.count } ${status.index }</h4>
	</c:forEach>
	
	<%-- List<Map > 사용하기 --%>
	<c:forEach var="user" items="${users }" varStatus="status">
		<h3>${status.count }번째 사람 정보 </h3>
		<ul>
			<li>이름 : ${user.name }</li>
			<li>나이 : ${user.age}</li>
			<li>취미 : ${user.hobby }</li>
		</ul>
	</c:forEach>
	
</body>
</html>