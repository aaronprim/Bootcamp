<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/main.css">
<title>New Catgeory</title>
</head>

<body>
	<div>
		<div>
			<h1> New Category </h1>
			<form:form action="/addcategory" method="post" modelAttribute="categoryObject">
				<h2>
					<form:label path="name"> Name </form:label>
					<form:input path="name"/>
				</h2>
				
				<input type="submit" value="Create"/>
			</form:form>
			
		</div>
		
		<div>
			<form:errors path="categoryObject.*"/>
		</div>
	</div>

</body>

</html>
