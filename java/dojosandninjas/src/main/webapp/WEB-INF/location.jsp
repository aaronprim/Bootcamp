<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>"${dojo.name}"</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
  <div>
  	<div>
  		<h1><c:out value="${dojo.name}"/> Ninjas </h1>
  		<table>
  			<thead>
  				<tr>
  					<th scope="col"> First Name </th>
  					<th scope="col"> Last Name </th>
  					<th scope="col"> Age </th>
  				</tr>
			</thead>
			<tbody>
				<c:forEach items="${dojos.ninjas}" var="ninja">
				<tr>
					<td> <c:out value="${ninja.firstName}"/></td>
					<td> <c:out value="${ninja.lastName}"/></td>
					<td> <c:out value="${ninja.age}"/></td>
				</tr>
				</c:forEach>
			</tbody>	
  		</table>
  	</div>
  </div>
  
  
  
</body>
</html>