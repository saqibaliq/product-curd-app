<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Update Product Details</h1>
				<form name="myForm" action="${pageContext.request.contextPath }/update-product" method="post">
					<input type="hidden" value="${product.id }" name="Id">
					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" name="productName"
							placeholder="Enter the product name"
							value="${product.productName }">
					</div>
					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea class="form-control" id="description" name="productDesc"
							placeholder="Enter the product description" rows="5">${product.productDesc }</textarea>
					</div>
					<div class="form-group">
						<label for="price">Product Price</label> <input type="text"
							class="form-control" id="price" name="price"
							placeholder="Enter the product price" value="${product.price }">
					</div>
					<div class="container text-center">
						<a href="${pageContext.request.contextPath}/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" onclick="return validate();" class="btn btn-warning">Update</button>
					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>