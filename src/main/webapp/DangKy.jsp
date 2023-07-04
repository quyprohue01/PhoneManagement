<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="assets/css/reset.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="assets/fonts/themify-icons/themify-icons.css">
<link rel="stylesheet" href="assets/css/Resgiter.css">
<title>Shopee Fake</title>
</head>
<body>
	<section class="vh-100 bg-image"
		style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
		<div class="mask d-flex align-items-center h-100 gradient-custom-3">
			<div class="container h-100">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-12 col-md-9 col-lg-7 col-xl-6">
						<div class="card" style="border-radius: 15px;">
							<div class="card-body p-5">
								<h2 class="text-uppercase text-center mb-5">Create an
									account</h2>

								<form action="ktdk">
									<div class="form-outline mb-4">
										<input name="HoTen" type="text" id="form3Example1cg"
											class="form-control form-control-lg" /> <label
											class="form-label" for="form3Example1cg">Your Name</label>
									</div>

									<div class="form-outline mb-4">
										<input name="DiaChi" type="text" id="form3Example4cg"
											class="form-control form-control-lg" /> <label
											class="form-label" for="form3Example4cg">Your Address</label>
									</div>

									<div class="form-outline mb-4">
										<input name="SoDT" type="text" id="form3Example4cg"
											class="form-control form-control-lg" /> <label
											class="form-label" for="form3Example4cg">Your Phone
											Number</label>
									</div>

									<div class="form-outline mb-4">
										<input name="Email" type="email" id="form3Example3cg"
											class="form-control form-control-lg" /> <label
											class="form-label" for="form3Example3cg">Your Email</label>
									</div>

									<div class="form-outline mb-4">
										<input name="MatKhau" type="password" id="form3Example4cg"
											class="form-control form-control-lg" /> <label
											class="form-label" for="form3Example4cg">Password</label>
									</div>

									<div class="form-outline mb-4">
										<input name="MatKhaunhaplai" type="password"
											id="form3Example4cdg" class="form-control form-control-lg" />
										<label class="form-label" for="form3Example4cdg">Repeat
											your password</label>
										<p>
											<strong><c:out value="${ktdk }"></c:out> </strong>
										</p>
									</div>

									<div class="form-check d-flex justify-content-center mb-5">
										<input class="" type="checkbox" value="" id="form2Example3cg" />
										<label class="form-check-label" for="form2Example3g">
											I agree all statements in <a href="#!" class="text-body"><u>Terms
													of service</u></a>
										</label>
									</div>

									<div class="d-flex justify-content-center">
										<button type="submit"
											class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Register</button>
									</div>

									<p class="text-center text-muted mt-5 mb-0">
										Have already an account? <a href="DangNhapController"
											class="fw-bold text-body"><u>Login here</u></a>
									</p>

								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

</body>
</html>