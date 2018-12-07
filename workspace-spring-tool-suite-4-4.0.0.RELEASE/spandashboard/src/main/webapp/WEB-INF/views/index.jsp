<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>welcome!!</h1>
	<pre>
	<form action="saveUser" method="post">
		Id            <input type="text" name="userId" />
		
		First Name    <input type="text" name="fName" />
		
		Last Name     <input type="text" name="lName" />
		
		Email         <input type="text" name="email" /> 
		
		Codice Fiscale <input type="text" name="codiceFiscale" /> 
		<div class="form-group">
               <label for="SelectUserRole">User Type</label>
               <select class="form-control" id="exampleFormControlSelect1">
                 <option> </option>
                 <option>Admin</option>	
                 <option>Student</option>
                 <option>Professor</option>
                </select>
		</div>     
		 <input type="submit" value="save" />
	</form>
	</pre>
</body>
</html>