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
	<h3>변수 정의하기 (set)</h3>
	<!-- int number1 = 100 -->
	<c:set var="number1" value="100" />
	<c:set var="number2">200 </c:set>
	
	<div>number1 : ${number1 }</div>
	<div>number2 : ${number2 }</div>
	
	<div>number1 + number2 = ${number1 + number2 }</div>
	
	<h3>변수 출력 (out)</h3>
	<div>number1 : <c:out value="${number1 }" /></div>
	<div>number:  <c:out value="100" /> </div>
	
	<c:out value="<script> alert('출력')</script>"/>
	<!--
		<c:out value="<script> alert('출력')</script>" escapeXml="false" />
	-->
	<h2>조건문 (if)</h2>
	
	<c:if test="true">
		<h4>조건이 참이다.</h4>
	</c:if>
	
	<c:if test="${number1 > 50 }">
		<h4>number1은 50보다 크다</h4>
	</c:if>
	
	<c:if test="${number1 == 100 }">
		<h4>number1은 100이다.</h4>
	</c:if>
	
	<c:if test="${number2 eq 200 }">
		<h4>number2는 200이다.</h4>
	</c:if>
	
	<c:if test="${number2 ne 222 }">
		<h4>number2는 222가 아니다</h4>
	</c:if>
	
	<c:if test="${!empty number1 }">
		<h4>number1은 비어있있지 않다.</h4>
	</c:if>
</body>
</html>