<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<table>
		<tr>
			<td>Welcome ${firstname}</td>
		</tr>
		<tr>
		</tr>
		<tr>
		</tr>
		<tr>
			<td><a href="">Home</a></td>
		</tr>
	</table>
</body>
</html>

		<tr>
				<td><form:label path="custname">CustomerName</form:label></td>
				<td><form:input path="custname" name="custname" id="custname" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" name="password"
						id="password" /></td>
			</tr>
			<tr>
				<td><form:label path="enquiryid">Enquiry Id</form:label></td>
				<td><form:input path="enquiryid" name="enquiryid"
						id="enquiryid" /></td>
			</tr>
			<tr>
			<td><form:label path="jobtype">Job Type</form:label></td>
				<select name="jobtype" id="jobtype">
 				<option value="Self Employed"></option>
  				<option value="Salaried"></option>

</select>
			</tr>
			<tr>
				<td><form:label path="loanamount">Loan Amount</form:label></td>
				<td><form:input path="loanamount" name="loanamount" id="loanamount" /></td>
			</tr>
			
			

			<tr>
				<td></td>
				<td><form:button id="Ok" name="ok">Register</form:button></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="Role1.jsp">Home</a></td>
			</tr>




</body>
</html>