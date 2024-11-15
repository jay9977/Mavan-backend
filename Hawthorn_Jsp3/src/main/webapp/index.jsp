<%@ page language="java" contentType="text/html; charset=US-ASCII"
   pageEncoding="US-ASCII" isELIgnored = "false"%>

   <!DOCTYPE html>
      <html lang="en">

      <head>

      </head>

      <body>
		
		<form action="Teacher" method="get""><!--here action means after that Teacher and method  has to run -->
			<lable>Name</lable>
			<input type=text name="sname">
			<input value="Click me" type="submit">
		</form>
		
      	<h1>${tname}</h1>
     </body>

      </html>
<!--here i am creating UI for getting input from user by using form-->