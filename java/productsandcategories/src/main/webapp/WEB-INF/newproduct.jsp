<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/main.css">
<title>New Product</title>
</head>

<body>
	<div>
		<div>
			<h1> New Product </h1>
			<form:form action="/addproduct" method="post" modelAttribute="productObject">
				<h2>
					<form:label path="name"> Name </form:label>
					<form:input path="name"/>
				</h2>
				
				<h2>
					<form:label path="description"> Description </form:label>
					<form:input path="description"/>
				</h2>
				
				<h2>
					<form:label path="price"> Price </form:label>
					<form:input path="price"/>
				</h2>
				
				<input type="submit" value="Create"/>
			</form:form>
			
		</div>
		
		<div>
			<form:errors path="productObject.*"/>
		</div>
	</div>

</body>

</html>