<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/main.css">
<title><c:out value="${category.name}"/></title>
</head>
<body>
	<div>
		<h1> <c:out value="${category.name}"/></h1>
		<h2> Products: </h2>
		<c:forEach items="${category.products}" var="prod">
			<h3> <c:out value="${product.name}"/></h3>
		</c:forEach>			
	</div>
	<div>
		<form:form action="/attachproduct" method="post" modelAttribute="categoryProductObj">
			<h2> 
				<form:label path="product"> Add Product: </form:label>
				<form:select path="product">
					<c:forEach items="${products}" var="prod">
						<form:option value="${product.id}"><c:out value="${product.name}"/> </form:option>
					</c:forEach>
				</form:select>
			</h2>
			<form:hidden path="category" value="${category.id}" />
			<input type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>
	