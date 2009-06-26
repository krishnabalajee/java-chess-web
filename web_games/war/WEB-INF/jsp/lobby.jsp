<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
<head>
	<title>Chess - Brasee.com</title>
	<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="css/menu.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="css/lobby.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="css/smoothness/jquery-ui-1.7.1.custom.css" type="text/css" media="screen" />
	<script type="text/javascript" src="js/lobby.js"></script>
	<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui-1.7.1.custom.min.js"></script>
	<script type="text/javascript" src="js/jquery.corner.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			initialize();
		});
	</script>	
</head>
<body>
	<div id="pageborder">
		<div id="page">
			<div id="header"><table border="0" cellpadding="0" cellspacing="0" width="100%"><tr><td align="left" valign="top"><a href="<c:url value="/"/>"><img src="img/games_header_link.jpg" alt="Brasee.com Games"/></a></td><td align="right" valign="top"><a href="/"><img src="img/games_header_back_to_main.jpg" alt="Brasee.com Home"/></a></td></tr></table></div>
			<div id="nav">
				<ul>
					<li><a href="lobby.htm"><img src="img/chess_icon.png" alt="Lobby"/> Lobby</a></li>
					<li><a href="chessSingleClient.htm"><img src="img/chess_icon.png" alt="Chess (same computer)"/> Chess (same computer)</a></li>
				</ul>
  			</div> 
			<div id="container">
				<div id="leftcontent">

					<div class="leftSubpanelDivOuter"><div class="leftSubpanelDivInner">
						<center><div id="chatOutput"></div></center>
						<input type="text" id="chatInput"></input>
					</div></div> 
					
				</div> <!-- /leftcontent -->
				
				<div id="rightcontent">

					<div class="subpanelDivOuter"><div class="subpanelDivInner">
						<div class="subpanelHeader">Online Users</div>
					</div></div>
					
				</div> <!-- /rightcontent -->
				
			</div> <!-- /container -->
			<div id="footer-wrapper">
				<div id="footer">
					<br/>
					Created by Kaleb Brasee.
					<br/>
					<br/>
					<a href="http://code.google.com/p/java-chess-web">Available on Google Code</a>.
					<br/>
					&nbsp;
				</div> <!-- /footer -->
			</div> <!-- /footer-wrapper -->
		</div> <!-- /page -->
	</div> <!-- /pageborder -->
	
</body>
</html>