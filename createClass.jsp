<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous"> 

<title>Insert title here</title>

<style type="text/css">

.error{
	
	
	color: red;
}
</style>
 <jsp:include page="header.jsp"></jsp:include> 

</head>

<body>
<br><br><br><br>
	
				<div class="text-center underline">
			
<h3>Add Class</h3></div>

<hr>
<br>
<div style="text-align: left; margin-left: 350px" >

<form:form action="createClass" modelAttribute="classBo" method="post">

<div class="row">


								
								<div class="col-sm-3">
									<div class="form-group">
										<label path="name">Class Name<span
											class="font10 text-danger">*</span></label>
										<form:select type="text" path="name"
											class="form-control required">
											<form:option value="">Select Class</form:option>
											<form:option value="1">1</form:option>
											<form:option value="2">2</form:option>
											<form:option value="3">3</form:option>
											<form:option value="4">4</form:option>
											<form:option value="5">5</form:option>
											<form:option value="6">6</form:option>
											<form:option value="7">7</form:option>
											<form:option value="8">8</form:option>
											<form:option value="9">9</form:option>
											<form:option value="10">10</form:option>

										</form:select>
										<form:errors path="name" class="input_error" />
									</div>
								</div>
								
								<div class="col-sm-3">
									<div class="form-group">
										<label path="section">Section<span
											class="font10 text-danger">*</span></label>
										<form:select type="text" path="section"
											class="form-control required">
											<form:option value="">Select Section</form:option>
											<form:option value="A">A</form:option>
											<form:option value="B">B</form:option>
											<form:option value="C">C</form:option>
											<form:option value="D">D</form:option>
											<form:option value="E">E</form:option>
											<form:option value="F">F</form:option>
											
										</form:select>
										<form:errors path="section" class="input_error" />
									</div>
								</div>
								
								
</div>
<br>
<div style="text-align: right; margin-right: 250px">
								<button type="submit" id="btnsubmit"
									class="btn btn-primary">Submit</button>
						
</div>

</form:form>
</div>
<div class="error">
${errorMessage}
</div>

<br><br><br><br><br>
</body>
 <jsp:include page="footer.jsp"></jsp:include> 

</html>
