<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
		<div class="container rounded bg-seconadary" >
			<div class="row"  >
				
				<div class="col-8 offset-2  mt-5 mb-5" >
				
				
				<div class="card login">
				
					<div class="card-header">
						<h3>Login System</h3>
					</div>	
					<div class="card-body">
						<div class="mb-5 p-5">
							<form:form method="post" modelAttribute="login" id="check_user">
								<div class="form-group">
									<div id="validDiv">
										<div class="mb-3">
											<label>Email</label>
											<input type="text" name="email" id="email" class="ValidateInput form-control"  />
										</div>
										<div class="mb-3">
											<label>password</label>
											<input type="password" name="password" id="password" class="ValidateInput form-control"/>
										</div>
									</div>
									<!-- <input type="button"  value="click"> -->
									<div class="card-footerd d-flex align-items-center justify-content-center">
										<input type="button" value="submit" onclick="checkRegisterDetail()">
									</div>
									
								
								</div>
							
							</form:form>
						</div>
						
					</div>
				
				</div>
					
				</div>
			
			</div>
		
		</div>
		
<script type="text/javascript">
			
	$("input").change(function(){
		$(this).removeClass("error-input");
		$("small").remove();
	});
			
	function checkRegisterDetail(){
		var formData=$("#check_user");
		flage=validateForm(formData);
		if(flage){
			$("#check_user").attr("action","loginCheck");
			$("#check_user").submit();
		}
		return flage
}
</script>
</body>
</html>