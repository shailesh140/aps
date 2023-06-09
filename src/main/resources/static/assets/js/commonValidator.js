
function validateForm(formField){
	 var flage=true;
	 var inputField=$(formField).find("input.ValidateInput,select.ValidateInput,textarea.ValidateInput")
	 $("small").remove();
	 $(inputField).each(function(){
		if($.trim($(this).val())==''){
			$(this).addClass("error-input")
			$(this).after("<small style='color:red'>Please Fill this field</small><br>");
			 flage=false;
		}	
	});
	return flage;
	
}




/**Start Form Valildation  */

$("form input[type='reset']").click(function(){
resetForm($(this).parents("form"));
});
function resetForm(form) {
$(form)[0].reset();
removeNotEmptyFieldStyleClassOnResetForm(form);
removeInvalidInputClassAndMessage(form);
}
function removeNotEmptyFieldStyleClassOnResetForm(form) {

//Remove not-empty-field Class From All Field if exist at reset time
$(form).find('input,select,textarea').removeClass("in-valid-input");
}
// End :: For reset Form and remove validateStyle class

//Start :: Form validate means if any .ValidateInput class Field is empty before save then it will not save
function formValidate(form) {
var flag = true;

//For All Input[type='any'], Select, Textarea Field which element has a ValidateInput Class
var field=$(form).find('input.ValidateInput,select.ValidateInput,textarea.ValidateInput');

for(var i=0; i<field.length; i++){
if($.trim(field[i].value) == 'null' || $.trim(field[i].value) == 'NaN' || $.trim(field[i].value) == ""){
$(form).find(field[i]).addClass("in-valid-input");
flag=false;
}
}
return flag;
}
//End :: Form validate

//Start :: Remove in-valid-input Class on focus of Form Validated
$(".ValidateInput").click(function(){
//Check non-empty-class is that class exist, if exist then remove it
$(this).removeClass("in-valid-input");
});
//End :: Remove ValidateStyle Class of Form Valiated