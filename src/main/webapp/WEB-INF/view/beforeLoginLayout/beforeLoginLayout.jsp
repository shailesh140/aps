<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title><tiles:insertAttribute name="title" /></title>
		
		<!-- Bootstrap CSS -->
	    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
	    
	   	<link rel="stylesheet" href="<%= request.getContextPath() %>/assets/css/style.css">
	   	<link rel="stylesheet" href="<%= request.getContextPath() %>/assets/toasts/css/toasts.css">
	   	<link rel="stylesheet" href="<%= request.getContextPath()%>/assets/css/commonValid.css">
	   	<!-- JQuery CDN -->
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
	</head>
	<body>
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="body" />
		<%--<tiles:insertAttribute name="footer" /> --%>
		
		
	
<!-- Boostrap JS CDN -->
<!--     <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script> -->
<script src="https://code.jquery.com/jquery-2.2.4.min.js" type="text/javascript"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    
    <!-- 	Toasts -->
	<script src='<%= request.getContextPath() %>/assets/toasts/js/toasts.js' ></script>
	<script src='<%= request.getContextPath() %>/assets/toasts/js/jquery.toasts.min.js'></script>
	<script src="<%=request.getContextPath()%>/assets/js/commonValidator.js"></script>
</body>
</html>