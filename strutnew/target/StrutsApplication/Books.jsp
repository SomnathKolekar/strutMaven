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
<h2>Struts 2 Create, Read, Update and Delete (CRUD) Example using JDBC</h2>
	<div style="margin-top: 40px;">
	<s:form action="addAction">
      <button class="button-delete"> <a href="addBook.jsp" >click here</a></button>
    </s:form>
		<s:if test="noData==true">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>Id</th>
						<th>Name</th>
						<th>Author</th>
						<th>Price</th>
						<th>Action</th>
					</tr>
				</thead>
				<s:iterator value="bookList">
					<tr>
						<td><s:property value="bookId" /></td>
						<td><s:property value="bookName" /></td>
						<td><s:property value="bookAuthor" /></td>
						<td><s:property value="bookPrice" /></td>
						<td>
							<a href="updateDataAction.action?bookId=<s:property value="bookId"/>">
								<button class="button-update">Update</button>
							</a>
							<a href="deleteAction.action?bookId=<s:property value="bookId"/>">
								<button class="button-delete">Delete</button>
							</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		<s:else>
			<div style="color: red;">No Data Found.</div>
		</s:else>
	</div></body>
</html>