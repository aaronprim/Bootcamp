<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
	<title>Dojo Survey</title>
</head>

<body>
    <div>
        <h2> Submitted Info </h2>
    </div>

    <div>
        Name: <c:out value="${name}"> </c:out>
    </div>
    <div>
        Location: <c:out value="${location}"> </c:out>
    </div>
    <div>
        Favorite Location: <c:out value="${language}"> </c:out>
    </div>
    <div>
        Comment: <c:out value="${comment}"> </c:out>
    </div>
</body>

</html>