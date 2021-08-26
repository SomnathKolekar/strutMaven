<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<h2>Add Book</h2>
		<s:form action="updateAction" class="Book">
			<s:textfield name="bookId" label="book Id" class="formTextField" />
			<s:textfield name="bookName" label="book Name" class="formTextField" />
			<s:textfield name="bookAuthor" label="book Author" class="formTextField" />
			<s:textfield name="bookPrice" label="book Price" class="formTextField" />
			<s:submit value="Add" class="actionBtn" />
		</s:form>
	</div>
</body>
</html>