<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
	
</head>
<body background="">
	<br>
	<br>
	<div class = "container">
		<div class = "row">
			<div class = "col-md-6 col-md-offset-3">
				
				<h1>New Password Form</h1>
				<form action="/updatedata" method="Post">
					
					<!-- error message -->
					<!-- <div th:if="${param.error}">
						<div class="alert alert-danger">Invalid username or
							password.</div>
					</div>
				
					logout message
					<div th:if="${param.logout}">
						<div class="alert alert-info">You have been logged out.</div>
					</div> -->
					
					<div class = "form-group">
						<label for ="Email ID"> Token Id </label> :
						<input type="text" class = "form-control" id ="username" name = "token" value="${response}"
						placeholder="Token Id" autofocus="autofocus" readonly>
					</div>
					
					<div class="form-group">
						<label for="password">New Password</label>: <input type="password"
							id="password" name="password" class="form-control"
							placeholder="Enter Password" />
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-sm-6 col-sm-offset-3">
								<input type="submit" name="login-submit" id="login-submit"
									class="form-control btn btn-primary" value="Submit" />
							</div>
						</div>
					</div>
				</form>
				
			</div>
		</div>
		  <footer class="w3-container w3-padding-16 w3-light-grey"><br>
     <center>Copyrights © 2021. All rights reserved by Schwall Technology solutions LLP <a href="https://www.schwalltech.in/" target="_blank">Schwalltech</a></center>

  </footer>
	</div>
</body>
</html>