<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<div class="container">

	<div class="row">
		<div class="col-6 offset-4 text-center mt-5"><h5>Create Role </h5></div>
		<div class="col-6 offset-4 p-3">
			<form:form modelAttribute="role">
				<div class="form-group p-3">
					<label>Role Name</label>
					<input type="text" class="form-control">
				
				</div>
			
			</form:form>
		
		</div>
	</div>
</div>