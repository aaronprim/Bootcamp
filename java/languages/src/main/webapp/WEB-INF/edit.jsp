<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/main.css">
<title><c:out value="${language.name}"/></title>
</head>

<body>
	<div id="container">
		<div>
			<a href="/languages"> <h1> Homepage </h1> </a>
			<a href="/languages/delete/<c:out value="${language.id}"/>"> <h1> Delete </h1></a>
		</div>
		
		<form:form action="/languages/${language.id}" method="post" modelAttribute="language">
			<input type="hidden" name="_method" value="put">
				<p>
					<form:label path="name"> Name </form:label>
					<form:input path="name"/>
					<form:errors path="name"/>
				</p>	
				<p>
					<form:label path="creator"> Creator </form:label>
					<form:input path="creator"/>
					<form:errors path="creator"/>
				</p>
				<p>
					<form:label path="version"> Version </form:label>
					<form:input path="version"/>
					<form:errors path="version"/>  
				</p>		
			<input type="submit" value="Submit"/>
			
		</form:form>
	
	</div>

</body>
	