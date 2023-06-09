<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <style>
    	.in-valid-input {
		    border: 1px solid red !important;
		}
		.in-valid-input:focus {
		    box-shadow: 0 0 0 0.25rem rgb(253 13 13 / 25%) !important;
		}
		.non-empty-field {
	border: 1px solid red!important;
}
.in-valid-input {
    border: 1px solid red !important;
}
.in-valid-input:focus {
    box-shadow: 0 0 0 0.25rem rgb(253 13 13 / 25%) !important;
}
.in-valid-input-msg{
	position: absolute!important;
	color: red !important;
	font-size: 0.8rem  !important;
	font-family: monospace !important;
}
    </style>
	<div class="container-fuid">
			<div class="row">
				<div class="col-6 offset-3 mt-5 mb-5">
					<div class="card login" >
						<div class="card-header d-flex justify-content-center">
							<h4 style="font-size: 40px">Admin Registration</h4>
						</div>
						<form:form id="signup" modelAttribute="user">
							<div class="card-body">
									<div class="p-5">
										<div class="form-group d-flex flex-column mb-3">
											<div>
												<label>First Name</label>
												<input name="firstName" id="firstName" class="form-control ValidateInput"/>
											</div>
											
											<div>
												<label>Middle Name</label>
												<input class="form-control ValidateInput" id="middleName" name="middleName" />
											</div>
													
											<div>
												<label>Last Name</label>
												<input class="form-control ValidateInput" id="lastName" name="lastName" />
											</div>
											
											<div>
												<label>Email Id</label>
												<input  class="form-control ValidateInput" id="email"  name="email" />
											</div>
														 		
											<div>
												<label>Password</label>
												<input type="password" name="password" id="password" class="form-control ValidateInput" />
											</div>
											
											<div>
												<label>Confirm Password</label>
												<input type="password" name="confirm_password" id="confirm_password" class="form-control ValidateInput" />
											</div>
														 		
											<div>
												<label>Mobile</label>
												<input name="mobile" id="mobile" class="form-control"/>					
											</div>
											
													
											<div>
												<div class="form-check">
													<input type="radio" class="form-check-input" name="gender"  value="M"/>
													<label class="form-check-label" for="flexRadioDefault1">male</label>
												</div>
												<div class="form-check">
													<input type="radio" class="form-check-input" name="gender" value="F"/>
													<label class="form-check-label" for="flexRadioDefault1">Female</label>
												</div>
											</div>	 		
										</div>
									</div>
							</div>
						
							<div class="card-footer d-flex justify-content-center">
								<button id="register"  type="button" class="mb3 bg-success text-white" onclick="checkRegisterDetail()">Register</button>
							</div>
					</form:form>
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
		var formData=$("#signup");
		flage=validateForm(formData);
		if(flage){
			$("#signup").attr("action","registration");
			$("#signup").submit();
		}
		
	}
</script>