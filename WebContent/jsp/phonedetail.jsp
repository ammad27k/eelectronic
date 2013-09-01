<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/taglib/taglib.jsp" %>

<div id="content">

	<ul class="product-tab">
		<li class="description"><a href="javascript:void(0);"class="active">Description</a></li>
		<li class="prod-attribute"><a href="javascript:void(0);">Specification</a></li>
		<li class="reviews"><a href="javascript:void(0);">Reviews <em>(0)</em></a></li>

	</ul>



	<div id="description" class="tab-content">
  	<h2 class="heading">Apple Cinema 30"</h2>
  	<p>
	<font face="helvetica,geneva,arial" size="2"><font face="Helvetica" size="2">The 30-inch Apple Cinema HD Display delivers an amazing 2560 x 1600 pixel resolution. Designed specifically for the creative professional, this display provides more space for easier access to all the tools and palettes needed to edit, format and composite your work. Combine this display with a Mac Pro, MacBook Pro, or PowerMac G5 and there's no limit to what you can achieve. </font><br>
	<br>
	<font face="Helvetica" size="2">The Cinema HD features an active-matrix liquid crystal display that produces flicker-free images that deliver twice the brightness, twice the sharpness and twice the contrast ratio of a typical CRT display. Unlike other flat panels, it's designed with a pure digital interface to deliver distortion-free images that never need adjusting. With over 4 million digital pixels, the display is uniquely suited for scientific and technical applications such as visualizing molecular structures or analyzing geological data. </font><br>
	<br>
	<font face="Helvetica" size="2">Offering accurate, brilliant color performance, the Cinema HD delivers up to 16.7 million colors across a wide gamut allowing you to see subtle nuances between colors from soft pastels to rich jewel tones. A wide viewing angle ensures uniform color from edge to edge. Apple's ColorSync technology allows you to create custom profiles to maintain consistent color onscreen and in print. The result: You can confidently use this display in all your color-critical applications. </font><br>
	<br>
	<font face="Helvetica" size="2">Housed in a new aluminum design, the display has a very thin bezel that enhances visual accuracy. Each display features two FireWire 400 ports and two USB 2.0 ports, making attachment of desktop peripherals, such as iSight, iPod, digital and still cameras, hard drives, printers and scanners, even more accessible and convenient. Taking advantage of the much thinner and lighter footprint of an LCD, the new displays support the VESA (Video Electronics Standards Association) mounting interface standard. Customers with the optional Cinema Display VESA Mount Adapter kit gain the flexibility to mount their display in locations most appropriate for their work environment. </font><br>
	<br>
	<font face="Helvetica" size="2">The Cinema HD features a single cable design with elegant breakout for the USB 2.0, FireWire 400 and a pure digital connection using the industry standard Digital Video Interface (DVI) interface. The DVI connection allows for a direct pure-digital connection.</font></font></p>
<h3>
	Features:</h3>
<p>
	Unrivaled display performance</p>
<ul>
	<li>
		30-inch (viewable) active-matrix liquid crystal display provides breathtaking image quality and vivid, richly saturated color.</li>
	<li>
		Support for 2560-by-1600 pixel resolution for display of high definition still and video imagery.</li>
	<li>
		Wide-format design for simultaneous display of two full pages of text and graphics.</li>
	<li>
		Industry standard DVI connector for direct attachment to Mac- and Windows-based desktops and notebooks</li>
	<li>
		Incredibly wide (170 degree) horizontal and vertical viewing angle for maximum visibility and color performance.</li>
	<li>
		Lightning-fast pixel response for full-motion digital video playback.</li>
	<li>
		Support for 16.7 million saturated colors, for use in all graphics-intensive applications.</li>
</ul>
<p>
	Simple setup and operation</p>
<ul>
	<li>
		Single cable with elegant breakout for connection to DVI, USB and FireWire ports</li>
	<li>
		Built-in two-port USB 2.0 hub for easy connection of desktop peripheral devices.</li>
	<li>
		Two FireWire 400 ports to support iSight and other desktop peripherals</li>
</ul>
<p>
	Sleek, elegant design</p>
<ul>
	<li>
		Huge virtual workspace, very small footprint.</li>
	<li>
		Narrow Bezel design to minimize visual impact of using dual displays</li>
	<li>
		Unique hinge design for effortless adjustment</li>
	<li>
		Support for VESA mounting solutions (Apple Cinema Display VESA Mount Adapter sold separately)</li>
</ul>
<h3>
	Technical specifications</h3>
<p>
	<b>Screen size (diagonal viewable image size)</b></p>
