<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Languages</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="container">
  
  	<table>
  		<thead>
  			<tr>
  				<th scope="col"> Name </th>
  				<th scope="col"> Creator </th>
  				<th scope="col"> Version </th>
  				<th scope="col"> Action </th>
			</tr>
  		</thead>
  		
  		<tbody>
  			<c:forEach items="${languages}" var="lang">
  				<tr>
  					<td> <a href="languages/<c:out value="${lang.id}"/>"> <c:out value="${lang.name}"/></a></td>
  					<td><c:out value="${lang.creator}"/></td>
  					<td><c:out value="${lang.version}"/></td>
  					<td> <a href="languages/delete/<c:out value="${lang.id}"/>">Delete</a> <a href="languages/edit/<c:out value="${lang.id}"/>">Edit</a></td>
  				</tr>
  			</c:forEach>
  		</tbody>
  	</table>
  	
  	<div>
		<form:form action="/languages" method="post" modelAttribute="addNew">
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
   	
  </div>
</body>
</html>