<%@include file="/taglib/taglib.jsp" %>
<div id="search-cart">
	<div class="searchBox">
		<input id="search-input" type="text" name="filter_name" value="Search the site..." />
		<div class="selectCat">
			<span class="selected-cat">All Categories</span>
			
				<ul class="cat-list">
					<li><span> All Categories </span>
					<li class="20">Desktops</li>
					<li class="18">Notebooks</li>
					<li class="25">Components</li>
					<li class="57">Tablets</li>
					<li class="17">Software</li>
					<li class="24">Phones &amp; PDAs</li>
					<li class="33">Cameras</li>
					<li class="34">MP3 Players</li>
				</ul>
				
		
			<input id="select-cat" type="hidden" name="filter_category_id" value="" />
		</div>
	</div>
	<a id="button" onclick="searchPhones('${pageContext.request.contextPath}/searchPhonesByAjax')">Search</a>

	<div class="clear"></div>
</div>



