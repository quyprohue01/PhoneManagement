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
<link rel="stylesheet" href="assets/css/style.css">
<title>Shopee</title>
</head>
<section class="vh-100" style="background-color: rgb(238, 77, 45);">
	<div class="container py-5 h-100">
		<div
			class="row d-flex justify-content-center align-items-center h-100">
			<div class="col col-xl-10">
				<div class="card" style="border-radius: 1rem;">
					<div class="row g-0">
						<div class="col-md-6 col-lg-5 d-none d-md-block">
							<img
								src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/img1.webp"
								alt="login form" class="img-fluid"
								style="border-radius: 1rem 0 0 1rem;" />
						</div>
						<div class="col-md-6 col-lg-7 d-flex align-items-center">
							<div class="card-body p-4 p-lg-5 text-black">

								<form action="KiemTraDangNhapController">
									<div class="d-flex align-items-center mb-3 pb-1">
										<a href="HomePageController"><img alt=""
											src="ImagePhone/Shopee.png"> </a>
									</div>

									<h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Sign
										into your account</h5>

									<div class="form-outline mb-4">
										<input name="TenDN" type="email" id="form2Example17"
											class="form-control form-control-lg"
											placeholder="name@example.com" /> <label class="form-label"
											for="form2Example17">Email address</label>
									</div>

									<div class="form-outline mb-4">
										<input name="MatKhau" type="password" id="form2Example27"
											class="form-control form-control-lg" placeholder="Password" />
										<label class="form-label" for="form2Example27">Password</label>
									</div>

									<div class="pt-1 mb-4">
										<button class="btn btn-dark btn-lg btn-block" type="submit">Login</button>
									</div>
									<h4>
										<c:out value="${ktdn }"></c:out>
									</h4>
									<a class="small text-muted" href="#!">Forgot password?</a>
									<p class="mb-5 pb-lg-2" style="color: #393f81;">
										Don't have an account? <a href="DangKyController"
											style="color: #393f81;">Register here</a>
									</p>
									<a href="#!" class="small text-muted">Terms of use.</a> <a
										href="#!" class="small text-muted">Privacy policy</a>
								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>