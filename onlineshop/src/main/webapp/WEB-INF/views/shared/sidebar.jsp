<h1 class="my-4">Shop Name</h1>
<div class="list-group">

	<c:forEach items="${category}" var="cat">
		<a href="${contextRoot}/show/category/${cat.id}/products" class="list-group-item" id="a_${cat.name}">${cat.name}</a> 
	</c:forEach>
	
</div>
