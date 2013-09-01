<%@include file="/taglib/taglib.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<div id="top">
	<div id="welcome">
		<p>
			Welcome visitor you can <a
				href="http://www.webiz.mu/themes/opencart/megastore/index.php?route=account/login">login</a>
			or <a
				href="http://www.webiz.mu/themes/opencart/megastore/index.php?route=account/register">create
				an account</a>.
		</p>
	</div>
	<ul class="links">
		<li class="phone"><span></span><a href="tel:123-456-789">123-456-789</a></li>
		<li><a
			href="http://www.webiz.mu/themes/opencart/megastore/index.php?route=account/account">My
				Account</a>
			<ul>
				<li><a
					href="http://www.webiz.mu/themes/opencart/megastore/index.php?route=account/wishlist"
					id="wishlist-total">Wish List (0)</a></li>
				<li><a
					href="http://www.webiz.mu/themes/opencart/megastore/index.php?route=checkout/cart">Shopping
						Cart</a></li>
				<li><a
					href="http://www.webiz.mu/themes/opencart/megastore/index.php?route=checkout/checkout">Checkout</a></li>
			</ul></li>
		<li class="lang"></li>
		<li class="curr"><a href="javascript:void(0);">Currency</a>
			<ul id="currency">
			</ul></li>
	</ul>
	<div class="clear"></div>
</div>


<header>
	<h1 id="logo">
		<s:url value="%{#request.contextPath}/home.action" var="homelink"></s:url>
		<s:a href="%{homelink}">
			
			<img src="${pageContext.request.contextPath}/images/logo.jpg" title="MegaStore" alt="MegaStore" />
		</s:a>
		
		
	</h1>

	<div class="clear"></div>
</header>