<ul>
	<li>
		Apple Cinema HD Display: 30 inches (29.7-inch viewable)</li>
</ul>
<p>
	<b>Screen type</b></p>
<ul>
	<li>
		Thin film transistor (TFT) active-matrix liquid crystal display (AMLCD)</li>
</ul>
<p>
	<b>Resolutions</b></p>
<ul>
	<li>
		2560 x 1600 pixels (optimum resolution)</li>
	<li>
		2048 x 1280</li>
	<li>
		1920 x 1200</li>
	<li>
		1280 x 800</li>
	<li>
		1024 x 640</li>
</ul>
<p>
	<b>Display colors (maximum)</b></p>
<ul>
	<li>
		16.7 million</li>
</ul>
<p>
	<b>Viewing angle (typical)</b></p>
<ul>
	<li>
		170° horizontal; 170° vertical</li>
</ul>
<p>
	<b>Brightness (typical)</b></p>





  </div>
    <div id="prod-attribute" class="tab-content prod-attribute">
    
   	<table class="attribute">
            <thead>
        <tr>
          <td colspan="2">Network</td>
        </tr>
      </thead>
			<s:iterator value="mobileNetworks" var="mobNetwork">
				<tbody>
					<tr>
						<td><s:property value="#mobNetwork.type"/></td>
						<td><s:property value="#mobNetwork.title"/></td>
					</tr>
				</tbody>

			</s:iterator>
		</table>
		
		<br> 
		
	<table class="attribute">
            <thead>
        <tr>
          <td colspan="2">Alerts</td>
        </tr>
      </thead>
			<s:iterator value="mobileAlertsType" var="mobAlert">
				<tbody>
					<tr>
						<td></td>
						<td><s:property value="#mobAlert.title"/></td>
					</tr>
				</tbody>

			</s:iterator>
		</table>
    
    <table class="attribute">
    	
       <thead>
        <tr>
          <td colspan="2">Display</td>
        </tr>
      </thead>
			<tbody>
					<tr>
						<td>Type</td>
						<td>
							
							<s:set name="mCount" value="mobileDisplayType.size -1"></s:set>
							<s:iterator value="mobileDisplayType" var="mobDisplay" status="rowStatus">
								<s:property value="#mobDisplay.title	"/>
									<s:if test="%{#rowStatus.index != #mCount}">  
    								 ,
    							</s:if>
							</s:iterator>
							
						</td>	
					</tr>
			</tbody>
		</table>      
     
  </div>
      <div id="reviews" class="tab-content">
		<s:iterator value="phoneReviews" var="rev">
			<div id="review">
				<div class="content">
					<s:property value="#rev.reviewsDesc" />
				</div>
			</div>

		</s:iterator>


		<h2 id="review-title">Write a review</h2>
    <div class="review-form">
    <form  id="formtheme2" method="post" action='${pageContext.request.contextPath}/addReviews'>
    	<s:hidden name="id" value ="%{#attr.id}"></s:hidden>
				<b>Your Name:</b>
				<br>
				<input type="text" name="name" value="" data-bvalidator="alpha,minlength[10],required">
				<br>
				<br>
				<b>Your Review:</b>
				<textarea name="text" cols="40" rows="8" style="width: 98%;"  data-bvalidator="required" data-bvalidator-msg="Please enter your comments"></textarea>
				<span style="font-size: 11px;"><span style="color: #FF0000;">Note:</span>
					HTML is not translated!</span>
				
				<div class="buttons">
					<div class="right">
						<!-- <a id="button-review" class="button">Continue</a> -->
						<input type = "submit" id="button-review" class = "button" value = "Continue">
					</div>
				</div>
    
    
    </form>
    
			
		</div>
  </div>
   
  

  </div>
  
<script type="text/javascript">            
    
    var optionsRed = {
        classNamePrefix: 'bvalidator_red_'
    };
    
    $(document).ready(function () {
        $('#formtheme2').bValidator(optionsRed);
        
        $('#formtheme2').submit(function(){
        	var $form = jQuery(this);
        	var n = $form.serializeArray();
        	url = $form.attr( 'action' );
        	jQuery.post(url,{'id':n[0].value,'name':n[1].value,'comments':n[2].value },function(data,status){
        		var content = '<div id="review"> '+ '<div class="content">' + data.comments + '</div> </div>';
        		jQuery('#reviews').prepend(content);
        		jQuery('#reviews')[0].scrollIntoView(true);
        		
        	});
        	return false;
        });
    });
    
  
    
</script>