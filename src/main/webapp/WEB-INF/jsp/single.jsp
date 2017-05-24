<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib  prefix="core" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="userHeader.jsp" %>

<div>
<table class="table table-bordered table-hover table-striped">
 <tr><th>Product Id</th>
<th>Product name</th>
<th>Supplier Id</th>
<th>Category Id</th>
<th>Price</th>
<th>Stock</th>
<th>Image</th>

</tr> 
<core:forEach items="${ProductDetails}" var="product">
<tr class="success" >

                <td>${product.productId}</td> 
                 <td>${product.productName}</td>
                <td>${product.supId}</td>
                <td> ${product.catId}</td>
                    <td> ${product.productPrice}</td>
                    <td> ${product.stock}</td>
                
                   <td><img src="./resources/images/${product.productId}.jpg" height="200px" width="200px"/></td>
                     <td><a href="addCart?acid=${product.productId}">AddtoCart</a></td>
</tr>

</core:forEach>



</table>
</div>



</body>
</html>