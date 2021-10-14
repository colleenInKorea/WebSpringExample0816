<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%-- 숫자 포메팅 --%>
	<c:set var="number" value="123456789" />
	<h3>숫자 출력</h3>
	<fmt:formatNumber value="${number }" />
	
	<%-- type --%>
	<fmt:formatNumber value="${number }" type="number" />
	<br>
	<fmt:formatNumber value="1" type="percent" />
	<br>
	<%-- 35% --%>
	<fmt:formatNumber value="0.35" type="percent" />
	<br>
	
	<%-- 통화 --%>
	<fmt:formatNumber value="${number }" type="currency" /> <br>
	<fmt:formatNumber value="${number }" type="currency" currencySymbol="$" />
	<br>
	<%-- 소수 자리수 --%>
	<fmt:formatNumber  value="3.141952" pattern="#.##" /> <br>
	<fmt:formatNumber  value="3.141952" pattern="0.00" />
	<br>
	${today }<br>
	<fmt:formatDate value="${today }" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초" /><br> 
	<fmt:formatDate var="newDate" value="${today }" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초" />
	${newDate }
	<br>
	<%-- 날짜 문자열을 Date 객체로 변환  --%>
	<fmt:parseDate value="${newDate }" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초" var="date" />
	${date }
	
</body>
</html>