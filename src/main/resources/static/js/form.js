alert("addForm");
	$(document).ready(function(){
		$('.form').validate({

			rules: {
				name: {
					required: true,
					minlength: 3,
					pattern: /^[a-zA-Z]{3,10}$/,
				},
				address: {
					required:true,
					minlength:5,
					
				},
				gender: {
					required: "true",
				},
				interestedinIT: {
					required:true,
					
				},
				coursesinterested: {
					required:true,
					maxlength:0,
					
					
				},
				
				
				
			},
			messages: {
				
				name: {
					required: "please enter name",
					minlength: "Name should be contain  atleast 3 characters",
					pattern:"Name should contain only Alphabet"
				},
				address: {
					required: "please enter address",
					minlength: "address should have atleast 5 characters",
				},
				gender:{
					required: "You must select at least one radiobutton",
				},
				interestedinIT: {
					required: "please select interestedinIT",
				},
				coursesinterested: {
					required: "You must select at least 1 box",
					maxlength: "select no more than {0} boxes",
				},
				
			},
			submitHandler: function(form) {
				form.submit();
			}
		}
		);
		
		
	})