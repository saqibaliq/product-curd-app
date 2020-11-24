function validate(){
	//One way to get value from Form is define name of the form like myForm etc then fetch
	var pname = document.myForm.name.value;
	//2nd way to get value is by id
	var pdesc = document.getElementById('description').value;
	var price = document.getElementById('price').value;
	
	if(pname==""){
		//alert("please enter product name");
		swal("please enter product name");
		document.myForm.name.focus();
		return false;
	}
	if(pdesc==""){
		swal("please enter product description");
		document.myForm.description.focus();
		return false;
	}
	if(price==""){
		swal("please enter product price");
		document.myForm.price.focus();
		return false;
	}
}
