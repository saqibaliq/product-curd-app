<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Home</title>
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome To Product App</h1>
				<!-- Search form -->
			
				<div style="float: right;">

					<button name="searchButton" class="btn btn-primary " style="margin-left: 10px;">Search</button>
				</div>
				<div style="float: right;">
					<input  type="text" name="queryBox" class="form-control mb-3"  placeholder="Search"
						aria-label="Search" />

				</div>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">S.No</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ products}" var="p">
							<tr>
								<th scope="row">TECHNOLOGY${p.id }</th>
								<td>${p.productName }</td>
								<td>${p.productDesc }</td>
								<td class="font-weight-bold">&#8360; ${p.price }</td>

								<td><a href="update/${p.id}"><i
										class="fas fa-pen-nib text-primary"></i></a> <a
									href="delete/${p.id}"><i class="fas fa-trash text-danger"></i></a>
								</td>

							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">
					<a href="add-product" class="btn btn-outline-success">Add
						Product</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>