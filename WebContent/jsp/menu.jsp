<%@include file="/taglib/taglib.jsp" %>
<div id="search-cart">
	<div class="searchBox">
		<input id="search-input" type="text" name="filter_name" value="Search the site..." />
		<div class="selectCat">
			<span class="selected-cat">All Categories</span>
                        	<ul class="cat-list">
					<s:iterator value='@com.imc.service.MobileService@getAllCategories()' var="categories">
                                            <li class=<s:property  value = "%{#categories.id}"/> > <s:property  value = "%{#categories.title}"/></li>   
                                        </s:iterator>   
                                </ul>
				
		
			<input id="select-cat" type="hidden" name="filter_category_id" value="" />
                        <input id="select-cat-url" type="hidden" name="filter_category_url" value='${pageContext.request.contextPath}' />
		</div>
	</div>
	<a id="button" onclick="searchPhones('${pageContext.request.contextPath}/searchPhonesByAjax')">Search</a>

	<div class="clear"></div>
</div>



