<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/main.css">
<title><c:out value="${product.name}"/></title>
</head>
<body>
	<div>
		<h1> <c:out value="${product.name}"/></h1>
		<h2> Categories: </h2>
		<c:forEach items="${product.categories}" var="cat">
			<h3> <c:out value="${cat.name}"/></h3>
		</c:forEach>
		<h2> Description: <c:out value="${product.description}"/></h2>			
	</div>
	<div>
		<form:form action="/attachcategory" method="post" modelAttribute="categoryProductObj">
			<h2> 
				<form:label path="category"> Add Category: </form:label>
				<form:select path="category">
					<c:forEach items="${categories}" var="prod">
						<form:option value="${cat.id}"><c:out value="${cat.name}"/> </form:option>
					</c:forEach>
				</form:select>
			</h2>
			<form:hidden path="product" value="${product.id}" />
			<input type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>