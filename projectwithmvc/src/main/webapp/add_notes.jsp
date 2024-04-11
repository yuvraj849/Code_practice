<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<h1 class="heading">please fill your form detail</h1>
		<form action="SaveNoteServlet" method="post">
		
			<div class="form-group">
				<label for="title"  >Note title</label> 
				<input
					name="title"
					required
					type="text" 
					class="form-control" 
					id="title"
					aria-describedby="emailHelp" 
					placeholder="Enter here note title"> 
			</div>
			
			<div class="form-group">
				<label for="NoteContent">Note Content</label> 
				<Textarea
					name="content"
					required
					class="form-control" id="content"
					placeholder="enter your content here"
					style="height:200px"></Textarea>
			</div>
			<!--   <div class="form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me
					out</label>
			</div>-->
			<div class="container text-center">
			<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>